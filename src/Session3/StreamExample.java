package Session3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        System.out.println(numbers.stream().map(x-> x*x).collect(Collectors.toList()));
        System.out.println(numbers);

        List<String> names = Arrays.asList("Sudhir","Daga","Stanza","Living","Sumo");
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);


        //If the elements are not comparable, it will give class cast exception
        System.out.println(names.stream().sorted().collect(Collectors.toList()));

        System.out.println(numbers.stream().filter(x -> x%2==0).reduce(10,(ans,i)->ans+i));

        names.stream()
        .filter(p -> p.startsWith("S") && p.length() > 5)
        .map(p->p.toUpperCase())
        .sorted()
        .forEach(p -> System.out.println(p));

//        Stream.of(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0)
//                .takeWhile(x -> x<=5)
//                .forEach(System.out::print);

        //It will print 12345
        //takeWhile was added in java 9. It is different from filter. It will stop executing and return the stream as
        //soon as the condition is made false. Here it took only first 5 elements after which the condition terminated
        //and forEach was called. This is different from filter, where all the elements would have been traversed and
        //last five elements i.e, 543210 would have been also added to the stream making the output 12345543210

    }
}
