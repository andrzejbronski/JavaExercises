public class Main {
    public static void main(String[] args) {
        System.out.println("Synchronizacja wątków");
        int a[] = {1, 2, 3, 4, 5};
        MojWatek mojWatek1 = new MojWatek("Wątek 1", a);
        MojWatek mojWatek2 = new MojWatek("Wątek 2", a);
        try {
            mojWatek1.wtk.join();
            mojWatek2.wtk.join();
        } catch (InterruptedException ex) {
            System.out.println("Główny wątek został przerwany!!");
        }
    }
}

class SumArray {
    private int suma;

    int sumArray(int[] liczby) {
        suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
            System.out.println("Bierząca wartość sumy dla: " + Thread.currentThread().getName() + " wynosi: " + suma);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("Główny wątek zostsał przerwany!");
            }
        }
        return suma;
    }
}

class MojWatek implements Runnable {
    Thread wtk;
    private static SumArray sumArray = new SumArray();
    private int a[];
    private int odp;

    MojWatek(String nazwa, int liczby[]) {
        wtk = new Thread(this, nazwa);
        wtk.start();
        a = liczby;
    }

    public void run() {
        System.out.println(wtk.getName() + " startuje");

        synchronized (sumArray) {
            odp = sumArray.sumArray(a);
        }
        System.out.println("Suma końcowa dla" + wtk.getName() + " wynosi: " + odp);
        System.out.println(wtk.getName() + " został zakończony");
    }
}
