//! Remove duplicate from string

import java.util.Scanner;

public class J_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String ans = "";

        for(int i=0; i<str.length(); i++){
            if(ans.indexOf(str.charAt(i)) == -1){ //! indexOf(i) gives the first occurance index of the "i" in the string.
                ans += str.charAt(i);
            }
        }

        System.out.println(ans);

    }
}