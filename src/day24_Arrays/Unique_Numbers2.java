package day24_Arrays;

public class Unique_Numbers2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9,9,9};

        for(int a: arr){
            int num1 = a; //1 1 2 3 3
            int count = 0;
            for(int b: arr){
                if(b == num1){
                    count ++;
                }
            }
            if(count == 1){
                System.out.print(num1 + " ");
            }

        }







    }
}



