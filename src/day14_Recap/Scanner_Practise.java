package day14_Recap;
/*task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
import java.util.Scanner;

public class Scanner_Practise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Enter
        System.out.println("Enter your gender");
        String gender = scan.next(); // female

        System.out.println("Enter your age: ");
        int age = scan.nextInt();//19
        scan.nextLine(); //Enter Enter

        System.out.println("Enter your country name: ");
        String countryName = scan.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipCode = scan.nextInt(); ///12345
        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();



    }
}
