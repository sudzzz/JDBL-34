package Session2;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String args[]){
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("Even Numbers "+ evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("Odd Numbers "+ numbers);
        numbers.addAll(evenNumbers);
        System.out.println(numbers);

        //This method finds the intersection of the two sets
        numbers.retainAll(evenNumbers);
        System.out.println(numbers);
    }
}
