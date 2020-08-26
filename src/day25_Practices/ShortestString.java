package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nicholas", "Amir", "Nurmamet"};
        int minLength = arr[0].length();

        for(int i = 0; i <= arr.length-1;i++) { // to find out the minimum length of the string in arr
            /*int l = arr[i].length(); //4 8 4 8

            if(l < minLength){
                minLength = l;
            }*/
        }
            for(int i = 0; i <=arr.length-1; i++){ // to see how many strings lengths in the array is matching
                if(arr[i].length()== minLength){
                    System.out.println(arr[i]);
                }
            }






        System.out.println(minLength);





    }
}

