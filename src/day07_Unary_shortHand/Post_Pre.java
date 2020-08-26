package day07_Unary_shortHand;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Post_Pre {

    public static void main(String[] args) {
    int a = 10;
        System.out.println(++a);//11
        System.out.println(a);//11

        System.out.println("========================");

        int b = 10;
        System.out.println(b++); //10
        System.out.println(b); //11

        System.out.println("=========================");

        int c = 25;
        int d = c++; //d=25
//c=26
        System.out.println(c);
        System.out.println(d);

        System.out.println("===========================");

        int x = 8;
        int y = x--;
        System.out.println(y); //8
        System.out.println(x); //7
        System.out.println("==============================");

        int A = 1;
        A = -A-- + A++ / -A-- * --A;
        // A = -1 + 0 / -1 * -1; == -1
        //A = -1+   0 * -1
        //A= -1 + 0
        System.out.println(A);
        System.out.println("=========================================");

        int r = 50;
        r = --r + r++ + r-- + r++;
        // r = 49 + 49 + 50 + 49;
        // r = 98+99 = 197
        System.out.println(r);

        System.out.println("===========================================");

        int t = 4;
        int s = t * 4 - t++;
        // s= 4 * 4 - 4 = 16-4 = 12
        System.out.println(s);
    }
}
