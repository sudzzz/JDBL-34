package Session4;

class Sender{
    public synchronized void send(String msg) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Whatever is enclosed inside the synchronised block is a critical section
        synchronized (this) {
            System.out.println("\n" + msg + " sent");
        }
    }
}

class ThreadSend extends Thread{
    private String msg;
    Sender sender;
    ThreadSend(String msg,Sender sender){
        this.msg = msg;
        this.sender = sender;
    }

    public void run(){
        synchronized (sender){
            sender.send(msg);
        }
    }
}

public class SynchronisedDemo {
    public static void main(String args[]){
        Sender sender = new Sender();
        ThreadSend s1 = new ThreadSend("Hi",sender);
        ThreadSend s2 = new ThreadSend("Bye",sender);

        s1.start();
        s2.start();
    }
}
