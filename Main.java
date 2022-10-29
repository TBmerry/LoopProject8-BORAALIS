import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s,a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Elmas için sayı giriniz  : ");
        s = inp.nextInt();
        for ( a = 1; a <= s; a++) {
            for ( b = 1; b <= (s - a); b++) {
                System.out.print(" ");

            }
            for ( c = 1; c <= ( 2* a - 1 ); c++) {
                System.out.print("B");

            }
            System.out.println(" ");

        }
        for ( a = 1; a < s; a++) {
            for ( b = 1; b <= a; b++) {
                System.out.print(" ");

            }
            for ( c = 1; c <= ( 2 * s - (2 * a + 1) ); c++) {
                System.out.print("B");

            }
            System.out.println(" ");

        }
    }
}