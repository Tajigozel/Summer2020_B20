package day05ArithmeticOperators;

public class Practise {
    public static void main(String[] args){
        int a = 5+2*4;//13
        System.out.println(a);
        int b = 10/ 2 - 3; //2
        System.out.println(b);
        int c = 8 + 12 * 2 - 4; //28
        System.out.println(c);
        int d = 4 + 17 % 2 - 1; // 17/2=8 17-(2*8)=17-16=1
        //4+1-1=4 //4 result
        System.out.println(d);
        System.out.println(5 + 5 / 5);//6
        System.out.println((5 + 5) / 5); //2
        System.out.print( (5 + 5) / 5.0); //2.0

        double y = 5 * 2 / 3 + (4 * 3);
        // 5*2/3+12 => 10 / 3 + 12 => 3+12=15
        System.out.println(y);




    }
}
