package TypesOfClasses;

abstract class Car{

    int mileage;
    Car(int mileage)
    {
        this.mileage = mileage;
    }

    public abstract void pressBrake();
    public abstract void pressAccelerator();

}
abstract class Ertiga extends Car
{

    Ertiga(int mileage) {
        super(mileage);
    }

    @Override
    public void pressBrake() {
        System.out.println("Pressed Brake");
    }

    public abstract void pressAccelerator() ;

    abstract void  aMethod();
}
class Child extends Ertiga
{

    Child(int mileage) {
        super(mileage);
    }
    /*
    Child have to implement all unimplemented methods os parent class
     */
    @Override
    public void pressAccelerator() {

    }

    @Override
    void aMethod() {
        // Ertiga method implementaion
    }
}
public class AbstractClass {
}
