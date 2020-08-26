package day12_Switch_Scanner;

public class Switch_Practise1 {
    public static void main(String[] args) {
        int num = 3;
        String result = "";

        switch(num){
            case 1:
                result = "Monday";
                //System.out.println("Monday");
                break;
            case 2:
                result = "Tuesday";
                //System.out.println("Tuesday");
                break;
            case 3:
                result = "Wednesday";
                //System.out.println("Wednesday");
                break;
            case 4:
                result = "Thursday";
                //System.out.println("Thursday");
                break;
            case 5:
                result = "Friday";
                //System.out.println("Friday");
                break;
            case 6:
                result = "Saturday";
                //System.out.println("Saturday");
                break;
            case 7:
                result = " Sunday";
                //System.out.println("Sunday");
                break;
            default:
                result = "Invalid";
                //System.out.println("Invalid");
                break; // doesnt needed to give a break at the end of default

        }
        System.out.println(result);
    }
}
