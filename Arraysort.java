
package com.mycompany.array;

import java.util.Arrays;


public class Arraysort {
    public static void main(String[] args) {
        int num[]={10,1,-45,34,50};
        Arrays.sort(num);
        for (int i = 0; i < 4; i++) {
            System.out.println("sorted array"+num[i]);
            
        }
        for (int i = 4; i >=0; i--) {
            System.out.println("desending"+num[i]);
            
        }
       String[]name={"s","a","x","w","q","l"};
       Arrays.sort(name);
        for (int i = 0; i < 5; i++) {
                 System.out.println("sorting char="+name[i]);
   
        }
    }
    
}
