package day16;

public class Check_Words {
    public static void main(String[] args) {
        String str = "I like java";
        //last index = length -1
        //second last index = length - 2
        //third last index = length -3

        if(str.length() == 0){
            System.out.println("empty string");
        }else if(str.length()> 3){
            System.out.println(str.substring(str.length()-3));
        }else{
            System.out.println(str);
            //String result = (str.length()== 0) ? "empty string":(str.length() > 3)? str.substring(str.length()-3) : str;

            //ystem.out.println(result);

            System.out.println("====================================================");
            String str1 = "abcd";
            String str2 = "ab";
            String str3 = "abc";
            boolean allSame = str1.length() == str2.length() && str1.length() == str3.length();
            boolean allDifferent = str1.length() != str2.length() && str1.length() != str3.length() && str2.length() != str3.length();
            if(allSame){
                System.out.println("All words are same length");
            }else if(allDifferent){
                System.out.println("All words are different");
            }else{
                System.out.println("Not same nor different");

            }


        }
    }
}
