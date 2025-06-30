package Generic;

import java.util.Arrays;
import java.util.List;
/*
Super as defining boundary of class is not supported in Java at Class Level
Super as defining boundary in method level is valid in Java
 */


//============================= INVALID ===============================
//class LowerBoundedGenericExample<T super Integer>
//        {
//
//        }
public class LowerBoundedGeneric {

     public <T> void getLowerBound(List<? super T> list)
     {
         System.out.println(list);
     }

    public static void main(String[] args) {
        LowerBoundedGeneric obj = new LowerBoundedGeneric();
        obj.getLowerBound(Arrays.asList(1,2,3,4,5));

        obj.getLowerBound(Arrays.asList("A","B","C"));
        obj.getLowerBound(Arrays.asList(1.0f,2.0f));

    }
}
