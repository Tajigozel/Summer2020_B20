package day28_Recap;
/* 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour
*/

public class FrequenceOfWord {
    public static void main(String[] args) {
        String str = "javajava";
        //substring(0, 4) ==> java
        //substring(1, 5) ==> avaj
        //substring(2, 6) ==> vaja
        //substring(3, 7) ==> ajav
        //substring(4, 8) ==> java
        //"java"

        int count = 0;
        for(int i = 0; i <= str.length()-4; i++){ // 1: 0, 1, 2, 3, 4, 5, 6, 7
            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }

        }
        System.out.println(count);



    }
}
