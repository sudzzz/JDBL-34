package Session2;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String args[]){
        Deque<Integer> arr = new ArrayDeque<Integer>();
        arr.addFirst(1);
        arr.addFirst(2);
        arr.addFirst(3);
        arr.addLast(4);
        System.out.println(arr);
    }

}
