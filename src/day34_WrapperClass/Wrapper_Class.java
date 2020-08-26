package day34_WrapperClass;

import java.util.Arrays;

public class Wrapper_Class {
    public static void main(String[] args) {

        Integer num = 100;
        int a = 100;

        byte t = 100;
        int z = t;
        //Integer z2 = t;

        Byte b1 =50;
        int n1 = b1;

        byte b2 = 40;
        //Integer
        Integer n3 = new Integer(123);
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));

        int p1 = 300;
        Integer p2 = p1; // Autoboxing

        Integer q1 = 500;
        int q2 = q1;    // unboxing

        Double r1 = 300.0; //Wrapper class is only dedicated to it's primitive
        double r2 = 300;

        Float f1 = 100.5f;
        Float f2 = f1;
    }
}
