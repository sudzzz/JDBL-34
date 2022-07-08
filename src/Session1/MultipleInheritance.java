package Session1;

interface Dog1{
    void eat();
}

interface Cat{
    void eat();
}

class Cat1{

    void eat(){
        System.out.println("Cat");
    }
}

class Animal implements Dog1,Cat{

    //Multiple inheritance using java
    @Override
    public void eat() {

    }
}

class Animal1 extends Cat1 implements Cat{

    @Override
    public void eat() {
        System.out.println("Animal 1 method");
    }

}

public class MultipleInheritance {
    public static void main(String args[]){

    }
}
