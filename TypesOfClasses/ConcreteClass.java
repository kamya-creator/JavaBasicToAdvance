package TypesOfClasses;

interface Shape{
    void display();
}

// Rectangle class is concrete class here
class Rectangle implements Shape
{

    @Override
    public void display() {
        System.out.println("Doing something--------");
    }
}
public class ConcreteClass {
}
