package day29_CustomMethods;

public class MethodsWithParameter {
    public static void main(String[] args) {
        printHello(3);

        System.out.println("================================================");
        age(2005, 2030);

    }


    public static void printHello(int numberOfTimes){
        for(int i=0; i< numberOfTimes; i++){
            System.out.println("Hello World");
        }
    }


    public static void age(int birthYear, int currenYear){
        if(currenYear < birthYear){
            System.out.println("Invalid Entry");
        }else {
            int age = currenYear - birthYear;
            System.out.println("You are " + age + "years old");
        }
    }









}
