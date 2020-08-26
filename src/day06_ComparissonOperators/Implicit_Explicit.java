package day06_ComparissonOperators;

public class Implicit_Explicit {
    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1; // of implicit casting => Automatically done

        long l2 = (long)s1; // manually casting implicit casting
        int I1 = 300;
        double D1 = I1;
        System.out.println(D1);
        double D2 = (double) I1;
        System.out.println("==================================================");
        double d1 = 400.55555;
        int i1 = (int)d1; // 400
        System.out.println(i1);

        long L1= 4400;
        short sh1 = (short)L1; //manually explicit to the short
        System.out.println(sh1);

        double m1 = 34.5;
        float f1 = (long) m1;

        System.out.println(f1);

        long r1 = -500;
        int p1 = (short)r1;
        System.out.println(p1);


    }
}
