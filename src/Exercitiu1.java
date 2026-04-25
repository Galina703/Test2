public class Exercitiu1 {
    public static void main(String[] args) {
        byte b = 20;
        short s = b; // byte in short
        System.out.println("Short: " + s);

        int i = 80;
        double d = i; //int in double
        System.out.println("Double: " + d);

        long l = 1000;
        int i2 = (int) l; //long in int
        System.out.println("Int din long: " +i2);

    }
}
