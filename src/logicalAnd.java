public class logicalAnd {
    public static void main(String[] args) {
        int Pastscore = 70;
        if (Pastscore < 100) {
            System.out.println("You got the average mark");

            int Presentscore = 80;
            if (Pastscore < Presentscore && Presentscore < 100) {
                System.out.println("You got a better result");

            }
        }
    }
}