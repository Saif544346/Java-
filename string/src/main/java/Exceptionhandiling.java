
import java.util.Scanner;

public class Exceptionhandiling {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("enter a number ");
                int num1 = input.nextInt();

                System.out.print("enter second number ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result:" + num1 + "/" + num2 + "=" + result);
            } catch (Exception e) {
                System.out.println("Exception" + e);
                System.out.println("you must enter an integer number please try agin");
            }
        }
    }
}
