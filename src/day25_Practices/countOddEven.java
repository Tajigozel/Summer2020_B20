package day25_Practices;

public class countOddEven {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int countEven = 0;
        int countOdd = 0;
        String even = "";
        String odd = "";

        for(int each : nums){
          if(each%2 == 0){
              countEven += 1;
              even+= each +" ";
          }else{
              countOdd++ ;
              odd += each +" ";
          }
        }
        System.out.println("Even Numbers: "+countEven);
        System.out.println("Even Numbers are: "+even);
        System.out.println("Odd Numbers: "+countOdd);
        System.out.println("Odd Numbers are: "+odd);

    }
}
