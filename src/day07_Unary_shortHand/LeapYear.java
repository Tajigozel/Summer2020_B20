package day07_Unary_shortHand;
/*    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
            */



public class LeapYear {
    public static void main(String[] args) {
        int year = 2021;
        boolean result = year % 4 == 0;
        System.out.println("2021 is a Leap year: " + result);
    }
}
