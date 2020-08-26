package day29_CustomMethods;

public class Eligibility {
    public static void main(String[] args) {
        eligibility(true, 16);

        calculator(100, '*', 20);
    }


    public static void eligibility(boolean hasId, int age){
        if(hasId && age >=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }

    public static void calculator(double num1, char operator, double num2){
        // +, -, *, /, %
        switch(operator){
            case'+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case'-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case'*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case'/':
                System.out.println("Division: "+(num1/num2));
                break;
            case'%':
                System.out.println("Remainder: "+(num1%num2));
            default:
                System.out.println("Invalid");
        }
    }









}
