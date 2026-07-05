/*
Java Arrays - Hands on 1 Problem 2:
Sort Books by Price
 
Create class Book with below attributes:
id - int
title - String
author - String
price - double
 
Write getters, setters and parameterized constructor. 
 
Create class Solution with main method. 
 
Implement static method - sortBooksByPrice in Solution class.
This method will take a parameter as array of Book objects. 
It will return array of books which is sorted in ascending order of book price. Assume that no two books will have same price. 
 
This method should be called from main method and display values of returned objects as shared in the sample. 
 
Before calling this method, use Scanner object to read values for four Book objects referring attributes in the above sequence. 
 
Next call the method and display the result. 
 
Consider below sample input and output:
 
Input:
1
hello
writer1
50
2
cup
writer2
55
3
Planet
writer3
45
4
India
writer4
40
*/

import java.util.*;

class Book{
    int id;
    String title;
    String author;
    double price;
}

public class J_017 {

    static Book[] sortBooksByPrice(Book[] books){
        for(int i=0; i<books.length; i++){
            for(int j=i; j<books.length; j++){
                if(books[i].price > books[j].price){
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
        return books;
    }
    public static void main(String[] args) {
        
    }
}