package OfficeHours.Practice_07_28_20;

public class Method_Practice {
    //Access - Modifier Specifier Return-type Name(Parameter){Statements}

    public static void main(String[] args) {
        String name= "Muhtar";
        String reverseName = reverseStr(name);

        System.out.println(reverseStr(name));
        System.out.println(reverseName);
        System.out.println(reverseName.toUpperCase());

        isPalindrome("Level");
        isPalindrome(name);
    }

    public static String reverseStr(String str){ //ABC
        String result = ""; //CBA
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i); //C B A
        }

        return result;
    }

    public static void isPalindrome(String str){
        String reversedStr = reverseStr(str);
        boolean palindrome = str.equalsIgnoreCase(reversedStr);

        System.out.println(palindrome ? str+" Is Palindrome" : str+" Is Not Palindrome");
    }


}
