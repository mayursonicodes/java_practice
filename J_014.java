/*
Create a program to count the number of words present in a given string. Create class Solution with main method.  
Implement the below static method in Solution class. 
CountWords(String str): The method should take string as an input and return the total number of words in the string. If the input is null/empty, return 0. 
Constraints:   
• Words  are separated by one or more spaces.  
• Leading  and trailing whitespaces should be ignored.  
• Empty  string should return 0
*/

import java.util.*;

public class J_014 {

    static int CountWords_1(String str){
        if(str.length() == 0) return 0;

        int ans = 0;

        if(str.charAt(0) != ' ')
            ans++;
    
        for(int i=1; i<str.length(); i++){
            if((str.charAt(i) != ' ') && (str.charAt(i-1) == ' '))
                ans++;
        }
        return ans;
    }

    static int CountWords_2(String str){
        if(str.length() == 0) return 0;

        str = str.trim();

        String check[] = str.split("\\s+");
        
        return check.length;
    }

    public static void main(String[] args) {

        System.out.println(CountWords_1("  s   M a y  u     r soni  is    great"));
        System.out.println(CountWords_2("  s   M a y  u     r soni  is    great"));
        System.out.println(CountWords_2("mayur is great"));
    }
}