package day15;

public class substring_method {
   public static void main(String[] args) {
        String sentence = "Java is fun";
        //                 0123456789....
        //substring( beg index, end index)
        String word = sentence.substring(0 , 4);
        System.out.println(word);

        String word1 = sentence.substring(8, 10 +1);
        System.out.println(word1);
        System.out.println("============================================");

        String sentence1 = "I like Movie and Tv Series";
        //                  0123456789..............
        String word2 = sentence1.substring(7, 12+1);
       System.out.println(word2);

       System.out.println("=============================================");
       String firstName = "Bright future";
       String firstCharacter = firstName.substring(0,1);
       String rest = firstName.substring(1, firstName.length());

       System.out.println(firstCharacter);
       System.out.println(rest);
       System.out.println("=========================");
       String firstName1 = "gUZEL";
       String firstCharacter1 = firstName1.substring(0,1);
       String rest1 = firstName1.substring(1, firstName1.length());

       firstName1 = firstCharacter1.toUpperCase()+rest1.toLowerCase();
       System.out.println(firstName1);
       System.out.println("======================================");

       String lastName = "GUZEL";
       String firstChar = lastName.substring(0,1); //s
       String remaining = lastName.substring(1); //chool

       lastName = firstChar.toUpperCase()+ remaining.toLowerCase();//School
        //"school".substring(1);
       System.out.println(lastName);
       System.out.println(remaining);

       System.out.println("======================================");


       String s = "I Like Game of Thrones";
       //          01234567.............. //.substring(7); will rpint out Game of Thrones
       String s1 = s.substring(7);
       System.out.println(s1);

       System.out.println("====================================================");
       String q = "I like Java Programming Language";
       //          01234567........................
       String q1 = q.substring(7);
       System.out.println(q1);






    }

}
