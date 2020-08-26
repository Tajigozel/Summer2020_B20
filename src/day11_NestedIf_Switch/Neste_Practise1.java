package day11_NestedIf_Switch;

public class Neste_Practise1 {
    public static void main(String[] args) {
        double salary = 120000;
        int jobHistory = 2;

        if(salary >= 30000){
            if(jobHistory >= 2){
                System.out.println("You are qualified");
            }else{ //jobHistory < 2
                System.out.println("You must have been on job at least 2 years");
            }


        }else{
            System.out.println("You MUST earn at least $30K");
        }


    }





}
