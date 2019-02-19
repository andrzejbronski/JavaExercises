import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[]args){
        System.out.println("Program dodaje 6 liczb do ArrayList,sortuje,usuwa drugi element z listy, " +
                "dodaje nowy element i sortuje ponownie");
        ArrayList lista = new ArrayList();
        lista.add(45);
        lista.add(23);
        lista.add(99);
        lista.add(12);
        lista.add(3);
        lista.add(66);

        System.out.println("Lista nie posortowana: ");
        wyswietlListe(lista);
        Collections.sort(lista);
        System.out.println("Lista posortowana:");
        wyswietlListe(lista);
        lista.remove(1);
        lista.add(2);
        Collections.sort(lista);
        System.out.println("Posortowana lista po usunięciu i dodaniu nowego elementu");
        wyswietlListe(lista);
    }
    private static void wyswietlListe(ArrayList list){
        for (Object x:list){
            System.out.println(x);
        }
    }
}
