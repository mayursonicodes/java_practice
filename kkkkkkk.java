import java.util.Scanner;

class Hotel{
    private int hotelId;
    private String hotelName;
    private String dateOfRoomsBooked;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;
    
    public Hotel(int hotelId, String hotelName, String dateOfRoomsBooked, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfRoomsBooked = dateOfRoomsBooked;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }
    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }
    public String getHotelName() {
        return hotelName;
    }
    public String getDateOfRoomsBooked() {
        return dateOfRoomsBooked;
    }
    public String getWifiFacility() {
        return wifiFacility;
    }
    public double getTotalBill() {
        return totalBill;
    }
}

public class kkkkkkk {
    static int noOfRoomsBookedInGivenMonth(Hotel a[], String dateOfBook){
        int ans_count = 0;

        for(Hotel hl: a){
            String month[] = hl.getDateOfRoomsBooked().split("-");
            if(month[1].equalsIgnoreCase(dateOfBook)){
                ans_count += hl.getNoOfRoomsBooked();
            }
        }

        return ans_count;
    }

    static Hotel searchHotelByWifiOption(Hotel a[], String wifiFacility){
        Hotel first_highest = null;
        Hotel second_highest = null;

        for(Hotel hl: a){
            if(hl.getWifiFacility().equalsIgnoreCase(wifiFacility)){
                if(first_highest == null || first_highest.getTotalBill() < hl.getTotalBill()){
                        second_highest = first_highest;
                        first_highest = hl;
                }
                else if(second_highest == null || second_highest.getTotalBill() < hl.getTotalBill()){
                    second_highest = hl;
                }
            }
        }
        return second_highest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel a[] = new Hotel[4];

        for(int i=0; i<4; i++){
            int hotelId = sc.nextInt();
            sc.nextLine();
            String hotelName = sc.nextLine();
            String dateOfRoomsBooked = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String wifiFacility = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            a[i] = new Hotel(hotelId, hotelName, dateOfRoomsBooked, noOfRoomsBooked, wifiFacility, totalBill);
        }

        String dateOfBook = sc.nextLine();
        String wifiFacility = sc.nextLine();

        int method1 = noOfRoomsBookedInGivenMonth(a, dateOfBook);
        if(method1 == 0) System.out.println("No rooms booked in the given month");
        else System.out.println(method1);

        Hotel method2 = searchHotelByWifiOption(a, wifiFacility);
        if(method2 == null) System.out.println("No such option available");
        else System.out.println(method2.getHotelId());   
    }
}