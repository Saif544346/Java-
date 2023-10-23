
import java.util.Scanner;








public class Foreach {
    public static void main(String[] args) {
        int[][]a=new int[2][3];
        int[][]b=new int[2][3];
        System.out.println("Enter digit for a metrix");
        Scanner input=new Scanner (System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=input.nextInt();
                
                
                
            }
            
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(""+a[i][j]);
                
            }
            System.out.println();
            
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j]=input.nextInt();
                
                
                
            }
            
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(""+b[i][j]);
                
            }
            System.out.println();
            
            
        }
        
    }
}
   