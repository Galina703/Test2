import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        double nr = sc.nextDouble();

        if (nr >= 0) {
        System.out.println("Pozitiv.");

        } else {
            System.out.println("Negativ.");
        }

   }
}





