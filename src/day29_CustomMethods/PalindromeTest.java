package day29_CustomMethods;



public class PalindromeTest {
    /*
    kayak ==> kayak   true
    Java  ==> avaJ    false
     */


    public static void main(String[] args) {
        palindrome("Alla");
    }

    public static void palindrome(String name){
        String reverse="";
        for(int i = name.length()-1; i >=0; i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse.equalsIgnoreCase(name));


    }












}
