package ExceptionHandling;

import java.util.ArrayList;

public class UncheckedException {
    public static void main(String[] args) {

        /*
        UncheckedException or RunTime exception means  that compiler will not force you to handle the exception in program
        At runtime It will throw the exception and stops the program abruptly
         */
        //int res = 1/0; // Arithmetic Exception in thread "main" java.lang.ArithmeticException: / by zero

        // Number format exception
        //Integer a = new Integer("Hello"); // Exception in thread "main" java.lang.NumberFormatException: For input string: "Hello"


        // ClassCast Exception
        Object s = "Krishna";
        //Integer a = (Integer) s; //  java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer

        String name = null;  // NullPointerException --  java.lang.NullPointerException
       // System.out.println(name.length());

        int[] arr = new int[2];
      //  System.out.println(arr[9]); // ArrayIndexOutOfBoundException

        String a = "Radhe";
        //System.out.println(a.charAt(12)); // StringIndexOutOfBoundException -  java.lang.StringIndexOutOfBoundsException: String index out of range: 12

        Integer i_ = Integer.parseInt("Kamya"); // NumberFormatException - java.lang.NumberFormatException: For input string: "Kamya"
        System.out.println(i_);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(11);list.add(12);

        for (int i : list) {
            if(i == 11)
            {
                list.remove(new Integer(11)); // ConcurrentModificationException ---java.util.ConcurrentModificationException
                list.add(99);
            }
        }











    }
}
