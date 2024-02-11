
package com.mycompany.ooplab;

import java.util.Scanner;

public class logicalAND {
    public static void main(String[] args) {
        System.out.println("Enter a charter");
        Scanner input=new Scanner(System.in);
        char ch;
        ch=input.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("Small charter");
        else if(ch>='A' && ch<='Z')
            System.out.println("Capital charter");
        else
            System.out.println("Invalid Charter");
        
        
    }
    
}
