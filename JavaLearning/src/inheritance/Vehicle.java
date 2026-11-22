package inheritance;

public class Vehicle {
    public String toString(){
        return "Vehicle";
    }
}


class Car extends  Vehicle{}

class Boat extends Vehicle{}
class Saloon extends Car{}


class Inheritance{
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.toString());

        Boat boat = new Boat();
        System.out.println(boat);
    }
}