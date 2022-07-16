package Session3;

class ThreadA extends Thread{
    @Override
    public void run(){
        System.out.println("ThreadA "+Thread.currentThread().getName());
        for(int j=30;j>0;j--){
            System.out.println("Thread of ThreadA class with i = "+j);
        }
    }
}

class ThreadB extends Thread{
    @Override
    public void run(){
        System.out.println("ThreadB "+Thread.currentThread().getName());
        for(int j=30;j>0;j--){
            System.out.println("Thread of ThreadB class with j = "+j);
        }
    }
}

class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("ThreadRunnable "+Thread.currentThread().getName());
        for(int j=25;j>0;j--){
            System.out.println("Thread of ThreadRunnable class with k = "+j);
        }
    }
}

public class ThreadBasicExample {
    public static void main(String args[]){
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        ThreadRunnable threadC = new ThreadRunnable();
        Thread t1 = new Thread(threadC);
        threadA.start();
        try {
            threadA.join(); //Until and unless threadA is completed no other thread will get CPU
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadB.start();
        threadB.setPriority(10); //Now thread B will execute first then main thread will execute. Default priority of thread is 5
        t1.run();

        //Syntax to get total memory allocated to JVM
        System.out.println("Total Memory allocated to JVM "+Runtime.getRuntime().totalMemory()/1000000+" MB");
        //Syntax to check total memory used by JVM
        System.out.println("Total Memory used by to JVM "+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/1000000+" MB");

        //currentThread() is a native method. Native methods are implemented in native code using JNI(Java Native Interface)
        //The native modifier indicates that a method is implemented in platform-dependent code, often seen in C language
        //It is used to improve the performance of the system and achieve machine level/memory level communication.
        //This breaks the platform independent nature of java
    }
}
