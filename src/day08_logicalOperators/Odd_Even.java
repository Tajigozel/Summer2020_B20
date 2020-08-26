package day08_logicalOperators;

public class Odd_Even {
    public static void main(String[] args) {
        int num = 101;
        boolean even = num % 2 == 0;
        boolean odd = !even;
        if(even){
            System.out.println("Even Number");
        }
        if(odd){
            System.out.println("Odd Number");
        }
    }
}
