package day08_logicalOperators;

public class Practices2 {
    public static void main(String[] args) {
        String firstName = "Connor";
        String lastName = "McGregor";
        String fullName = firstName + " " + lastName;
        int age = 20;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligibleAge = age >= 18;
        // 12 >= 18 ==> false
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        // "USA" == "USA" || "France" == "USA"
        //       true     ||        false         ==> true
        boolean eligibleToVote =  eligibleAge && usCitizen;
       //                           false     && true   ==>false
        System.out.println(usCitizen);
        System.out.println(eligibleToVote);
        System.out.println(fullName + " is eligibile to vote for Trump: " + eligibleToVote);
    }
}
