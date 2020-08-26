package day24_Arrays;

public class Uniques2 {
    public static void main(String[] args) {
        String str = "aabcc";
        String expectedResult = ""; //b
        for(int j = 0; j <= str.length()-1; j++){
            char ch1 = str.charAt(j); // a
            int count1 = 0; // 1+1

            for(int i = 0; i <= str.length()-1; i++){ //used for finding the frequence of ch and assign i
                char each = str.charAt(i);   // a a b c c
                if(ch1 == each){
                    count1 += 1;
                }
            }
            if(count1 == 1) { //if it only occured one time
                expectedResult += ch1;
            }
        }
        System.out.println(expectedResult);









    }
}
