package OfficeHours.Practice_07_07_2020;



public class StringReverse {
    public static void main(String[] args) {
        String str = "Batch20Guzel";
        //            0123456
        /*
        str.charAt(6); //'0'
        str.charAt(5); // '2'
        str.charAt(4); //'h'
         */
        String result = "";
        for(int i =str.length()-1; i >=0; i-=1){
            result +=str.charAt(i);
        }
        System.out.println(result);
        System.out.println("======================================");

        String result2="";
        int index = str.length()-1;
        while(index >=0){
            result2 += str.charAt(index);

            index -= 1;
        }
        System.out.println(result2);





    }



}
