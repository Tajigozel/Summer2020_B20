package day30_CustomMethods;

public class Return_Method2 {
    public static void main(String[] args) {
        String name= "Level";
        //revStr1(name);

        String reverseName = revStr2(name);
        System.out.println(name.equalsIgnoreCase(name));


    }


    public static void revStr1(String str){
        String result= "";
        for(int i = str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
    public static String revStr2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
