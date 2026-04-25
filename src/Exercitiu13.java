public class Exercitiu13 {
    abstract class Animal {
        private String nume; // Incapsulare

        public abstract void scoateSunet();
    }
    class Caine extends Animal { //Mostenire
        @Override
        public void scoateSunet() {
            System.out.println("Ham!");
        }

    }
}
