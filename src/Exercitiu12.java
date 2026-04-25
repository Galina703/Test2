public class Exercitiu12 {
    class Parinte {
        private String secret = "Inchis";//Incapsulare

        public String getSecret() {
            return secret;
        }
    }
    class copil extends Parinte { //Mostenirea
        void afiseaza() {
            System.out.println(getSecret());

        }
    }
}
