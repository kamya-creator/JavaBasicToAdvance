package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        List<Integer> collected = list.stream().collect(Collectors.toList());
        System.out.println(collected);

        int[] arr = {2,3,4,5,1,2,3};
        IntStream stream = Arrays.stream(arr);
        long count = stream.count();
        System.out.println(count);

        String[] name = {"Krishna", "Radhe","Govind"};
        Stream<String> stream1 = Arrays.stream(name);
        stream1.filter(n -> n.startsWith("K")).forEach(System.out::println);

        List<String> namesCollection = List.of("Radhe Radhe","Banglore","Software Engineer");
        namesCollection.stream().filter(currname -> currname.startsWith("S")).forEach(System.out::println);

        Stream<String> stream2 = Stream.of("A","A","A","B","C");
        stream2.distinct().forEach(System.out::print);


        System.out.println();
        Stream<String> greeting = Stream.of("Hello", "Everyone","How","Are","You","Doing");
        greeting.filter(curr -> curr.length()>3).collect(Collectors.toList()).forEach(System.out::println);


        Stream<String> greeting2 = Stream.of("Hello", "Everyone","How","Are","You","Doing");
        List<String> collect = greeting2.map(cur -> cur.toLowerCase()).collect(Collectors.toList());
        System.out.println(collect);



//
//        ArrayList<ArrayList<String>> nestedList = new ArrayList<>(
//                new ArrayList<>(List.of("I","Am","Learning","Streams")),
//                new ArrayList<>(List.of("I","Am","Learning","Streams")),
//                new ArrayList<>(List.of("I","Am","Learning","Streams")),
//                new ArrayList<>(List.of("I","Am","Learning","Streams")),
//        ));

        List<List<String>> nestedList = new ArrayList<>(
                List.of(
                List.of("Stream","API"),
                List.of("Design","Patterns"),
                List.of("Observer","Design","Pattern"),
                List.of("I","Am","Learning","Streams")
                ));

        nestedList.stream().flatMap(currList->currList.stream()).collect(Collectors.toList()).forEach(System.out::println);


        List<List<String>> nestedList2 = Arrays.asList(
                Arrays.asList("Hello", "World"),
                Arrays.asList("Hi", "Software")
        );
        nestedList2.stream().flatMap(curr->curr.stream()).map(str -> str.toLowerCase()).forEach(System.out::println);


        int[] arr1 = {1,4,2,3,5,6,1,2};
        System.out.println("=======================");
        Arrays.stream(arr1).distinct().forEach(System.out::println);
        System.out.println("=======================");


        List<Integer> list1 = List.of(1,2,3,1,23,4,5,4);
        List<Integer> list2 = List.of(3,4,5,62,1,2,3,4);

        List<Integer> integerList = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(integerList);


    }

}
