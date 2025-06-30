package ExceptionHandling;


import java.nio.file.FileAlreadyExistsException;

public class CheckedException {
    /*
    CheckException forces caller to handle exception
     */
    public static void method1() throws ClassNotFoundException
    {

    }
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        Again when callee throws exception to caller , it has 2 ways to cater this
        1. Throw to caller
        2. Handle with try catch finally
         */
        try{

            method1();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        catch (ClassCastException e)
        {

        }
       // catch (FileAlreadyExistsException e)  // catch handles only those exception which can be thrown in method, ye nhi ki koi bhi exception aap catch m daal doge
        {

        }
    }
}
