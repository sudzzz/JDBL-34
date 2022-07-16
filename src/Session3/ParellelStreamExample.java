package Session3;

import java.util.Arrays;
import java.util.List;

public class ParellelStreamExample {
    public static void main(String args[]){
        List<String> list = Arrays.asList("SUDHIR","H","E","L","O","G","K");
        list.parallelStream().forEach(System.out::print); //Gives Different result because they operate parallel.
        //SUDHIRLEOGKH
        //OLSUDHIREHGK
        System.out.println();
        //Syntax to know how many processors are there in the CPU
        System.out.println("Available Processors = "+Runtime.getRuntime().availableProcessors());
    }
}
