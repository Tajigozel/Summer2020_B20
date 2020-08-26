package day29_CustomMethods;

public class EligibilityToVote {
    /*
    age, citizen, name
     */
    public static void main(String[] args) {
        vote("John", 28, true, "Biden");
        vote("Ryan", 17, false, "Trump");
    }



    public static void vote(String name, int age, boolean citizen, String candidateName ){
        boolean EligibleToVote= age >=18 && citizen == true;
        if(EligibleToVote){
            System.out.println(name + " is eligible to vote" + candidateName);
        }else{
            System.out.println(name+ " is not a eligible to vote");
        }
    }











}
