package day05ArithmeticOperators;
/*        1. create a class named EmployeeInfo
                    declare the following variables:
                             firstName
                             lastName
                             gender
                             age
                             companyName
                             jobTitle
                             isFullTime
                             isMarried
                             salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50 */

public class EmployeeInfo {
    public static void main(String[]args){
    String firstName = "Guzel";
    String lastName = "Akmyradova";
    char gender = 'F';
    byte age = 35;
    String companyName = "Leidos";
    String jobTitle = "SDET";
    boolean isFullTime = true;
    boolean isMarried = true;
    double salary = 150_000.500;
    System.out.println("Employee' full name: "  + firstName + " " + lastName);
    System.out.println(firstName +" " + lastName + "' gender is: " + gender);
    System.out.println(firstName + " " +lastName + "' age is: " + age);
    System.out.println(firstName + " " + lastName + "' works at: " + companyName);
    System.out.println(firstName + " " + lastName + "' job title: " + jobTitle );
    System.out.println(firstName + " " + lastName + "' salary is: $" + salary);
    System.out.println(firstName + " " + lastName + "' is full time employee: " + isFullTime);
    System.out.println(firstName + " " + lastName + "' is married: " + isMarried);

    }


}
