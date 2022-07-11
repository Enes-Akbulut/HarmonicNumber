import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.println(" Enter a number : ");

        double sayi= girdi.nextInt();
        double a,result=0;
        for (double i =1; i<=sayi; i++){
            a=(1/i);
            result=result+a;
        }
        System.out.println(result);
    }
}