package day27_recap;

public class Min_Max {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 99};
        int countDivisibleBy3 = 0;
        for(int each: scores){
            if(each%3 != 0){
                continue;
            }
            countDivisibleBy3++;
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println(countDivisibleBy3);

        System.out.println("====================================================");

        String[] names = {"AB", "ABC", "A", "AB", "ABCD"};
        String countLetter = "";
        for(String each:names){
            if(!each.contains("C")){
                continue;
            }
            countLetter +=1;
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println(countLetter);

        System.out.println("=============================================");

        int[] score = {80, 75, 65, 110, 90, 45, 56, 78};
        int max = score[0]; // [0] is the first element in the array which will compare the rest numbers
        int min = score[0];

        for(int each:score){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }

        System.out.println("Max Number: " + max);
        System.out.println("Minumum Number: " + min);






    }
}
