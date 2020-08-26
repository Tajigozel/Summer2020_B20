package day32_MethodOverloading;
/*tasks1:
    1. create a method that can find the addition of two numbers
                        addition2Numbers
    2. create a method that can find the addition of three numbers
                        addition3Numbers
    3. create a method that can find the addition of four numbers
                        addition4Numbers
 */

public class Method_Overleading2 {
    public static void main(String[] args) {
        addition2Numbers(10,20);
        addition3Numbers(35,48,39);
        addition4Numbers(87,74,98,45);

        System.out.println("===========================================");

        addition(10,30);
        addition(35, 49,30);
        addition(76, 98,100, 300);


    }



    public static void addition2Numbers(double a, double b){
        System.out.println(a+b);
    }
    public static void addition3Numbers(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public static void addition4Numbers(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }
    //==============================================================================
    public static void addition(double a, double b){
        System.out.println(a+b);
    }

    public static void addition(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public static void addition(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }





}
