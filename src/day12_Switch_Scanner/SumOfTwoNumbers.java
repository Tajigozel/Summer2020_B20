package day12_Switch_Scanner;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = scan.nextInt();
        System.out.println("Enter your second number");
        int b = scan.nextInt();

        System.out.println("Sum of those two numbers are: " + (a + b));

    }
}
