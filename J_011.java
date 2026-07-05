/*
Create a class Spotify with the below attributes:

spotifyId - int
profileName - String
subscriptionType - String 
subscriptionPrice - double
groupSessionAvailable - String

The above attributes should be private, write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static methods - findAvgSpotifySubsByType in Solution class.

findAvgSpotifySubsByType method:
This method will take three input parameters - array of Spotify objects and two String parameters.
The method will return the average subscriptionPrice of Spotify's(as a double value) from  array of Spotify objects for the given subscription type(String parameter passed) and groupSession available option(String parameter passed). 
If no Spotify with the above condition is present in the array of Spotify objects, then the method should return 0.0. 

For findAvgSpotifySubsByType method - The main method should print the returned average subscriptionPrice of Spotify's as it is, if the returned value is greater than 0, or it should print "There are no such Spotify Subscription".

Consider below sample input and output:
Testcase1:
Input:
1001
John
Yearly
1000
Yes
1002
Wick
Monthly
200
Yes
1003
Jack
Yearly
2000
Yes
1004
Jack
Monthly
199
No
Yearly
Yes

Output:
1500.0

Testcase2:
Input:
1001
John
Yearly
1000
Yes
1002
Wick
Monthly
200
Yes
1003
Jack
Yearly
2000
Yes
1004
Jack
Monthly
199
No
Yearly
No

Output:
There are no such Spotify Subscription
*/

import java.util.*;

class Spotify{
    private int spotifyId;
    private String profileName;
    private String subscriptionType;
    private double subscriptionPrice;
    private String groupSessionAvailable;

    Spotify(int a, String b, String c, double d, String e){
        this.spotifyId = a;
        this.profileName = b;
        this.subscriptionType = c;
        this.subscriptionPrice = d;
        this.groupSessionAvailable = e;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public String getGroupSessionAvailable() {
        return groupSessionAvailable;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }
}

public class J_011 {

    static double findAvgSpotifySubsByType(Spotify[] spotifies, String subType, String grpSession){
        double sum = 0;
        int count = 0;

        for(Spotify x: spotifies){
            if(x.getSubscriptionType().equalsIgnoreCase(subType) && x.getGroupSessionAvailable().equalsIgnoreCase(grpSession)){
                count++;
                sum += x.getSubscriptionPrice();
            }
        }
        return sum/count;
    }

    public static void main(String[] args) {

        //! Not written by me. 
        Scanner sc = new Scanner(System.in);
        Spotify[] spot = new Spotify[4];

        for(int i = 0;i< spot.length;i++){
            int spotifyId = sc.nextInt();
            sc.nextLine();
            String profileName = sc.nextLine();
            String subscriptionType = sc.nextLine();
            double subscriptionPrice = sc.nextDouble();
            sc.nextLine();
            String groupSessionAvailable = sc.nextLine();
            spot[i] = new Spotify(spotifyId, profileName, subscriptionType, subscriptionPrice, groupSessionAvailable);
        }

        String subscriptionTypeInput = sc.nextLine();
        String groupSessionAvailableInput = sc.nextLine();
        double average = findAvgSpotifySubsByType(spot,subscriptionTypeInput, groupSessionAvailableInput);

        if (average > 0)
            System.out.println(average);
        else
            System.out.println("There are no such Spotify Subscription");
    }
}