package day12_Switch_Scanner;

public class Switch_Practise2 {
    public static void main(String[] args) {

        String productName = "MacBook";

        switch(productName){
            case "Galaxy":
                System.out.println("Samasung");
                break;
            case"iphone":
            case "MacBook":
                System.out.println("Apple");
                break;
            default:
                System.out.println("invalid");



        }
    }
}
