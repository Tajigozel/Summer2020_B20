package day33_LocalDayTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practise2 {
    public static void main(String[] args) {
        String[] students = {"Kalbinur", "Virginia", "Guzel", "Ernis", "Isa"};
        LocalDate[] birthDays = {LocalDate.of(1982, 12, 26),
                LocalDate.of(1993, 11, 25),
                LocalDate.of(1984, 9, 9),
                LocalDate.of(1990, 2, 21),
                LocalDate.of(1982, 11, 28)
        };
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        //Odina: May/23/80 Monday
        for(int i =0; i<= students.length-1; i++){
            System.out.println(students[i]+" : "+birthDays[i].format(dateFormat));
        }
    }
}
