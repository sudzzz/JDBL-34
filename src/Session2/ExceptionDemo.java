package Session2;

public class ExceptionDemo {
    public static void main(String args[]){
        try{
            computeDivison(10);
            computeDivison(0);
        }
        catch (ArithmeticException e){
            System.out.println("I am in Catch Block catching Arithmetic Exception");
        }
        finally {
            System.out.println("I am in Finally Block!");
        }
        //If there is no catch block,only try and finally, then the "Other Code" will not be executed.
        //If there is a catch block, "Other Code" will also be executed.
        //Other Code
        System.out.println("I am also useful");
    }
    public static void computeDivison(int number){
        int x = 100/number;
        System.out.println("X = "+x);
    }
}
