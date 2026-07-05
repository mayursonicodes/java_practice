//! Find the index of the char in a string.

import java.util.Scanner;

public class J_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter char: ");
        char ch = sc.nextLine().charAt(0);

        for(int i=0; i<str.length(); i++){ //! In string, use length() & In array, use length
            if(str.charAt(i) == ch){ //! charAt() is used to access the value at a specfic index.
                System.out.println("Found at index: "+i);
                break;
            }
        }
    }
}