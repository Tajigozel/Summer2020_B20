package day17;

public class Pool_vs_Heap {
    public static void main(String[] args) {
        String s1 = "Cybertek"; //String pool
        String s2 = "Cybertek"; // String pool
        String s3 = new String("Cybertek"); //Heap
        String s4 = new String("Cybertek"); //Heap
        String s5 = "cybertek"; //String pool


        System.out.println(s1 == s2);// true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);// false
        System.out.println(s5 == s2); //false
        System.out.println(s5 == s1); // false

        String str = "Hello World";
        str.trim();
        int z = str.indexOf(" ");
        System.out.println(z);




        
    }
}
