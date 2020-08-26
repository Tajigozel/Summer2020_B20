package day09_iFStatement;

public class Alcohol {
    public static void main(String[] args) {
        boolean hasId= true;
        int age = 19;
        String result = "" ;

        boolean eligible = hasId && age >=21;
        //                true && false ==>false
        if(eligible == true){
            //System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }
        if(eligible == false){
            //System.out.println("Go buy your milk");
            result = "Go buy your milk";
        }
        System.out.println(result);
    }
}
