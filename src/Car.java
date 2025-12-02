package src;

public class Car {

    // Properties/Attributes/member variables
    String color;
    String model;
    int year;

//    //Default Constructor
//    public Car(){
//        System.out.println("Car class created.");
//    }

    //Parameterized constructor
    public Car(String myColor, String myModel, int theYear){
        System.out.println(myModel + " created," + " Color: " + myColor + ", Year: " + theYear);
        this.color = myColor;
        this.model = myModel;
        this.year = theYear;
    }

    // Creating a member method
    void showDetails(){
        System.out.println("This car is " + model + " and is " + color + " and was built in " + year);
    }
}
