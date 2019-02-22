import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program \"Osoba\"");
        Kadra kadra = new Kadra();
        kadra.setPerson1();
        kadra.drukuj1();
    }
}

class Osoba {
    private String nazwisko;
    private String imie;
    private String ulica;
    private String kod;
    private String miasto;

    void setPerson() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj nazwisko:");
        nazwisko = bufferedReader.readLine();
        System.out.println("Podaj imie:");
        imie = bufferedReader.readLine();
        System.out.println("Podaj nazwę ulicy:");
        ulica = bufferedReader.readLine();
        System.out.println("Podaj kod miasta:");
        kod = bufferedReader.readLine();
        System.out.println("Podaj miasto:");
        miasto = bufferedReader.readLine();

    }

    void drukuj() {
        System.out.println("\nPodane nazwisko to: " + nazwisko);
        System.out.println("Podane imie to: " + imie);
        System.out.println("Podana ulica to: " + ulica);
        System.out.println("Podany kod to: " + kod);
        System.out.println("Podane miasto to: " + miasto);
    }
}

class Kadra extends Osoba {
    private String wyksztalcenie;
    private String pozycja;

    void setPerson1() throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        setPerson();
        System.out.println("Podaj wykształcenie:");
        wyksztalcenie = bufferedReader.readLine();
        System.out.println("Podaj stanowisko:");
        pozycja = bufferedReader.readLine();
    }

    void drukuj1() {
        drukuj();
        System.out.println("Podane wykształcenie: " + wyksztalcenie);
        System.out.println("Podane stanowisko: " + pozycja);
    }
}
