package day23_Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        String[] shoppingList = new String[7];

        shoppingList [0] = "Toilet Paper";
        shoppingList [1] = "Hand Sanitizer";
        shoppingList [2] = "Eggs";
        shoppingList [6] = "Corona Beer";
        shoppingList [4] = "Bread";
        shoppingList [5] = "Milk";
        shoppingList [3] = "Water";

        for(int i = 0; i <= shoppingList.length - 1; i++){
            System.out.println(shoppingList[i]);
        }





    }
}
