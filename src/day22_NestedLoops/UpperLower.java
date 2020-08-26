package day22_NestedLoops;
import java.util.Scanner;
/*Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2
*/

public class UpperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();
        char ch1 =  word.charAt(0);
        char ch2 = word.charAt(word.length()- 1);

        boolean start = ch1 >= 'A' && ch1 <= 'Z';  //Upper case characters
        boolean end = ch2 >= 'a' && ch2 <= 'z';   // Lower case characters
        System.out.println(start && end);

    }
}
