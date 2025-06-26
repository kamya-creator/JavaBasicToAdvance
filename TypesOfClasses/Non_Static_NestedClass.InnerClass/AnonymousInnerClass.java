package TypesOfClasses.Non_Static_NestedClass.InnerClass;

abstract class Parent{

    Parent()
    {
        System.out.println("Parent constructor");
    }
    abstract void educateChild();
}


public class AnonymousInnerClass {
    public static void main(String[] args) {

        // Here we are not creating explicitly a class with name  ,
        // instead we go with Anonymous inner class ,
        // It will have no name but It will implement all abstract methods of abstract class
        Parent parent = new Parent() {
            @Override
            void educateChild() {
                System.out.println("Making them Independent");
            }
        };

        //Parent obj1 = new Parent(); // Abstract class can have constructor, but it can't be instantiated directly , only through implementation class constructor JVM automatically call abstract Class constructor

        parent.educateChild();
    }
}
