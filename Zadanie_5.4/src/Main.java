public class Main {
    public static void main(String[] args) {
        System.out.println("Program sortowanie bąbelkowe - obiektowe zasady");
        Sortowanie sortowanie = new Sortowanie();
        int n = 6;
        int[] tablica = new int[n];
        sortowanie.dodajLiczby(tablica);
        sortowanie.sortujLiczby(tablica, n);
        sortowanie.wyswietl(tablica, n);
    }
}

class Sortowanie {
     void dodajLiczby(int[] liczby) {

        liczby[0] = 12;
        liczby[1] = 65;
        liczby[2] = 2;
        liczby[3] = 99;
        liczby[4] = 56;
        liczby[5] = 34;
        System.out.println("Dodano liczby:");
        for (int x : liczby) {
            System.out.println(x);
        }
    }

     void sortujLiczby(int[] liczby, int n) {
        int x;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (liczby[j - 1] > liczby[j]) {
                    x = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }
            }
        }
    }

     void wyswietl(int[] liczby, int n) {
        System.out.println("Posortowane liczby:");
        for (int i = 0; i < n; i++) {
            System.out.println(liczby[i]);
        }
    }
}
