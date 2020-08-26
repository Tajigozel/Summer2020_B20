package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
        //String students = "Muhtar", "Nadir", "Asiya"

        String[] students={"Cybertek", "Muhtar", "Nadir", "Asiya"};
       //                     0           1       2        3
        String name1 = students[1];
        System.out.println(name1);
        System.out.println("===================================");

        int[] scores = {85, 70, 95, 90, 100}; // size of 5
        String[] names = {"Mike", "Adam", "Tommy", "John", "Amy"}; // size of 5
        /*
        System.out.println(names[0] + " : " + scores[0]);
        System.out.println(names[1] + " : " + scores[1]);
        System.out.println(names[2] + " : " + scores[2]);
        System.out.println(names[3] + " : " + scores[3]);
        System.out.println(names[4] + " : " + scores[4]);

        */
        for(int i = 0; i <= 4; i++){ // i: 0,1,2,3,4
            System.out.println(names[i] + " : " + scores[i]);
        }
        System.out.println("===========================================");

        String[] classMates = new String[5]; // size is 5,
        classMates[0] = "Fathima";
        classMates[2] = "Hazel";
        classMates[1] = "Guzel";
        classMates[3] = "Emin";
        classMates[4] = "Love";
        for(int i = 0; i <= classMates.length -1; i++){
            System.out.println(classMates[i]);
        }







    }
}
