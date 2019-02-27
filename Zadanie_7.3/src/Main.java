public class Main {
    public static void main(String args[]) {
        System.out.println("Moj watek startuje");
        Watki mojeWatki1 = new Watki("Watek 1");
        Watki mojeWatki2 = new Watki("Watek 2");
        Watki mojeWatki3 = new Watki("Watek 3");

        do {
            try {
                Thread.sleep(100);

            } catch (InterruptedException ex) {
                System.out.println("Glowny watek zostal przerwany!");
            }
        } while (mojeWatki1.licznik < 10 || mojeWatki2.licznik < 10 || mojeWatki3.licznik < 10);
        System.out.println("Glowny watek zostal zakonczony.");
    }
}

class Watki implements Runnable {
    int licznik;
    private Thread wtk;

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