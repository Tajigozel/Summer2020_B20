package day49_Inheritance.ScrumTeamTask;
/*
create a subclass of Employee called Tester
          Attributes:
          name, age, gender, Salary, ID, jobTitle

          Actions:
          work(), setInfo(), smokeTesting(), creatingTichet()
 */
public class Tester extends Employee{
    public Tester(String name, int age, char gender, double Salary, int ID, String jobTitle){
       setInfo(name, age, gender, Salary, ID, jobTitle);
    }
    public void smokeTesting(){
        System.out.println(name+" is running smoke Test, while drinking coffee!");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket on JIRA");
    }
}
