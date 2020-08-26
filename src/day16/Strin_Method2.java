package day16;

public class Strin_Method2 {
    public static void main(String[] args) {
        //Empty():
        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String name2 = "";
        System.out.println(name2.isEmpty());

        String str1= "Java"; // String pool
        String str2 = new String("Java"); // heap

        System.out.println(str1 + " : " + str2);
        System.out.println(str1 == str2);// false because in the heap storage
        System.out.println(str1.equals(str2));//true

        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6); //true because it is in the pool
        System.out.println(str5.equals(str6)); // true

        //equalsIgnoreCase():

        String str7 = "Yes";
        String str8 = "yes";

        System.out.println(str7.equals(str8));//false
        System.out.println(str7.equalsIgnoreCase(str8));//true

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4)); //true

        //startsWith():

        String s1 = "Guzel";
        System.out.println(s1.startsWith("G")); // true
        System.out.println(s1.startsWith("M")); // fasle

        System.out.println(s1.startsWith("Gu")); //true
        System.out.println(s1.toLowerCase().contains("gu"));//true

        //contains:
        String str = "I like to learn java programming language";
        System.out.println(str.contains("python"));//false
        System.out.println(!str.contains("python")); //true









    }
}
