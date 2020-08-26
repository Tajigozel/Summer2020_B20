package day16;
import java.util.Scanner;

public class substrin_Practise {
    public static void main(String[] args) {
        //extra task
        String str = "I like to drink pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10,14+1);
        System.out.println(action);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String str1 = scan.next();//APPLE

        System.out.println("Enter your second word");
        String str2 = scan.next(); //Banana

        String result= str1.substring(1) + str2.substring(1);
        System.out.println(result);





    }
}
