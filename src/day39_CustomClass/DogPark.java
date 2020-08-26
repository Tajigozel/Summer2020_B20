package day39_CustomClass;

public class DogPark {
    public static void main(String[] args) {
        //dogPark
        //Dog dog1 = new Dog();
        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog()};
        //                 0            1        2          3

        dogPark[0].setDogInfo("Karaoglan", "German Shepperd", "Medium",6, "Black");
        dogPark[1].setDogInfo("Rokko", "German Shepperd", "Small", 2, "Grey");
        dogPark[2].setDogInfo("Champ", "Retriver", "Small", 7, "White");
        dogPark[3].setDogInfo("Pasha", "Pitbull", "Large", 3, "Brown");


        for(int i =0; i<=dogPark.length-1; i++){
            dogPark[i].getDogInfo();
        }

        System.out.println("=========================================");

        for(Dog eachDog:dogPark){
            eachDog.getDogInfo();
        }
        System.out.println("============================================");
        String food = "treats";
        for(Dog eachDog:dogPark){
            eachDog.eat(food);
        }


        System.out.println("============================================");
        String drink = "milk";
        for(Dog eachDog:dogPark){
            eachDog.drink(drink);
        }



    }
}
