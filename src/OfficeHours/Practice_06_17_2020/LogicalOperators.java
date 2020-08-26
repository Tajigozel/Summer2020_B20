package OfficeHours.Practice_06_17_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1= !true != true;
                //  false !=(does not equal true) != true ==> true
        System.out.println(r1);

        boolean r2 = !r1; //==> false
        System.out.println(r2);
        System.out.println(!!!!! false); //==> if ! odd number will return opposite
        System.out.println(!!!!!! true); // ==> if ! even number will return as it is

        System.out.println("==============================================");

        //||:
        boolean result1 = 9>10 || "Java" == "Java";
                       // false ||(or) true  ==> true
        System.out.println(result1);
        //&&:
        boolean result2 = "Java"!="Python" &&  "Muhtar" == "Good guy";
                      //   true && false  ==> false
        System.out.println(result2);



    }
}
