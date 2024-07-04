import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        int heads = 0;
        int tails = 0;

        System.out.println("Tossing a coin...");

        for (int i = 1; i <= 3; i++) {
            boolean toss = random.nextBoolean();
            if (toss) {
                System.out.println("Round " + i + ": Heads");
                heads++;
            } else {
                System.out.println("Round " + i + ": Tails");
                tails++;
            }
        }

        System.out.println("Heads: " + heads + ", Tails: " + tails);
    }
}
