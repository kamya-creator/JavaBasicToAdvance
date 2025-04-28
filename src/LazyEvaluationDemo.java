import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {

    public static void main(String[] args) {

        // Printing a-z with stream
        //Stream.iterate('a' , x-> (char) (x+1)).limit(26).forEach(System.out::println);


        List<String> alphabets = List.of("A", "AB","ABC","ABCD" ,"BCDSS");
        Stream<String> stringStream = alphabets.stream().filter(
                ch -> {
                    System.out.println("Executing filter");
                    return ch.contains("A");
                }
        );

        System.out.println("Going to execute Stream");
        stringStream.forEach(System.out::println);


    }
}
