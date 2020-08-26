package OfficeHours.Practice_07_27_20;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        char[] a1 = {'A','B','C', 'D'};
        char[] a2 = {'D','E','F'};
        char[] a3 = new char[a1.length + a2.length];
       /*
        a3[0] = a1[0];//A
        a3[1] = a1[1];//B
        a3[2] = a1[2];//C
        a3[3] = a1[3];//D

        a3[4] = a2[0];//D
        a3[5] = a2[1];//E
        a3[6] = a2[2];//F */

        int index =0;
        for(char each:a1){
            a3[index] = each;
            index++;         //increased by 1 every single time
        }
        for(char each:a2){
           a3[index] = each;
           index++;
        }


        System.out.println(Arrays.toString(a3));




    }


}
