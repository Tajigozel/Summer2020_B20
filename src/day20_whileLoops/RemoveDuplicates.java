package day20_whileLoops;
/* 3. write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc

 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabb"; // "ab"
        // 0123
        String result= "";

        for(int i = 0; i <= str.length()-1; i++){
            String s = "" + str.charAt(i); // a, a, b, b

            if(!result.contains(s) ){
                result += s;  // if the character is already contained in the result, we will not add it
            }


        }
        System.out.println(result);


    }
}
