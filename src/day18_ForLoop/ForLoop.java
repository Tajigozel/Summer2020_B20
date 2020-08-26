package day18_ForLoop;

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 5;i++ ){  //i:1, 2, 3
            System.out.println("Cybertek Batch 20"); //5
        }

        System.out.println("======================================");
        for(int i =1 ; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");
        System.out.println("=================================");


        for(int i = 0; i <= 10; i +=2) {
            System.out.print(" " +i);
        }
        for(int i = 1; i <= 10; i +=2){
            System.out.print(" " + i);
        }
    }
}
