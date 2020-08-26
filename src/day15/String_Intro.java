package day15;

public class String_Intro {

    public static void main(String[] args) {

        String d1 = "Dog";//String literal
        String d2 = "dog";//String literal

        System.out.println(d1 == d2);

        String s1 = "Cat";//String literal
        String s2 = "Cat";//String literal
        System.out.println(s1 == s2);
                         //cat == ct  ==> true
        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println(t1 == t2);
        // new String("Tiger") == new String("Tiger") ==>false
        System.out.println("================================================");
        String c1 = "Cybertek";//String literal (Stringpool=> Special memory location)
        String c2 = new String("Cybertek");// stores in the heap
        String c3 = new String("Cybertek");
        String c4 = "Cybertek";
        String c5 = "cybertek"; //lowercase totally different word


        System.out.println(c1 == c2);// false
        //"Cyberte" == new Sring("Cybertek")

        System.out.println(c2 == c3); // false
        //new String("Cybertek") == new String("Cybertek");

        System.out.println(c1 == c4); //true
        // Cybertek == Cybertek

        System.out.println(c4 == c5);
        // "Cybertek == "cybertek"

        System.out.println("==========================================");
        String str1 = "Java";
        str1 = "JavaScript";
        System.out.println(str1); // JavaScript

        str1 = "Java";
        System.out.println(str1); // Java




    }
}
