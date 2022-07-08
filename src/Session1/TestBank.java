package Session1;

abstract class Bank{
    abstract int getROI();
    abstract void deposit(double depositAmount);
    abstract double withdraw();
}

class SBI extends Bank{

    @Override
    int getROI() {
        return 6;
    }

    @Override
    void deposit(double depositAmount) {

    }

    @Override
    double withdraw() {
        return 0;
    }

    double checkBalance(){
        return 3000;
    }
}

class PNB extends Bank{

    @Override
    int getROI() {
        return 7;
    }

    @Override
    void deposit(double depositAmount) {

    }

    @Override
    double withdraw() {
        return 0;
    }
}

public class TestBank {
    public static void main(String args[]){

        //Parent class object can refer to child class object but inverse is not true. This is runtime polymorphism.

        Bank b;
        b = new SBI();
        System.out.println("SBI "+b.getROI());
        //Parent class object can refer to only those methods which are overridden in child class.
        //checkBalance is there in SBI but not in Bank. So the below code will throw error
        //b.checkBalance();
        b = new PNB();
        System.out.println("PNB "+b.getROI());
    }
}
