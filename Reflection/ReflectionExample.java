package Reflection;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class OfferLetter
{
    private String jobDesignation;
    public double salary;

    private void getRelocated()
    {

    }

    public int calculateGST()
    {
        System.out.println("calculateGST is called");
        return 100;
    }

}
public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class classObj = OfferLetter.class;


        System.out.println(classObj.getClass());
        System.out.println(classObj.getClassLoader());
        System.out.println(classObj.getPackage());

        OfferLetter obj = new OfferLetter();

        Field salary = classObj.getDeclaredField("salary");
        System.out.println(salary.get(obj));

        Field jobDesignation = classObj.getDeclaredField("jobDesignation");
        jobDesignation.setAccessible(true);
        jobDesignation.set(obj, "Sr. Software Enginner");


        Method[] methods = classObj.getDeclaredMethods();
        for(Method method : methods)
        {
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
        }

        Method calculateGST = classObj.getMethod("calculateGST");
        calculateGST.invoke(obj);
    }
}
