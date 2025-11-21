
class Student {
    private String name;
    private int age;
    private String course;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCourse(){
        return course;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setCourse(String course){
        this.course = course;
    }

    Student(){
        this.name = "unknown";
        this.age = 0;
        this.course = "Not assigned";

    }
    Student(String name,int age){
        this.name = name;
        this.age = age;

    }
    Student(String name,int age,String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display(){
    System.out.println("The name of the  Student is : " + name);
    System.out.println("The age of the Student is : " + age);
    System.out.println("The course of the Student is : " + course);
}

}




public class ConstructorOverloading {
    public static void main(String[] args){

       Student s1 = new Student();
       s1.display();

       Student s2 = new Student("leo das",22);
       s2.display();

       Student s3 = new Student("Harold das",35,"selling");
       s3.display();
    } 
}
