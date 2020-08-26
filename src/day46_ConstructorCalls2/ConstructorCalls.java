package day46_ConstructorCalls2;

public class ConstructorCalls {
    public ConstructorCalls() {
        method1();
        method2();
        method3();
    }


    public static void method1() {
        method2();

        // ConstructorCall();
    }

    public static void method2() {
        method1();
    }

    public void method3() {
        //  ConstructorCall();
    }
}
