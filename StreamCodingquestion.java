package Introduction;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCodingquestion {
    public static void main(String[] args) {

        List<String> names = List.of("john", "jane", "doe");
        // Output: ["JOHN", "JANE", "DOE"]

        List<String> upperCase = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        // Output: [2, 4, 6, 8, 10]
        List<Integer> evenNumbers = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);


        /*
        Return largest length
         */
        String str = "StreamAPI is important one";
        // Output: 'StreamAPI'
        // max can compare any objects and provide result, here we are comparing the string length
        Optional<String> max = Arrays.stream(str.split(" ")).max((s1, s2)-> s1.length()-s2.length());
        System.out.println(max.get());


        String duplictaes = "aabbccddeeff";

        /*
        Here is first way , first getting stream out of String object using  .chars()  then finding distinct characters with distinct and then it will give
        intStream hence we have to map it back to object of char
        * */
        Stream<Character> characterStream = duplictaes.chars().distinct().mapToObj(x -> (char) x);
        //characterStream.forEach(System.out::println);

        // Here we are first spliting string as String[] array of Object then applying distinct then finally printing it
        Arrays.stream(duplictaes.split("")).distinct().forEach(System.out::print);

        /*
        Find the word that has 2nd highest length
         */
        String input = "Hello World to Stream API";

        System.out.println("Sorted as per length of each word of string");
        Arrays.stream(input.split(" ")).sorted(((o1, o2) -> o1.length() - o2.length())).forEach(System.out::println);


        System.out.println("Sorted in descending as per length of each word of string");
        /*
        Skip will skip first n elements of stream
         */
        Arrays.stream(input.split(" ")).sorted((o1, o2)->o2.length()-o1.length()).skip(1).forEach(System.out::println);


        String input2 = "I am Learning Stream API in JAVA";
        String stringhaving2largestLengt = Arrays.stream(input2.split(" "))
                                .sorted((o1, o2) -> o2.length() - o1.length())
                                    .skip(1).findAny().get();

        System.out.println(stringhaving2largestLengt.length() + stringhaving2largestLengt);


        String countOccrence = "Java Java Stream API API learning";
        Map<String, Long> collect = Arrays.stream(countOccrence.split(" "))
                                          .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);


        /*
        Replace non vowel character with blank
         */
        String[] words = countOccrence.split(" ");
        for(String curr : words)
        {
            curr = curr.replaceAll("[^aeiouAEIOU]","");
            System.out.println(curr);
        }
        System.out.println(Arrays.toString(words));

        List<String> vowelwith2length = Arrays.stream(countOccrence.split(" "))
                                            .filter(curr -> curr.replaceAll("[^aeiouAEIOU]", "")
                                                    .length() == 2).collect(Collectors.toList());
        System.out.println(vowelwith2length);


        String str1 = "aabccdbe";
        // Output: 'e'

        Map<String, Long> collect1 = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));


        System.out.println(collect1);


        List<Employee> employeeList = new ArrayList<>(
                List.of(
                        new Employee(1,"Jhon", 32,60000),
                        new Employee(2, "Hello", 30,60000),
                        new Employee(3,"Kamya",10,60000),
                        new Employee(4,"Krishna", 40,60000)
                )
        );

        employeeList.stream().sorted((e1,e2)->e1.getAge() - e2.getAge()).forEach(System.out::println);
    }
}
