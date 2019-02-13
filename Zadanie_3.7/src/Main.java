public class Main {
    public static void main(String[]args){
        System.out.println("Program sumujący liczby z zakresu 0-100 używając pętli for");
        int sum = 0;
        for (int i = 0;i<=100;i++){
            sum = sum+i;
            System.out.println("Iteracja nr."+i+" suma: "+sum);
        }
    }
}
