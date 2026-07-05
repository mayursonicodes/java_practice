//! Print if the first character of each word is vowel in a string.

import java.util.Scanner;

public class J_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String arr[] = str.split(" ");

        for(String i: arr){
            i = i.toLowerCase();
            if(i.startsWith("a") || i.startsWith("e") || i.startsWith("i") || i.startsWith("o") || i.startsWith("u")){
                System.out.println(i.charAt(0));
            }
        }
    }
}