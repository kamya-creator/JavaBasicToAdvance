import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {



        // 1. Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();

        //2 . Arrays
        String[] arr = {"a","b","c"};
        Arrays.stream(arr);

        //3. Stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 5, 6);

        //4. Infinite Stream
        //Stream.generate(()->1).forEach(System.out::println);


        // limit infinite stream
        Stream.generate(()-> 2).limit(100).forEach(System.out::print);

        // iterate take starting value as seed(i.e 1st argument) and then apply function (i.e 2nd argument) to it
       // this will print natural number starting from seed +1 to given limit
        Stream.iterate(1, x ->x+1).limit(20).forEach(System.out::println);
    }
}
