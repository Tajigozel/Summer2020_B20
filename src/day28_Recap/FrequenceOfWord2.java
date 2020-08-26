package day28_Recap;

public class FrequenceOfWord2 {
    public static void main(String[] args) {
        String str = "catcatcatdogdogpythonpythonpythonpython";
        // (0, 3)

        int count = 0; // "cat"
        for(int i = 0; i<=str.length()-3; i++){
            if(str.substring(i,i+3).equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println(count);

        int count1 = 0; // "dog"
        for(int i = 0; i<=str.length()-3; i++){
            if(str.substring(i,i+3).equalsIgnoreCase("dog")){
                count1++;
            }
        }
        System.out.println(count1);

        int count2 = 0; // "pyhton"
        for(int i = 0; i<=str.length()-6; i++){
            if(str.substring(i,i+6).equalsIgnoreCase("python")){
                count2++;
            }
        }
        System.out.println(count2);




    }
}
