package day08_logicalOperators;

public class Logical {
    public static void main(String[] args) {
        //!: opposite boolean in return and applies only to boolean
        boolean r1 = 9 > 7; //true
        boolean r2 = !r1; // false
        System.out.println(r1 + " : " + r2);
        System.out.println(!true); // false
        System.out.println(!false); // true

        boolean r3 = !false == true; // true == true ==>true
        System.out.println(r3);

        boolean r4 = true == !true; // true == false ==> false
        System.out.println(r4);

        //&& : in order to return true both statements MUST be true

        boolean r5 = 9 > 5 && 9 >10;
              //r5 = true && false



    }
}
