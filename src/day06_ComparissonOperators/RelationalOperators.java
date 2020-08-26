package day06_ComparissonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10 > 9;
        System.out.println(r1);

        boolean r2 = 100 < 9000;
        System.out.println(r2);
        // >= greater or equal
        boolean r3 = 87 >= 85;
        System.out.println(r3);

        // == equal
        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);
        boolean r8 = "Guzel" == "guzel";
        System.out.println(r8);
        boolean r9 = 'A' == 65; // Ascii table letter
        System.out.println(r9);
        boolean r10 = 100 == 100.0; // $100 is $100.0
        System.out.println(r10);

        // !=
        boolean r11 = "Muhtar" != "Bad guy";
        System.out.println(r11);

        int number = 100;
        boolean even = number%2 == 0;
        boolean odd = number%2 != 0;
        System.out.println(even);
        System.out.println(odd);

    }


}
