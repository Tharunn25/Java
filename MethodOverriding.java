class Personn{
    String name;
    int age;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
    }
}

class Studentt extends Personn{
    String course;
    int marks;

    @Override
    void display(){
       super.display();
       System.out.println("course : " + course);
       System.out.println("marks : " + marks);
    }
}


public class MethodOverriding {
    public static void main(String[] args) {

        Studentt s1 = new Studentt();
        s1.course = "selling";
        s1.marks = 92;
        s1.name = "leo das";
        s1.age = 22;

        Personn p = new Studentt();
        p.name = "rex";
        p.age = 30;

        ((Studentt)p).course = "Trading";
        ((Studentt)p).marks = 45;

        p.display();


        s1.display();
        
    }
    
}
