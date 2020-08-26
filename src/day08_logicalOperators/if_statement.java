package day08_logicalOperators;

public class if_statement {
    public static void main(String[] args) {
        int a = 2000;
        int b = 2000;

        if(a > b){
            System.out.println(a + " is the largest number");
        }
        if(b > a){
            System.out.println(b + " is the max number");
        }
        if(a == b){
            System.out.println("Both are equal");
        }
        System.out.println("=================================");

        boolean breakTime = false;
        if(breakTime == true){
            System.out.println("Take 15 min break");
        }
        if (breakTime == false){
            System.out.println("Keep Studing");
        }
        System.out.println("=================================");
        boolean Corona = true;
        if(Corona == true){
            System.out.println("Stay at home!");
            System.out.println("Wash your hands!");
        }


    }
}
