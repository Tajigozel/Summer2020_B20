package day16;
import java.util.Scanner;
/*6. write a program to ask the user enter two number and a math operator.
        ex:
        10
        20
        *
        output:
        200
        10
        2
        /
        output:
        5
        valid math operators are: *, / , +, -, %
        Nested If
*/
public class Calculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("enter your second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter your math operator: ");
        char operator = scan.next().charAt(0);
        boolean valid = operator == '*' || operator == '/' || operator == '+' || operator=='-' || operator == '%';

        if(valid){
            switch(operator){
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                    break;
                default:
                    System.out.println(num1 - num2);
            }


        }else{
            System.out.println("Invalid Operator");
        }






    }
}
