
public class Main {
    public static class Person {
        public void greet(){
        System.out.println("Person !");
        }
    }
    public static class Student extends Person{

        public Student() {
        }
        
        public void greet(){
            super.greet();
            System.out.println("Student !");
        }
    }
        
    public static void main(String[] args){
        Student s = new Student();
        s.greet();
    }
}