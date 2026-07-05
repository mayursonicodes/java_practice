/*
Build a console application to manage the driver and truck related data. Each truck will have exactly one driver who will drive the truck. 

Create a class Truck with following attribute 
id: integer 
name: String 
totalMilesTraveledByTruck: Float 

Create a class Driver with following attribute 
id: integer 
name: String 
contact: String 
experience: Float 
 
Establish the relationship between the Truck and Driver. Create getters, setters, and parameterized constructors for the above classes. 

Create class Solution with the main method.  
Implement the below static method in Solution class 

getAllTruckWithDistance method:
This method accepts an array of Truck objects and an integer value representing the threshold distance as input parameters.
It returns an array of Truck objects whose total miles traveled is greater than or equal to the specified distance.
The resulting array must be sorted in descending order based on the associated driver’s experience. 
If no truck meets the specified distance criteria, the method should return null. 

Note:    
• A Truck must have exactly one associated Driver, and a driver cannot exist without a Truck. 
• If multiple drivers have the same experience value, the corresponding trucks should be ordered according to the original insertion order in the input array.

Sample input 1: 
4 
101 
EcoHaul 
2999.99 
11 
Arjun Nair 
9876500101 
3.0 
102 
CargoJet 
3000 
12 
Priya S 
9876500102
7.5 
103 
HighwayStar 
4500.5 
13 
Rohit Menon 
9876500103 
5.25 
104 
MetroLink 
3000.00 
14 
Nikita Rao 
9876500104 
9.0 
3000 

Sample output 1:
104 
MetroLink 
3000.0 
14 
Nikita Rao 
102 
CargoJet 
3000.0 
12 
Priya S 
103 
HighwayStar 
4500.5 
13 
Rohit Menon 
*/

import java.util.*;

class Truck{
    int id;
    String name;
    float totalMilesTraveledByTruck;
    Driver driver;

    Truck(int a, String b, float c, Driver d){
        id = a;
        name = b;
        totalMilesTraveledByTruck = c;
        driver = d;
    }

    public float getTotalMilesTraveledByTruck() {
        return totalMilesTraveledByTruck;
    }

    public Driver getDriver() {
        return driver;
    }
}

class Driver{
    int id;
    String name;
    String contact;
    float experience;

    Driver(int a, String b, String c, float d){
        id = a;
        name = b;
        contact = c;
        experience = d;
    }

    public float getExperience() {
        return experience;
    }
}

public class J_016 {

    static Truck[] getAllTruckWithDistance(Truck[] trucks, float distance){
        int size = 0;

        for(Truck x: trucks){
            if(x.getTotalMilesTraveledByTruck() >= distance)
                size++;
        }

        if(size == 0){
            return null;
        }

        Truck ans[] = new Truck[size];

        int index = 0;
        for(Truck x: trucks){
            if(x.getTotalMilesTraveledByTruck() >= distance)
                ans[index++] = x;
        }

        for(int i=0; i<index; i++){
            for(int j=i; j<index; j++){
                if(ans[i].getDriver().getExperience() < ans[j].getDriver().getExperience()){
                    Truck temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        return ans;        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int size = scanner.nextInt(); 
        Truck[] trucks = new Truck[size]; 

        for (int i = 0; i < size; i++) { 
            int id = scanner.nextInt(); 
            scanner.nextLine(); 
            String name = scanner.nextLine(); 
            float totalMiles = scanner.nextFloat(); 
            int did = scanner.nextInt(); 
            scanner.nextLine(); 
            String dname = scanner.nextLine(); 
            String dcontact = scanner.nextLine(); 
            float experiance = scanner.nextFloat(); 
            Driver driver = new Driver(did, dname, dcontact, experiance); 
            trucks[i] = new Truck(id, name, totalMiles, driver); 
        }

        float distance = scanner.nextFloat(); 
        Truck[] output = getAllTruckWithDistance(trucks, distance);

        System.out.println("-----------------------------------");
        System.out.println("Answer is:");

        if(output == null){ 
            System.out.println("No Truck Found"); 
        }
        else{ 
            for(Truck truck : output){ 
                System.out.println(truck.id); 
                System.out.println(truck.name); 
                System.out.println(truck.totalMilesTraveledByTruck); 
                System.out.println(truck.driver.id); 
                System.out.println(truck.driver.name); 
            } 
        } 
    }
}