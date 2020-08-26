package day44_Constructor;

import java.util.concurrent.Callable;

public class ConstructorIntro {
    public ConstructorIntro(String arr){
        System.out.println("hello "+ arr);
        System.out.println("How are you "+arr);

    }

    public static void main(String[] args) {

        //ConstructorIntro obj = new ConstructorIntro(10);
        //ConstructorIntro obj2 = new ConstructorIntro();

        ConstructorIntro obj3 = new ConstructorIntro("Muhtar");
        ConstructorIntro obj4 = new ConstructorIntro("Dawud");
        ConstructorIntro obj5 = new ConstructorIntro("Zeliha");


    }
}

