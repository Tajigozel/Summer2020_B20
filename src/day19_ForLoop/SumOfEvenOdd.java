package day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        //Task:03:
        //0 2 4 6 8 10....

        int sumOfEven = 0;
 /*       for(int i = 0; i <= 100; i += 2){
            sumOfEven += i;
        }

  */
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0) {
                sumOfEven += i;
            }
        }

        System.out.println(sumOfEven);
        System.out.println("=======================================");
        // task: 03:
        //1 3 5 7 9 ...99

        int sumOfOdd = 0;

     /*   for(int i = 1; i <=99; i += 2){
            sumOfOdd += i;
        }

      */

        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                sumOfOdd = sumOfOdd + i; // sumOfOdd += i
            }
        }



        System.out.println(sumOfOdd);






    }
}
