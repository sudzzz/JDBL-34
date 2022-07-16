package Session3;

@FunctionalInterface
interface myInterface{
    int getSum(int a,int b);
    default void printString(){
        System.out.println("I am a default method");
    }
}

//One way
//public class FunctionalInterfaceTest implements myInterface{
//
//    public static void main(String args[]){
//
//    }
//
//    @Override
//    public int getSum(int a, int b) {
//        return 0;
//    }
//
//    @Override
//    public void printString() {
//        myInterface.super.printString();
//    }
//}

//Anonymous class
//public class FunctionalInterfaceTest{
//    myInterface intr= new myInterface() {
//        @Override
//        public int getSum(int a, int b) {
//            return (a+b);
//        }
//    };
//    public static void main(String args[]){
//        FunctionalInterfaceTest obj = new FunctionalInterfaceTest();
//        System.out.println(obj.intr.getSum(10,20));
//    }
//}

public class FunctionalInterfaceTest{

    public static void main(String args[]){
        myInterface intr= new myInterface() {
            @Override
            public int getSum(int a, int b) {
                return (a+b);
            }
        };
        System.out.println(intr.getSum(10,20));
        intr.printString();

        myInterface intra = (a,b)-> {return (a+b);};
        System.out.println(intra.getSum(3,4));
    }
}
