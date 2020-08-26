package day05ArithmeticOperators;

public class EmployeeInfo2 {
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
        String fullName = firstName +" " + lastName;

        System.out.println("Employee' full name: "  + fullName);
        System.out.println(fullName + "' gender is: " + gender);
        System.out.println(fullName + "' age is: " + age);
        System.out.println(fullName + "' works at: " + companyName);
        System.out.println(fullName + "' job title: " + jobTitle );
        System.out.println(fullName + "' salary is: $" + salary);
        System.out.println(fullName + "' is full time employee: " + isFullTime);
        System.out.println(fullName + "' is married: " + isMarried);

    }
}
