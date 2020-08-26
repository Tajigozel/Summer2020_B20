package day39_CustomClass;

public class Employee {
    /*
    Attributes:
    employeeName, gender, SSN, employeeID, JobTitle, Slalary
     */

    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender, String employeeSSN, String employeeJobTitle, double employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name : "+name+", Gender: " + gender+", Job Title: "+jobTitle+", Salary: "+salary);
        String ssn = ""+SSN;
        System.out.println("SSN last four digits: "+ssn.substring(ssn.length()-4));
    }





}
