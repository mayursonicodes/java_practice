/*
Conditional Operands - Hands on 1
Compare 2D points for distance from origin

Write a program to check distance of 2D points from origin and print the point with highest distance. 
Create class Point with attributes

double x 
double y
 
In Solution class, define main method to read values for three point objects. 

Next, create below method in Solution class which will take three point objects as input parameters and return the point with highest distance from origin. 
 
public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3)
 
Input: 
2
2
3
3
-4
-4
 
Output:
-4.0 
-4.0
*/

class Point{
    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

public class J_007 {
    static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3){

        Point ans = p1;
        double distance = Math.sqrt(Math.pow(p1.x, 2) + Math.pow(p1.y, 2));

        if(Math.sqrt(Math.pow(p2.x, 2) + Math.pow(p2.y, 2)) > distance){
            distance =  Math.sqrt(Math.pow(p2.x, 2) + Math.pow(p2.y, 2));
            ans = p2;   
        }

        if(Math.sqrt(Math.pow(p3.x, 2) + Math.pow(p3.y, 2)) > distance){
            distance =  Math.sqrt(Math.pow(p2.x, 2) + Math.pow(p2.y, 2));
            ans = p3;
        }

        return ans;
    }

    public static void main(String[] args) {

        Point p1 = new Point(2, 2);
        Point p2 = new Point(3, 3);
        Point p3 = new Point(-4, -4);

        Point ans = pointWithHighestOriginDistance(p1, p2, p3);
        System.out.println(ans.x);
        System.out.println(ans.y);
    }
}