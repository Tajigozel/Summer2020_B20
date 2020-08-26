package day11_NestedIf_Switch;
/* 90 - 100 ==> A

 */

public class NestedId {
    public static void main(String[] args) {
        int score = 100;
        String result = "";
        if(score >= 0 && score <= 100){
            if(score >= 90){
                result = "A";
            }else if(score >= 80){
                result = "B";
            }else if(score >= 70){
                result = "C";
            }else if(score >= 60){
                result= "D";
            }else{
                result = "Invalid";
            }
        }else{
            result = "Keep trying";
        }
        System.out.println(result);





    }
}
