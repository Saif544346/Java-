
package com.mycompany.ooplab;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int num1,num2,result;
        System.out.println("Enter firts number:");
        Scanner input=new Scanner (System.in);
        num1=input.nextInt();
        System.out.println("Enter second number:");
        Scanner input2=new Scanner (System.in);
        num2=input2.nextInt();
        result=num1+num2;
        System.out.println("sum="+result);
        result=num1-num2;
        System.out.println("sub="+result);
        result=num1/num2;
        System.out.println("div="+result);
        result=num1*num2;
        System.out.println("mul="+result);
        
    }
    
}
