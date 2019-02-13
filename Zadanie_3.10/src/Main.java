public class Main {
    public static void main(String[]args){
        System.out.println("Program sumuje liczby rzeczywiste, parzyste z przedziału 0-100 używając pętli for");

        int sum = 0;

        for(int i = 0;i <= 100;i++){
            if (i%2 == 0){
                sum +=i;
                System.out.println("Suma wynosi: "+sum);
            }
            i++;
        }
    }
}
