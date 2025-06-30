package Interfaces;


/*
Advantage of Interface-----
1. Abstraction -- Child provides the implementation of methods of Interface , External world need not know about internal
implementation, rather than just call Interface.method then one of the child class implementation will be called

2. Multiple Inheritance possible with Interface - Solved Diamond Problem

3. Polymorphism - At run time JVM can decide which child's implementation should be get executed. We hold the object of child class in parent interface reference

 */
class Ostrich implements NonFlyingLiving
{

    @Override
    public void fly() {
        // Child's responsibility do defined its own implementation
        System.out.println("Yes Ostrich can fly" + NonFlyingLiving.MAX_HEIGHT);
    }

    @Override
    public void canRun() {

        // Child's responsibility do defined its own implementation
        System.out.println("Yes Ostrich can run");

    }
}
class Human implements NonFlyingLiving
{

    @Override
    public void fly() {
        System.out.println("No Human can't fly");
    }

    @Override
    public void canRun() {
        System.out.println("yes Human can run");
    }
}
public class AdvantagesOfInterface {

    public static void main(String[] args) {
        NonFlyingLiving obj1 = new Ostrich();
        NonFlyingLiving obj2 = new Human();

        obj1.canRun();;
        obj1.fly();


        obj2.canRun();
        obj2.fly();
    }
}
