package day29_CustomMethods;

// 1. create a method that can print odd numbers between 1~100

public class CustomMethods {
    public static void main(String[] args) {
        oddNumber();
        System.out.println("Hello");

        oddNumber();
        System.out.println("hello");

        evenNumbers();
        System.out.println("hello");

    }



    public static void oddNumber(){
       for(int i = 1; i<=100; i+=2 ){
           System.out.print(i +" ");
       }
        System.out.println();
    }
    //2. create a method that can print even numbers between 1~100

    public static void evenNumbers(){
        for(int i = 0; i <= 100; i+=2 ){
            System.out.print(i + " ");
        }
        System.out.println();
    }














}
