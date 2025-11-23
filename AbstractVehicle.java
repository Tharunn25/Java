
abstract class Vehicle{

    abstract double getMaxSpeed();
    abstract String getName();

    void show(){
        System.out.println(" brand " + getName());
        System.out.println(" horsepower " + getMaxSpeed());
    }
}

class Car extends Vehicle{

    double hp;
    String brand;

    
    Car(double h,String b){
        this.hp = h;
        this.brand = b;
    }

    @Override
    double getMaxSpeed(){
        return hp *2;
    }

    @Override
    String getName(){
        return brand;
    }
}

class Bike extends Vehicle{

    String brand;
    int cc;

    Bike(String b,int c){
        this.brand = b;
        this.cc = c;
    }

    @Override
    double getMaxSpeed(){
        return cc/2;
    }

    @Override
    String getName(){
        return brand;
    }
}



public class AbstractVehicle {
    public static void main(String[] args) {

        Car c1 = new Car(400,"Virtus GT");
        c1.show();
        Bike b1 = new Bike("Triumph",200);
        b1.show();
        
    }
    
}
