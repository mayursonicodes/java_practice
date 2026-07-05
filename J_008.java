/*
Java Iterations - Hands on 1

Write main method in Solution class.
The method will read a String value and print the minimum valued character (as per alphabet and ASCII sequence). 
   
Input: 
HellO
 
Output:
H

Important: Answer is not 'e' since 'H' has lower ASCII value then 'e'
*/

public class J_008 {
    static char minValueChar(String word){
        int minCharValue = word.charAt(0);
        char ans = (char)minCharValue;
        
        char letters[] = word.toCharArray();

        for(char x: letters){
            if(x < (char)minCharValue)
                ans = x;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minValueChar("Hello"));
    }
}