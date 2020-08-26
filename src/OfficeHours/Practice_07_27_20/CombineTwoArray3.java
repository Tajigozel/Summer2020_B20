package OfficeHours.Practice_07_27_20;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
public class CombineTwoArray3 {
    public static void main(String[] args) {


        String[] a1 = {"Tatiana", "Hamit", "Phornsri"};
        String[] a2 = {"Aalia", "Zeki", "Cristina", "Dawut"};

        String[] students = new String[a1.length + a2.length];
        for (int i = 0; i <= a1.length - 1; i++) {
            students[i] = a1[i];
        }
        for (int j = 0; j <= a2.length - 1; j++) {
            students[j] = a2[j];

            System.out.println(Arrays.toString(students));


        }
    }
}