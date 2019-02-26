import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program zapis/odczyt plik o dostępie swobodnym");
        Pomiary pomiary = new Pomiary();
        pomiary.pomiarZapis();
        pomiary.odczyt();
    }
}

class Pomiary {
    private double[] tablicaPomiarow = {5.6, 9.4, 6.7, 1.3, 6.8, 5.5, 3.8, 4.7};

    void pomiarZapis() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("dane.dat", "rw");
        for (int i = 0; i < tablicaPomiarow.length; i++) {
            randomAccessFile.writeDouble(tablicaPomiarow[i]);
        }
        randomAccessFile.close();
    }

    void odczyt() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("dane.dat", "r");
        for (int i = 0; i < tablicaPomiarow.length; i += 2) {
            randomAccessFile.seek(8 * i);
            double d = randomAccessFile.readDouble();
            System.out.println(d);
        }
    }
}
