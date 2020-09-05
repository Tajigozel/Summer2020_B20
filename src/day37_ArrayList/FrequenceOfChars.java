package day37_ArrayList;
/*
2. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2
 */

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequenceOfChars {
    public static void main(String[] args) {
        String str = "AAAABBBBCCCCDDDDEE";
        ArrayList<String> list = new ArrayList<>();

        for(String each  : str.split("") ){
            list.add(each);
        }

        System.out.println(list);

        String nonDup = Util.removeDup(str); //"ABC"
        for( String each : nonDup.split("")){
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
            System.out.println();

            }
        }












    }

