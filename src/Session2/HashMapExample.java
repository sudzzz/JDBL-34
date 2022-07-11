package Session2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<Integer,String> phoneDirectory = new HashMap<>();
        phoneDirectory.put(123456,"Sudhir");
        phoneDirectory.put(456789,"Daga");
        phoneDirectory.put(135792,"Mona");
        System.out.println(phoneDirectory);

        for(Integer phone : phoneDirectory.keySet()){
           System.out.println(phone);
        }
        for(String name : phoneDirectory.values()){
            System.out.println(name);
        }
        for(Map.Entry<Integer,String> entry : phoneDirectory.entrySet()){
            System.out.println(entry);
        }

        phoneDirectory.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).forEach(System.out :: print);

    }
}
