public class Exercitiu14 {
    public void verificamVarsta(int virsta) throws Exception {
        if (virsta < 16) {
            throw new Exception("Eroare : Varsta prea mica!");
        }
    }
    public static void main (String[] args) {
        Exercitiu14 objeto = new Exercitiu14();

        try {
            objeto.verificamVarsta(12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}

