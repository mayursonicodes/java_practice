/*
Java Arrays - Hands on 2 Problem 2:
Create class Book with below attributes:
 
id - int
title - String
author - String
price - double

Write getters, setters and parameterized constructor as required. 
 
Create class Solution with main method. 

Implement static method searchTitle
This method will take a parameter of String value along with other parameter as array of Book objects. 
It will return array of books where String value parameter appears in the title attribute (with case insensitive search).
 
This method should be called from main method and display id of returned objects in ascending order. 
 
Input:
4
1
hello world
aaa writer
50
2
World cup
bbb writer
55
3
Planet earth
ccc writer
45
4
India's history
ddd writer
40
WORLD
 
Output:
1
2
*/

import java.util.*;

class Book{
    int id;
    String title;
    String author;
    double price;

    Book(int a, String b, String c, double d){
        id = a;
        title = b;
        author = c;
        price = d;
    }
}

public class J_010 {
    static Book[] searchTitle(Book[] books, String title){
        title = title.toLowerCase();
        int size = 0;

        ArrayList<Book> list = new ArrayList<>();

        for(Book x: books){
            String words[] = x.title.toLowerCase().split(" ");
            for(String y: words){
                if(y.equals(title)){
                    size++;
                    list.add(x);
                    break;
                }
            }
        }

        Book ans[] = new Book[size--];

        for(Book x: list){
            ans[size--] = x;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        Book books[] = new Book[size];

        for(int i=0; i<size; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            books[i] = new Book(id, title, author, price);
        }

        sc.nextLine();
        String title = sc.nextLine();

        System.out.println("------------------------");
        System.out.println("Ans is:");

        Book ans[] = searchTitle(books, title);

        for(Book x: ans){
            System.out.println(x.id);
        }
    }
}