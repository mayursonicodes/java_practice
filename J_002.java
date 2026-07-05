//! Find total number of small letters in string.

import java.util.Scanner;

public class J_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int count = 0;

        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i) >= 'a' && str.charAt(i) <='z'){
        //         count++;
        //     }
        // }

        for(char ch: str.toCharArray()){ //! Convert string to array so that it can be access using forEach loop.
            if(ch >= 'a' && ch <='z'){
                count++;
            }
        }

        System.out.println("Total occurance: "+count);
    }
}