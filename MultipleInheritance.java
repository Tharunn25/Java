
interface Walkable{
    void walk();
}

interface Swimmable{
    void swim();
}

class Amphibian implements Walkable,Swimmable{

    @Override
    public void walk(){
        System.out.println("He can walk");
    }

    @Override
    public void swim(){
        System.out.println("He can swim");
    }

}

public class MultipleInheritance {
    public static void main(String[] args) {

       Amphibian a1 = new Amphibian();
       a1.walk();
       a1.swim();
        
    }
    
}
