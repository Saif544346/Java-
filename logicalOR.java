
package com.mycompany.ooplab;

import java.util.Scanner;

public class logicalOR {
    public static void main(String[] args) {
       
        System.out.println("Enter a letter:");
        Scanner input=new Scanner(System.in);
        char ch;
        ch=input.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
            System.out.println("Vowel");
            
        }
        else{
            System.out.println("Consonant");
        }
        
        
    }
    
}
