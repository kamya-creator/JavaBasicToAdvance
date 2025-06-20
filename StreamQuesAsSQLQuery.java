package Introduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuesAsSQLQuery {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(101, "Alice", 28, 60000),
                new Employee(102, "Bob", 35, 75000),
                new Employee(103, "Charlie", 25, 50000),
                new Employee(104, "David", 45, 80000),
                new Employee(105, "Eva", 30, 62000),
                new Employee(106, "Frank", 27, 40000),
                new Employee(107, "Grace", 31, 72000),
                new Employee(108, "Hannah", 29, 58000),
                new Employee(109, "Ian", 30, 69000),
                new Employee(110, "Jane", 26, 45000)
        );

        /*
        1.Filtering data
        SQL Query - Select * from employee where salary > 50000;
         */
        System.out.println(employees.stream().filter(e->e.getSalary() > 5000).collect(Collectors.toList()));

        /*
        Selecting specific fields(Mapping)
        Select name From Employee;
         */
        System.out.println(employees.stream().map(e->e.getName()).collect(Collectors.toList()));

        /*
        Select name, salary from Employee;
         */
        System.out.println(employees.stream().map(e->e.getName()+"-"+e.getSalary()).collect(Collectors.toList()));

        /*
        Aggregating Data like(Count, AVG, etc
        Select Count(*) from Employee;
         */
        System.out.println(employees.stream().count());

        /*
        Grouping Data
        Select age, count(*) from employee group by age;
         */
        System.out.println(employees.stream().collect(Collectors.groupingBy(e->e.getAge())));
        System.out.println(employees.stream().collect(Collectors.groupingBy(e->e.getAge(), Collectors.counting())));



        /*
        Sorting Data Descending
        Selct * from Employee order by salary DESC;
         */
        System.out.println(employees.stream().sorted((e1,e2)->e2.getSalary() - e1.getSalary()).collect(Collectors.toList()));


        /*
        Select name, age from user where age > 25 Order by age;
         */
        System.out.println(employees.stream()
                        .filter(employee -> employee.getAge()>25)   // where Age > 25
                        .sorted((e1,e2)->e2.getAge()-e1.getAge())  // Age ORDER BY DESC
                .map(e->e.getName() + " " + e.getAge())  // select name , age

                .collect(Collectors.toList()));

        Stream<String> stream1 = Stream.of("Bolo Radhe Radhe");
        Stream<String> stream2 = Stream.of("Hare Krishna Hare Krishna");

        List<String> r = Stream.concat(stream1, stream2)
                .flatMap(s-> Arrays.stream(s.split(" ")))
                .filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println(r);
    }
}
