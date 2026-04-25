import java.util.Scanner;

public class Exercitiu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduceti trei numere: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a == b && b ==c ) {
            System.out.println("Numerele sunt egale");
        } else if ( a!= b && b != c && a != c ) {
            System.out.println("Toate numere sunt diferite");
        } else {
            System.out.println("Nici nu sunt egale nici diferite");
        }

    }
}
