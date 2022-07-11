package Session2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(list1);
        list1.addAll(list1);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.get(1));
        list1.set(0,5);
        System.out.println(list1);
        ArrayList<ArrayList<Integer>> twodlist = new ArrayList<ArrayList<Integer>>();
        twodlist.add(new ArrayList<Integer>());
        twodlist.get(0).add(10);
        twodlist.get(0).add(20);
        twodlist.get(0).add(30);
        twodlist.add(new ArrayList<Integer>());
        twodlist.get(1).add(40);
        twodlist.get(1).add(50);
        twodlist.get(1).add(60);
        System.out.println(twodlist);
    }
}
