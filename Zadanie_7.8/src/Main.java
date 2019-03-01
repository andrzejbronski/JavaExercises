public class Main {
    public static void main(String[] args) {
        System.out.println("Komunikacja pomiędzy wątkami");
        TikTak tt = new TikTak();
        MojWatek mojWatek1 = new MojWatek("Tik", tt);
        MojWatek mojWatek2 = new MojWatek("Tak", tt);
        try {
            mojWatek1.wtk.join();
            mojWatek2.wtk.join();
        } catch (InterruptedException ex) {
            System.out.println("Główny wątek został przerwany!");
        }
    }
}

class TikTak {
    synchronized void tik(boolean chodzi) {
        if (!chodzi) {
            notify();
            return;
        }
        System.out.println("Tik ");
        notify();
        try {
            wait();
        } catch (InterruptedException ex) {
            System.out.println("Wątek został przerwany!");
        }
    }

    synchronized void tak(boolean chodzi) {
        if (!chodzi) {
            notify();
            return;
        }
        System.out.println("Tak");
        notify();
        try {
            wait();
        } catch (InterruptedException ex) {
            System.out.println("Wątek został przerwany");
        }
    }
}

class MojWatek implements Runnable {
    Thread wtk;
    private TikTak tikTak;

    MojWatek(String nazwa, TikTak tt) {
        wtk = new Thread(this, nazwa);
        tikTak = tt;
        wtk.start();
    }

    public void run() {
        if (wtk.getName().compareTo("Tik") == 0) {
            for (int i = 0; i < 5; i++) {
                tikTak.tik(true);
                tikTak.tik(false);
            }
        } else {
            for (int i = 0; i < 5; i++) {
                tikTak.tak(true);
                tikTak.tak(false);
            }
        }
    }
}

