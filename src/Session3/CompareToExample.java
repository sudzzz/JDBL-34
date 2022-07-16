package Session3;

import java.math.BigDecimal;
import java.util.*;

class Developer{
    String name;
    BigDecimal salary;
    int age;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class CompareToExample {
    public static void main(String args[]){
        List<Developer> listDev = new ArrayList<>();
        listDev.add(new Developer("ketan",new BigDecimal("70000"),22));
        listDev.add(new Developer("alvin",new BigDecimal("80000"),32));
        listDev.add(new Developer("iris",new BigDecimal("65000"),23));
        listDev.add(new Developer("jason",new BigDecimal("170000"),24));

        //The below print statement will print the reference of the Developer object created while adding in the list
        //To print the data of the list we have to override the toString() method in Developer class
        System.out.println("Before Sort"+listDev);

        //Sorting using anonymous class
//        Collections.sort(listDev, new Comparator<Developer>() {
//            @Override
//            public int compare(Developer o1, Developer o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        //Sorting using lambda expression
//        Collections.sort(listDev,(o1,o2)->o1.getName().compareTo(o2.getName()));
        listDev.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        for(Developer developer : listDev)
//            System.out.println(developer);

        listDev.forEach((developer) -> System.out.println(developer));

    }

}
