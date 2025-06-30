package ExceptionHandling;

class MyCustomException extends Exception
{
    MyCustomException(String message)
    {
        super(message);
    }
}

public class CustomException {
    public static void method1() throws MyCustomException {
        throw new MyCustomException("Custom Exception called");
    }
    public static void main(String[] args) {

        try {
            method1();
        }catch (MyCustomException  e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("All done");
        }
    }
}
