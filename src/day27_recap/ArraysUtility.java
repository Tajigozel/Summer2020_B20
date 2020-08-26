package day27_recap;
/* sort():
   toString():
   equals():
*/
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
        String[] names = {"Odina", "Lillia", "Berk", "Emine"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        int[] nums = {90, 50, 95, 87, 93};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Maximu number: " +nums[nums.length-1]);
        System.out.println("Minimum number: " + nums[0]);

        System.out.println("=====================================================");

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println(Arrays.equals(s1,s2)); //true

        String[] s3 = {"C", "A", "B"};
        System.out.println(Arrays.equals(s1, s3)); //false

        String[] a1 = {"A", "C", "B"};
        String[] a2 = {"B", "A", "C"};
        System.out.println(Arrays.equals(a1, a2)); //false
        // sorting letters
        Arrays.sort(a1); // a1: {A, B, C};
        Arrays.sort(a2); // a2: {A, B, C};

        System.out.println((Arrays.equals(a1, a2))); // true







    }
}
