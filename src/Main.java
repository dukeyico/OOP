package src;

public class Main {
    public static void main(String[] args){

        //Object myToyota
        Car myToyota = new Car();   //Instantiation
        myToyota.color = "Purple";
        myToyota.model = "Toyota";
        myToyota.year = 2025;

        //Object myAudi
        Car myAudi = new Car(); //Instantiation
        myAudi.color = "Blue";
        myAudi.model = "Audi";
        myAudi.year = 2024;

        // Calling the method from the class
        myToyota.showDetails();
        myAudi.showDetails();

        System.out.println("My " + myToyota.model + " is " + myToyota.color + " built in " + myToyota.year);
        System.out.println("My " + myAudi.model + " is " + myAudi.color + " built in " + myAudi.year);
    }
}
