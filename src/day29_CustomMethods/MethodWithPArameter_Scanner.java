package day29_CustomMethods;
import java.util.Scanner;


public class MethodWithPArameter_Scanner {
    public static void main(String[] args) {


        System.out.println("=======================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth year and current year");
        /*
        int birthYear = scan.nextInt();
        int currentYear = scan.nextInt();
    */
        age( scan.nextInt(), scan.nextInt()   );

    }



    public static void age(int birthYear , int currentYear){

        if(currentYear < birthYear){
            System.out.println("Invalid Entry");
        }else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }

    }








}
