public class Task82 {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW");
    }
}
     class Auto {
        String model;

        public Auto (String model) {
            this.model = model;
            System.out.println( model);
        }

    }


