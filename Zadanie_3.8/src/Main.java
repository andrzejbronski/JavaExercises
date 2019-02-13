public class Main {
    public static void main(String[]args){
        System.out.println("Program zwraca sumę liczb w przedziale 0-100 używając pętli do...while");
        int i = 0;
        int suma = 0 ;

        do {
            suma += i;
            System.out.println("Iteracja nr. "+i+" wynosi: "+suma);
            i++;
        }while (i <= 100);
    }
}
