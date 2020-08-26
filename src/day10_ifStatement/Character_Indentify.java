package day10_ifStatement;

public class Character_Indentify {
    public static void main(String[] args) {
        char character = '@';
                              //  65 <= character <= 90          ||  97 <= character <= 122
        boolean isAlphabetic = character >= 65 && character <=90 || (character >= 97 && character <= 122);
        //                      upper case letter                ||  lower Case letter
                // 47 <= Character <= 57
        boolean isDigit = character >= 48 && character <= 57;

        boolean specialChar = !isAlphabetic && !isDigit;
        //or second way     = is Alphabetic == false && isDigit == false


     String alphabet = "";
     if(isAlphabetic == true) {
     //  System.out.println(character + " is Alphabetic character");
         alphabet = character + " is Alphabetic character";  // more preferable
     }else{
      // System.out.println(character + " is not alphabetic");
         alphabet = character + " is not Alphabetic";   // or instead of System.out.println();
     }
        System.out.println(alphabet);

        String digit = "";
        if(isDigit == true){
            digit = character + " is a digit character";
        }else{
            digit = character + " is not digit";
        }
        System.out.println(digit);

        String specialCharacter = "";
        if(specialChar == true){
            specialCharacter = character + " is a special character";
        }else{
            specialCharacter = character + " is not a special character";
        }
        System.out.println(specialCharacter);


    }
}
