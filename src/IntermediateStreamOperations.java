import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateStreamOperations {

    static void print(String s)
    {
        System.out.println(s);
    }
    static void printINT(Integer s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) {


        Stream<String> name = Arrays.stream(new String[]{"Akshit", "Aman", "Aman", "Raghav", "Bhure Uncle"});
        /*
        // 1. map
        System.out.println("Result of Map---------");
        name.map(s -> s.toUpperCase()).forEach(IntermediateStreamOperations::print);

        //2 . filter
        System.out.println("Result of filter---------");
        name.filter(s->s.length()>5).forEach(IntermediateStreamOperations::print);

        //3. sorted
        System.out.println("Result of Sorted---------");
        name.sorted().forEach(IntermediateStreamOperations::print);

        //4. distinct
        System.out.println("Result of distinct---------");
        name.distinct().forEach(IntermediateStreamOperations::print);

        // 5. limit
        System.out.println("Result of limit---------");
        name.limit(3).forEach(IntermediateStreamOperations::print);

        //6. skip
        Stream.iterate(0,x->x+1).skip(10).limit(20).forEach(IntermediateStreamOperations::printINT);
*/
        List<List<String>> words = Arrays.asList( Arrays.asList("hello","world","Krishna")
        , Arrays.asList("Radhe", "Radhe"));


        //words.stream().map((s) -> s.split("")).forEach(strings -> System.out.println(Arrays.toString(strings)));


        words.stream()

                .flatMap(List::stream)
                .map(s->s.split(""))
                .forEach(strings -> System.out.println(Arrays.toString(strings)));


    }
}
