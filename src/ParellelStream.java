import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParellelStream {

    public static void main(String[] args) {

        List<Integer> numbers = (List<Integer>) Stream.iterate(1, x -> x+1)
                        .limit(20000).collect(Collectors.toList());
        //System.out.println(numbers);

        long start = System.currentTimeMillis();
        List<Integer> collect_sequential = numbers.stream().map(ParellelStream::factorial).collect(Collectors.toList());
        // System.out.println(collect);
        long end = System.currentTimeMillis();
        System.out.println("Stream executed in ms: "+(end - start));


        start = System.currentTimeMillis();
        List<Integer> collect_parallel = numbers.parallelStream().map(ParellelStream::factorial).collect(Collectors.toList());
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream executed in ms "+(end-start));
    }

    /*
    See how must fast in parallel Stream
    Output
    Stream executed in ms: 194
    Parallel Stream executed in ms 40

     */
    private static Integer factorial(Integer x) {

        int fact =1;
        int count = 1;
        while(count<=x)
        {
            fact = fact*count;
            count++;

        }

        return fact;
    }
}
