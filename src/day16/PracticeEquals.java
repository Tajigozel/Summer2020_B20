package day16;
import java.util.Scanner;
public class PracticeEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employees?");
        String answer = scan.next();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }

    }






}
