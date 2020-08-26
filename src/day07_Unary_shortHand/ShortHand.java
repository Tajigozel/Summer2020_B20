package day07_Unary_shortHand;

public class ShortHand {
    public static void main(String[] args) {
        int a = 100;
        a *= 100;// a = a*a
        System.out.println(a);

        int b = 2;
        b *= 3; // b = b * 3;
        System.out.println(b);

        int c = 300;
        c -= 300;
        System.out.println(c);
        System.out.println("================================");

        int d = 300;
        d += 200; // d = d + 200
        System.out.println(d);

        String schoolName = "Cybertek";
        // schoolName = school + "School";
        schoolName += "School";
        System.out.println(schoolName);

        String name = "Mickey";
        name += "Mause";
        System.out.println(name);

        int e = 100;
        e /= 2;
        System.out.println(e);

        //%
        int num = 100;
        num %= 3;
        System.out.println(num);

        double num2 = 400.5;
        num2 %= 2;
        System.out.println(num2);
    }
}
