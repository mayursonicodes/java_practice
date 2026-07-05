//! Count number of spaces and characters in a string.

import java.util.Scanner;

public class J_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int s_count = 0, c_count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){ //! important condition
                c_count++;
            }
            else if(ch == ' '){
                s_count++;
            }
        }

        System.out.println("Number of spaces: "+s_count);
        System.out.println("Number of character: "+c_count);

    }
}