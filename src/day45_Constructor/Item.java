package day45_Constructor;
/*
1.crate a class called Item
       Instance variables:
        name, unitPrice,quantity

        add a constructor that can initialize the fields

        Instance methods:
          calcCost(): returns the total cost as double
                    hint: quantity * unitPrice
          to String(): returns the name, unit price, quantity and total cost info as calculated by calcCost();
 */

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name,  double unitPrice, int quantity){
        this.name = name;
        this.unitPrice= unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString(){
        return "Name: "+name+", Unit Price: "+unitPrice+", Quantity: "+quantity+", Toral Price: "+calcCost();
    }


}
