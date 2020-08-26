package day12_Switch_Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Months {
    public static void main(String[] args) {
        String month = "January";

        switch(month){
            case "January":
                System.out.println("# 1 month");
                break;
            case "February":
                System.out.println("#2 month");
                break;
            case "March":
                System.out.println("# 3 month");
                break;
            case "April":
                System.out.println("#4 month");
                break;
            case "May":
                System.out.println("#5 month");
                break;
            case "June":
                System.out.println("#6 month");
                break;
            case "July":
                System.out.println("#7 month");
                break;
            case "August":
                System.out.println("#8 month");
                break;
            case "September":
                System.out.println("#9 month");
                break;
            case "October":
                System.out.println("#10 month");
                break;
            case "November":
                System.out.println("#11 month");
                break;
            case "December":
                System.out.println("#12 month");
                break;
            default:
                System.out.println("Invalid");



        }
    }
}
