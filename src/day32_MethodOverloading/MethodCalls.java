package day32_MethodOverloading;
import library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        String firstName= "eLkEm";
        String lastName = "emEt";

        String fullName;
        fullName = Util.formatFullName(firstName, lastName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);

        String reversedName = Util.reverse(fullName);
        System.out.println(reversedName);

        System.out.println("=========================================");

        int[] a = {200, 400, 500, 200, 1000, 50, 40, 30, 400, 60, 70};
        int n = 2500;
        a= Util.addElement(a, n);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
