package day49_Inheritance.ScrumTeamTask;
/*
creat subclass of Employee called Developer
      Attributes: name, age, gender, Salary, ID, job title
      Actions: setInfo(), coding(), fixBug(), toString()
 */

public class Developer extends Employee{
    public Developer(String name, int age, char gender, double Salary, int ID, String jobTitle){
    }
    public void coding(){
        System.out.println(name+" is developing, while hitting his head to the wall");
    }
    public void fixBug(){
        System.out.println(name+" is fixing a Bug while cursing the Tester");
    }
}
