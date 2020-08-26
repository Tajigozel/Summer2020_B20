package day26_MultiDimensionalArray;
/* write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
*/
import java.util.Arrays;
public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3};
        Arrays.sort(arr); // arr: 1 2 3
        System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length];
        desc[0] = arr[arr.length -1]; //1 approach
        desc[1] = arr[1];
        desc[2] = arr[0];    //desc[desc.length-1]= arr[0];

        int k = arr.length-1;

        for(int i = 0; i <= desc.length-1; i++){               //i:0, 1, 2       2 nd approach
            desc[i] = arr[k];
            k--;                                     //k: 2, 1, 0

        }


        System.out.println(Arrays.toString(desc));



    }
}
