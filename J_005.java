//! Print last character of each word if it is not digit in a string.

import java.util.Scanner;

public class J_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String arr[] = str.split(" ");

        for(String i: arr){
            if(Character.isLetter(i.charAt(i.length()-1))){
                System.out.println(i.charAt(i.length()-1));
            }
        }
    }
}