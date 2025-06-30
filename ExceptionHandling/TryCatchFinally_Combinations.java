package ExceptionHandling;

public class TryCatchFinally_Combinations {

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void main(String[] args) throws ClassNotFoundException {

        try{
            System.out.println("In Try Block");
            method1();
            return;

        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Exception handled in catch block");

            //System.exit(1); // Finally will not get executed if JVM got executed
        }
        finally {
            System.out.println("Finally get executed");
        }

        try{
            /*
            Try block can exist without catch block but the only condition is method signature will have to add throws Exception
            Koi na koi to exception handle krega na, agar current method nhi to caller krega handle
             */
            method1();

        }
        finally {
            System.out.println("Finally aa gya---------------");
        }

    }
}
