/*
Java Arrays - Hands on 1 Problem 1:
Find Docs with Odd Pages
 
Create class Document with below attributes

id - int
title - String
folderName - String
pages - int
 
Write getters, setters and parameterized constructor as required. 
 
Create class Solution with main method. 
 
Implement static method docsWithOddPages 
This method will take array of Document objects and return another array with Document objects which has odd number of pages.

This method should be called from main method and display values of returned objects as shared in the sample (in ascending order of id attribute). 
 
Input:
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40

Output (each line has values separated by single space):
2 question1 exams 55
3 question2 exams 45
*/

import java.util.*;

class Document{
    int id;
    String title;
    String folderName;
    int pages;

    Document(int a, String b, String c, int d){
        id = a;
        title = b;
        folderName = c;
        pages = d;
    }
}

public class J_013 {
    static Document[] docsWithOddPages(Document[] documents){
        int size = 0;
        for(Document x: documents){
            if(x.pages % 2 == 1)
                size++;
        }

        Document ans[] = new Document[size--];

        for(Document x: documents){
            if(x.pages % 2 == 1)
                ans[size--] = x;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}