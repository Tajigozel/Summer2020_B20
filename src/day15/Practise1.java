package day15;
import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next(); // Cybertek
        char ch1= firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName = input.next(); //School
        char ch2 = lastName.charAt(0);

        System.out.println("Your initial is: " + ch1 +"."+ ch2);
    }


}
