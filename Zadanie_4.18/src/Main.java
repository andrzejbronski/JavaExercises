import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program dodaje 6 imion do ArrayList a następnie je sortuje i wyświetla");
        ArrayList<String> lista = new ArrayList();
        lista.add("Sebastian");
        lista.add("Ola");
        lista.add("Karol");
        lista.add("Adam");
        lista.add("Tomek");
        lista.add("Grzegorz");
        System.out.println("Lista imion bez sortowania:");
        wyswietl(lista);
        System.out.println("\nLista imion po sortowaniu:");
        Collections.sort(lista);
        wyswietl(lista);
        System.out.println("\nUsunięcie drugiego elementu");
        lista.remove(1);
        wyswietl(lista);
        System.out.println("\nDodanie imienia Rafał oraz ponowne sortowanie");
        lista.add("Rafał");
        Collections.sort(lista);
        wyswietl(lista);

    }

    private static void wyswietl(ArrayList list) {
        for (Object x : list) {
            System.out.print(x + " ");
        }
    }
}
