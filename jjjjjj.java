import java.util.*;

class Laptop{
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    Laptop(int laptopId, String brand, String osType, double price, int rating){
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getLaptopId() {
        return laptopId;
    }
    public String getBrand() {
        return brand;
    }
    public String getOsType() {
        return osType;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
}

public class jjjjjj {
    static int countOfLaptopsByBrand(Laptop a[], String brand){
        int count = 0;
        for(Laptop lp: a){
            String each_brand = lp.getBrand();
            if(each_brand.equalsIgnoreCase(brand) && lp.getRating() > 3){
                count++;
            }
        }
        if(count == 0) return 0;

        return count;
    }

    static Laptop[] searchLaptopByOsType(Laptop a[], String OS){
        int count = 0;
        for(Laptop lp: a){
            if(lp.getOsType().equalsIgnoreCase(OS)){
                count++;
            }
        }
        
        if(count == 0) return null;
        
        Laptop ans_arr[] = new Laptop[count];
        int index = 0;
        
        for(Laptop lp: a){
            if(lp.getOsType().equalsIgnoreCase(OS)){
                ans_arr[index++] = lp;
            }
        }

        for(int i=0; i<ans_arr.length-1; i++){
            for(int j=i+1; j<ans_arr.length; j++){
                if(ans_arr[i].getLaptopId() < ans_arr[j].getLaptopId()){
                    Laptop temp = ans_arr[i];
                    ans_arr[i] = ans_arr[j];
                    ans_arr[j] = temp;
                }
            }
        }

        return ans_arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptop a[] = new Laptop[4];

        for(int i=0; i<4; i++){
            int laptopId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String osType = sc.nextLine();
            double price = sc.nextDouble();
            int rating = sc.nextInt();
            sc.nextLine();

            a[i] = new Laptop(laptopId, brand, osType, price, rating);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int method1 = countOfLaptopsByBrand(a, brand);
        if(method1 == 0) System.out.println("The given brand is not available");
        else System.out.println(method1);

        Laptop ans[] = searchLaptopByOsType(a, os);
        if(ans == null) System.out.println("The given os is not available");
        else{
            for(Laptop lp: ans){
                System.out.println(lp.getLaptopId());
                System.out.println(lp.getRating());
            }
        }   
    }
}