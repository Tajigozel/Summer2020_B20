package day24_Arrays;
// write the programme that can find the unique words from an array of string

public class Unique_Words {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for(int j = 0; j <= words.length -1; j++){
            String s = words[j]; // "C#"
            int count = 0; // To assign the frequency of s
            // 1 + 1
            for(int i = 0; i <= words.length -1; i++){
                String each = words[i];// "C#", "C#", "Java", "Python", "Python", "C++"
                if(s.equals(each)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(s);
            }
        }









    }
}
