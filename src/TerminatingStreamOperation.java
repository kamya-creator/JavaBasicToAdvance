import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminatingStreamOperation {
    public static void main(String[] args) {
        /*
        Operation | Description
        forEach(Consumer) | Performs an action for each element (side effect).
        forEachOrdered(Consumer) | Like forEach but respects encounter order (in parallel streams).
        toArray() | Collects elements into an array.
        reduce(...) | Reduces the stream to a single value using an accumulator.
        collect(Collector) | Converts the stream into a collection, map, or other structure.
        min(Comparator) | Finds the minimum element based on a comparator.
        max(Comparator) | Finds the maximum element.
        count() | Returns the number of elements in the stream.
        anyMatch(Predicate) | Returns true if any element matches the predicate.
        allMatch(Predicate) | Returns true if all elements match.
        noneMatch(Predicate) | Returns true if no elements match.
        findFirst() | Returns the first element (if present).
        findAny() | Returns any element (useful in parallel streams).
         */

        //1 . toArray()
        List<Integer> list = List.of(1,2,3,4,2,3,4,5,6,7,8,9,0);
        System.out.println(Arrays.toString(list.stream().filter(x -> x % 3 == 0).toArray()));

        //2. reduce()
        System.out.println(list.stream().reduce((x,y) -> x+y));

        //3. collect()
        Set<Integer> toSet = list.stream().collect(Collectors.toSet());
        System.out.println(toSet);

        // 4. count
        System.out.println(list.stream().count());

        // 5. anyMatch allMatch noneMatch
        System.out.println(list.stream().anyMatch(x-> x>6));
        System.out.println(list.stream().allMatch(x->x>10));
        System.out.println(list.stream().noneMatch(x-> x<0));

        //6. findFirst findAny
        System.out.println(list.stream().findAny());
        System.out.println(list.stream().findAny());

        //7. max min
        System.out.println(list.stream().max((x,y) -> x-y));
        System.out.println(list.stream().min((x,y) -> x-y));


        // Example - all names which len > 3
        List<String> name = List.of("Ashish","Bob","Dev","Chandni");
        name.stream().filter(x->x.length()>3).forEach(System.out::println);

        // Squaring and sorting number
        List<Integer> numbers = List.of(7,3,4,1,2,9);
        List<Integer> collect = numbers.stream().map(x -> x * x).sorted().collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> integers = List.of(6,4,3,2,56,7);
        System.out.println(integers.stream().reduce((x,y) -> x+y));

        // Count occurrence of character
        String str = "Happy BirthDay to you";
        System.out.println(str.chars().filter(x->x=='p').count());

        List<Integer> list_arr = Arrays.asList(1,2,3,3,4,4);

        System.out.println("reduceed---------");
        Optional<Integer> reduce = list_arr.stream().reduce((a, b) -> a + b);
        System.out.println(reduce);


        /*
        Stateful operations -- They know about rest of elements in streams, as it is required for final operation.
        Example - sorted() - it required to know about all ele in stream in order to sort


        Stateless operations -- They don't know about rest of elements in streams, as it is not required for final operation.
        Example - map() - it doesn't required to know about all ele in stream in order to apply func on each elem od stream

        Operation | Stateless | Stateful
        map() | ✅ | ❌
        filter() | ✅ | ❌
        peek() | ✅ | ❌
        flatMap() | ✅ | ❌
        sorted() | ❌ | ✅
        distinct() | ❌ | ✅
        limit() | ❌ | ✅
        skip() | ❌ | ✅
         */

    }
}
