package day21_Loops;
import java.util.Scanner;
public class minAndMax {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int max = -999999999;
        int min =  999999999;


        for(int i = 1; i<=5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }

        }
        System.out.println("maximum number is: " + max);
        System.out.println("minimum number is: " + min);
    }
}
