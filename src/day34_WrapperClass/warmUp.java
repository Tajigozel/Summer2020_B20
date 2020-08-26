package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 1. use LocalDate& Time to get the current date and time in the following format:
   Sunday, 10:28 Am, Jul/26/2020
 */
public class warmUp {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        System.out.println(today.format(dtf));
    }

}
