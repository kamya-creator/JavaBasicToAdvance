package CompileTimeOverloading;


class Parent{

    void doSomething()
    {
        System.out.println("Doing Something");
    }
    /*
    * Method Overloading means methods can differ only in arguments type, number but not the return type
    *
    * -------------------------------------
    * int doSomething();
    * void doSomething();
    *  Ye nhi h method overloading---------------
    *
    *     * */
    int doSomething(int a)
    {
        System.out.println("Doing something with " +a);
        return 0;
    }
}
public class CompileTimeExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.doSomething();
        p.doSomething(2);
    }
}
