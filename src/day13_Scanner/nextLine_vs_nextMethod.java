package day13_Scanner;
import java.util.Scanner;
public class nextLine_vs_nextMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//150000Enter

        System.out.println("Enter your salary: "); //1500000
        double salary = scan.nextDouble();
        scan.nextLine();//Enter line

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Salary: " + salary);
        System.out.println("Fullname: " + fullName);




    }
}
