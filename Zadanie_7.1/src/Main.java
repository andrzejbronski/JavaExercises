public class Main {
    public static void main(String args[]) {
        Thread NowyWatek = new watki();
        NowyWatek.start();
    }
}

class watki extends Thread {
    public void run() {
        System.out.println("Moj pierwszy watek");
    }
}