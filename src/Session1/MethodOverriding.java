package Session1;

class Parent{
    protected void method1() {
        System.out.println("From Parent Class");
    }
    int x = 10;
}

class Child1 extends Parent{

    //Visibility of overidden method should me more and not less compared to parent method
    public void method1(){
        System.out.println("From Child1 Class");
    }
    int x = 20;
}

class Child2 extends Parent{

    //Visibility of overidden method should me more and not less compared to parent method
    public void method1(){
        System.out.println("From Child2 Class");
    }
    int x = 30;
}

public class MethodOverriding {
    public static void main(String args[]){
        Parent obj1 = new Parent();
        obj1.method1();
        System.out.println(obj1.x); //Output x =10

        obj1 = new Child1();
        obj1.method1();
        System.out.println(obj1.x); //Output x =10

        obj1 = new Child2();
        obj1.method1();
        System.out.println(obj1.x); //Output x =10

        //Runtime Polymorphism is applied only to methods and not to variables

        //Child2 obj = new Child1(); // Not allowed for siblings

        //Child obj2 = new Parent(); not allowed
        //But we can do this by typecasting
        Child2 obj2 = (Child2) new Parent(); // This will not give compile time error but would give runtime error of classCastException
    }
}
