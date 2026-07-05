/*
Java Iterations - Hands on 2
Factorials of input numbers

Write a program to read 5 numbers and print factorials of each. 
(Final answers should be non decimal numbers).
 
Input:
2
3
4
6
5
 
Output:
2
6
24
720
120
*/

public class J_009 {
    static int factorial(int i){
        if(i == 1) return 1;
        return i * factorial(i-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));       
    }
}