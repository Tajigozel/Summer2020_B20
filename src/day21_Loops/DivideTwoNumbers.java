package day21_Loops;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int count= 0;

        while(a >=b){
            a -= b;
            count++;
        }
        System.out.println(count + " with a reminder " + a );

    }
}


