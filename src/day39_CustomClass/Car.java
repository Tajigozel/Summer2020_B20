package day39_CustomClass;

public class Car {
    /*
    Attributes:
    model, brand, year, color, mileage, VIN.....
     */
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public  void seInfo(String carBrand, String carModel, int carYear, String carColor,double carMileage, double carPrice) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;
    }

        public void getCarInfo(){
            System.out.println(year +" "+brand+" "+model+", "+ color+", "+mileage+", $"+price);
        }
    public void start(){
        System.out.println(brand+" "+model+" is started");
    }
        // prints the car info



    /*
    car1: Toyota
    car2: BMW
    car3: Tesla
     */




}
