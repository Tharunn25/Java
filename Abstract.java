
abstract class Shape{

    abstract double calculateArea();

    void display(){
        System.out.println("The area is : " + calculateArea());
    }
}

class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape{

    double Length;
    double breadth;

    Rectangle(double L,double b){
        this.Length = L;
        this.breadth = b;
    }

    @Override
    double calculateArea(){
        return Length * breadth;
    }
}



public class Abstract {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(10, 5);

        c1.display();
        r1.display();


        
    }
    
}
