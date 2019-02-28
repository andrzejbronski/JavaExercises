public class Main {
    public static void main(String args[]) {
        System.out.println("Sledzenie zakończenia wątków");
        Watki mojeWatki1 = new Watki("Watek 1");
        Watki mojeWatki2 = new Watki("Watek 2");
        Watki mojeWatki3 = new Watki("Watek 3");


        try {
            mojeWatki1.wtk.join();
            System.out.println("Wątek 1 dołączył");
            mojeWatki2.wtk.join();
            System.out.println("Wątek 2 dołączył");
            mojeWatki3.wtk.join();
            System.out.println("Wątek 3 dołączył");

        } catch (InterruptedException ex) {
            System.out.println("Glowny watek zostal przerwany!");
        }

        System.out.println("Glowny watek zostal zakonczony.");
    }
}

class Watki implements Runnable {
    private int licznik;
    Thread wtk;

    Watki(String nazwa) {
        wtk = new Thread(this, nazwa);
        licznik = 0;
        wtk.start();
    }

    public void run() {
        System.out.println(wtk.getName() + " Startuje");

        try {
            do {
                Thread.sleep(500);
                System.out.println(wtk.getName() + " licznik = " + licznik);
                licznik++;

            } while (licznik < 10);

        } catch (InterruptedException ex) {
            System.out.println(wtk.getName() + " przerwany ");
        }
        System.out.println(wtk.getName() + " zakonczony ");
    }
}