package day15;
import java.util.Scanner;
public class Practise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String firstName = input.next();//cybertek

        System.out.println("Enter your full name: ");
        String lastName = input.next();//cybertek school

        String fullName = firstName + " " + lastName;

       fullName =  fullName.toUpperCase(); //CYBERTEK SCHOOL
        System.out.println(fullName);



    }


}
