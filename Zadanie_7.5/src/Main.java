
public class Main {
    public static void main(String[] args) {
        System.out.println("Wstawianie priorytetów");
        Priorytet mw1 = new Priorytet("Wysoki priorytet");
        Priorytet mw2 = new Priorytet("Niski priorytet");

        mw1.wtk.setPriority(Thread.NORM_PRIORITY + 2);
        mw2.wtk.setPriority(Thread.NORM_PRIORITY - 2);

        mw1.wtk.start();
        mw2.wtk.start();

        try {
            mw1.wtk.join();
            mw2.wtk.join();

        } catch (InterruptedException ex) {
            System.out.println("Główny wątek został przerwany");
        }
        System.out.println("Wysoki priorytet wątku, stan licznika: " + mw1.licznik);
        System.out.println("Niski priorytet wątku, stan licznika: " + mw2.licznik);
    }
}

class Priorytet implements Runnable {
    int licznik;
    Thread wtk;
    private static boolean stop = false;
    private static String aktualnaNazwa;

    Priorytet(String nazwa) {
        wtk = new Thread(this, nazwa);
        licznik = 0;
        aktualnaNazwa = nazwa;
    }

    public void run() {
        System.out.println(wtk.getName() + " startuje");
        do {
            licznik++;
            if (!(aktualnaNazwa.equals(wtk.getName()))) {
                aktualnaNazwa = wtk.getName();
                System.out.println(aktualnaNazwa);
            }
        } while (!stop && licznik < 1000);
        stop = true;
        System.out.println(wtk.getName() + " zakończono");
    }

}