
package com.mycompany.ooplab;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("enter number:");
        num=input.nextInt();
        System.out.println("number="+num);
        String name;
        Scanner inp=new Scanner (System.in);
        
        System.out.println("enter your name::");
        name=inp.nextLine();
        System.out.println("Welcome "+name);
    }
    
}
