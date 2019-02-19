public class Main {
    public static void main(String[] args) {
        System.out.println("Program sortuje rosnąco 6 liczb - algorytm sortowania bąbelkowego");
        int y;
        int[] liczby = {574, 303, 34, 125, 8, 23};
        System.out.println("Liczby przed sortowaniem:");
        for (int x : liczby) {
            System.out.println(x);
        }
        for (int i = 1; i < liczby.length; i++) {
            for (int j = 5; j >= i; j--) {
                if ((liczby[j - 1] > liczby[j])) {
                    y = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = y;
                }
            }
        }
        System.out.println("Liczby po sortowaniu:");
        for (int x : liczby) {
            System.out.println(x);
        }
    }
}

