package day31_Recap;
import library.Util;
public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCCCCDDDD"; // ==>A3B2C4D4
        String expectedResult = "";
        String nonDup = Util.removeDup(str);

     /*   for(int i=0; i<=nonDup.length()-1; i++){

            char ch = nonDup.charAt(i);
            int count = Util.frequency(str, ch);
            expectedResult += ""+ ch + count;
        } */
     // for loops method


        for(char each:nonDup.toCharArray()){
            int count = Util.frequency(str, each);
            expectedResult += "" + each +count;
        }
     // for each method

     /*   char ch = nonDup.charAt(0);
        int count = Util.frequency(str, ch);
        expectedResult += "" +ch + count;

        char ch1 = nonDup.charAt(1);
        int count1 = Util.frequency(str, ch1);
        expectedResult += "" +ch1+count1;

        char ch2 = nonDup.charAt(2);
        int count2 = Util.frequency(str, ch2);
        expectedResult += "" +ch2+count2; */
     // regular method
        System.out.println(expectedResult);
        System.out.println("===========================");

        String str2 = "wwwwwweeeeeeerrrrrrllllldddd";
        String expectedResult2 = frequencyOfChars(str2);
        System.out.println(expectedResult2);
    }

    public static String frequencyOfChars(String str){
        String expectedResult = "";
        String nonDup = Util.removeDup(str);

        for(char each:nonDup.toCharArray()){
            int count = Util.frequency(str, each);
            expectedResult += "" + each +count;
        }
        return expectedResult;
    }




}
