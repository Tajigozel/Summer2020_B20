package day52_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        int[] arr = {10,20};

        try{
            System.out.println(arr[20]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception is hadled");
        }catch(ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Out Of Bound Exceptin");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bounds Exception");
        }catch(RuntimeException e){
            System.out.println("Run Time Exception"); // RunTimeException cant run before child class which is above
        } //catch(NoSuchElementException e{}
        System.out.println("========================================");
        System.out.println("=====================================");

        String str = "Cybertek";
        try {
            System.out.println(str.charAt(200));
        }catch(RuntimeException e){  // runtimeexception can handle any unchecked exception
            System.out.println(e.getMessage());
        }

        System.out.println("=====================================");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }

        System.out.println("======================================================");

        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }

        System.out.println("=====================================================");
        try {
            System.out.println(8 / 0); // Arithmetic exception
            System.out.println("Try Block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch Block");

        }finally {
            System.out.println("Finally block");
        }


        System.out.println("Completed");



    }
}
