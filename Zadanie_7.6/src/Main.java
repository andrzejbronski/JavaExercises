
public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println("Synchronizacja wątków");

        MojWatek mw1 = new MojWatek("Wątek 1", a);
        MojWatek mw2 = new MojWatek("Wątek 2", a);

    }
}

class SumArray {
    private int suma;

    synchronized int sumaArray(int liczby[]) {
        suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
            System.out.println("Bierząca wartość sumy dla: " + Thread.currentThread().getName() +
                    " wynosi " + suma + ".");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("Główny wątek został przerwany");
            }
        }
        return suma;
    }
}

class MojWatek implements Runnable {
    private Thread wtk;
    private static SumArray sa = new SumArray();
    private int a[];
    private int odp;

    MojWatek(String nazwa, int liczby[]) {
        wtk = new Thread(this, nazwa);
        wtk.start();
        a = liczby;
    }

    public void run() {
        System.out.println(wtk.getName() + " startuje.");
        odp = sa.sumaArray(a);
        System.out.println("Suma końcowa dla " + wtk.getName() + " wynos: " + odp + ".");
        System.out.println(wtk.getName() + " został zakończony.");
    }
}
