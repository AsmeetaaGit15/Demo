package test;
 
class Animal {
    public void sleep() {
        System.out.println("Animal can sleep");
    }
}
 
class Cat extends Animal {
    public void eat() {
        System.out.println("Cat can eat");
    }
}
 
public class SingleInheritance {
    public static void main(String[] args) {
        // Create an instance of the Cat class
        Cat c = new Cat();
 
        // Call the methods
        c.sleep();
        c.eat();
    }
}
