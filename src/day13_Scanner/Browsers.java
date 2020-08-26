package day13_Scanner;

public class Browsers {
    public static void main(String[] args){
        String browserName = "chrome";
        //boolean, long, double, float

        switch(browserName){
            case "chrome":
                System.out.println("Opening Chrome Browser");
                break;
            case "firefox":
                System.out.println("Opening Firefox Browser");
                break;
            case "opera":
                System.out.println("Opening Opera Browse");
                break;
            case "safari":
                System.out.println("Opening Safari Browser");
                break;
            case "edge":
                System.out.println("Opening edge");
                break;
            default:
                System.out.println("Invalid Browser");
        }





    }

}
