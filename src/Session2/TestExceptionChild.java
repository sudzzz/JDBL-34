package Session2;

class Parent{
    void msg() throws ArithmeticException{
        System.out.println("Parent Class Method");
    }
}

public class TestExceptionChild extends Parent {
    void msg() throws RuntimeException{
        System.out.println("TestExceptionChild Class Method");
    }
    public static void main(String args[]){
        Parent obj = new Parent();
        obj.msg();

        obj = new TestExceptionChild();
        obj.msg();
    }
}
