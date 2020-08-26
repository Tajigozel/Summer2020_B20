package day08_logicalOperators;
/*
manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

*/

public class post_pre {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //      -200 + 200 * 200 % 2 == -200
        //      -200 + 40000 % 2 =>40000 - 20000 *2 = 40000 - 400000 = 0
        //      -200 + 0 = -200
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        //  z = 300 + 400 - 300 * 400 + 300 / 400
        //  z = 300 + 400 - 120 000 + 300 / 400 (0.75)
        System.out.println(z);



    }
}
