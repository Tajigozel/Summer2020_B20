package day06_ComparissonOperators;/* write a program that can swap two variables' values wihtout using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Swap2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + b; // 10 + 15
        b = a - b; // 25 - 15
        System.out.println(a);
        System.out.println(b);
    }
}
