public class Main {
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby parzyste i nie parzyste z przedziału 1-100");
        int sumaParzyste, sumaNieparzyste;
        int[] liczby = new int[100];
        for (int i = 1; i <= liczby.length; i++) {
            liczby[i - 1] = i;
        }

        sumaNieparzyste = 0;
        sumaParzyste = 0;
        for (int x : liczby) {
            if (x % 2 == 0) {
                sumaParzyste += x;

            } else {
                sumaNieparzyste += x;
            }
        }
        System.out.println("Suma liczb parzystych wynosi: " + sumaParzyste);
        System.out.println("Suma liczb nieparzystych wynosi: " + sumaNieparzyste);

    }
}
