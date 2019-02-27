public class Main {
    public static void main(String args[]) {
        System.out.println("Moj watek startuje");
        Watki mojeWatki = new Watki("Watek 1");
        Thread nowyWatek = new Thread(mojeWatki);

        nowyWatek.start();
        do {
            try {
                Thread.sleep(100);

            } catch (InterruptedException ex) {
                System.out.println("Glowny watek zostal przerwany!");
            }
        } while (mojeWatki.licznik != 10);
        System.out.println("Glowny watek zostal zakonczony.");
    }
}

class Watki implements Runnable {
    int licznik;
   private String nazwaWatku;

    Watki(String nazwa) {
        licznik = 0;
        this.nazwaWatku = nazwa;
    }

    public void run() {
        System.out.println(nazwaWatku + " Startuje");

        try {
            do {
                Thread.sleep(500);
                System.out.println(nazwaWatku + " licznik = " + licznik);
                licznik++;

            } while (licznik < 10);

        } catch (InterruptedException ex) {
            System.out.println(nazwaWatku + " przerwany ");
        }
        System.out.println(nazwaWatku + " zakonczony ");

    }
}