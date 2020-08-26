package day08_logicalOperators;
// &&: and
public class Practices1 {
    public static void main(String[] args) {
        String firstName = "Guzel";
        String lastName = "Aka";
        String fullName = firstName + " " + lastName;
        int age = 12;
        String citizenShip = "USA";
        boolean eligibleToVote = age >= 18 && citizenShip == "USA" && firstName == "Guzel" && lastName == "Ak";
                              // 19 >= 18 && UAE == USA // false
        System.out.println(fullName + " is eligible to vote: " + eligibleToVote);


        // || : or, as long as one of the condition is correct it will return true
        boolean r8 = true == !false || false == true;
        System.out.println(r8);
        boolean r10 = !false == true && false == true;
        System.out.println(r10);


    }
}
