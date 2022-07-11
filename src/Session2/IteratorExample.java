package Session2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        System.out.println(numbers);

        Iterator<Integer> iteratorObj = numbers.iterator();

        //int number = iteratorObj.next();
        System.out.println(iteratorObj.next());
        while(iteratorObj.hasNext()){
            iteratorObj.forEachRemaining(value->System.out.println(value*2+" "));
        }
        for(Integer x : numbers){
            System.out.print(x+" ");
        }
    }
}
