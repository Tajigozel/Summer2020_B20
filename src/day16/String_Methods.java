package day16;

public class String_Methods {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo"); // cybertek@yahoo.com
        System.out.println(email);

        String word = "java";
        word = word.replace("a", "e");//"jeve"
        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a,Java", "a,C#");
        sentence = sentence.replace("Java ", "Python ");
        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place"; //MIT

        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);
        s1 = s1.replace("MIT", "Cybertek");
        System.out.println(s1);

        String s2 = "I like to leaRn Java"; //r
        s2 = s2.replace('R', 'r');
        System.out.println(s2);

        //ReplaceFirst:

        String s3 = "I like to drink tea and tea";
        s3=s3.replaceFirst("tea", "cola");
        System.out.println(s3);

        String s4 = "I like to Watch Game of Thrones, and walking dead";
        s4= s4.replace(", and walking dead", " ");
        System.out.println(s4);

        //IndexOf()

        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");
        System.out.println(r1);
        System.out.println(r2);

        //lastIndexOf()
        String s6 = "Java is a programming language, and Java is fun";

        int i1 = s6.indexOf(" J");
        int i2 = s6.lastIndexOf("J");

        System.out.println(i1);
        System.out.println(i2);


    }
}
