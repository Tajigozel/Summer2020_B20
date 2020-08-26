package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Siwan", "Beagle", "medium", 2, "Mix");
        dog2.setDogInfo("Roofus", "Argetinian Dogo", "Large", 5, "White");
        dog3.setDogInfo("Lucky", "Pug", "Small", 1, "Black");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle Paca");
        dog3.eat("Steak");
        dog2.eat("Polo");

        dog1.drink("water");
        dog2.drink("soda");
        dog3.drink("redbull");
    }
}
