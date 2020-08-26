package day04;

public class variables_practices5string {
    public static void main(String[] args){
        //school name: Cybertek School
        String schoolName = "Cybertek School";
        System.out.println(schoolName);
        /*declare the following variables:
        employeeName
        employeeId
        jobTitle
        salary
        gender(char)
         */
        System.out.println("========================================");
        String employeeName = "Guzel";
        int employeeID = 99999;
        String jobTitle = "SDET";
        double salary = 150_000.50;
        char gender = 'F';
        boolean isFullTime = true;
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary + " USD");
        System.out.println("Gender: " + gender);
        System.out.println("Is Full Time: " + isFullTime);

    }
}
