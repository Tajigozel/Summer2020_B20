package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass_Practise {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Integer[] arr2 = {1,2,3,4};
        for(int each:arr2){    //unboxing
            System.out.println(each);
        }

        Double[] arr3 = {1.0, 2.0, 3.0, 4.0, 5.0}; //only dedicated to own primitive values
        for(Double each:arr3){
            System.out.println(each);
        }
        char ch = 79;
        Character ch1 = 79;
        System.out.println(ch1);

        String[] nums1 = {"12", "13", "14", "15"};
        double[] nums2 = new double [nums1.length];
        for(int i =0; i<= nums1.length-1; i++){
            nums2[i] = Double.parseDouble( nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));




















    }
}
