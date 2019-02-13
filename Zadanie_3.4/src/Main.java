public class Main {
    public static void main(String[]args){
        System.out.println("Program zwracający liczby całokwite z przedziału 0-20 używając pętli for");
        for (int i=0; i<=20;i++){
           if (i<20){
               System.out.print(i+", ");
           }else{
               System.out.print(i+".");
           }
        }
    }
}
