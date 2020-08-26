package day23_Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {  // while the answer is invalid


            System.out.println("Enter two numbers");
            double num1 = scan.nextInt();
            double num2 = scan.nextInt();
            System.out.println("Enter the math operator");
            char o = scan.next().charAt(0);

            double result = (0 == '+')? num1 + num2 :(0=='-')? num1-num2 :(0=='*')? num1*num2
                    :(0=='/')? num1/num2 :(0=='%')? num1%num2 : 0;

            System.out.println(result);

            System.out.println("Do you want to continue?");
            String a = scan.next().toLowerCase();

            if(!(a.equals("yes") || a.equals("no"))){
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }
        }
        System.out.println("Thanks for using Cybertek calculator");





    }


}
