package day29_CustomMethods;
//10. write a method that can remeove the duplicates from the string

public class RemoveDuplicates {


    public static void main(String[] args) {
        removeDup("ababccccccccddddddddeeeeeeeeeee");
    }





    public static void removeDup(String str){   //"abab"
        String nonDup= "";// "ab"
                          // {a, b, a, b}
        for(String each:str.split("")){
            if(!nonDup.contains(each)){
                nonDup +=each;
            }
        }
        System.out.println(nonDup);

    }












}
