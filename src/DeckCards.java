public class DeckCards {
    public static void main(String[] args) {
        String[] CARDS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        int n = CARDS.length * RANKS.length;
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < CARDS.length; j++) {
                deck[CARDS.length * i + j] = RANKS[i] + " of " + CARDS[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print shuffled deck
        for (int i = 0; i < 4; i++) {
            System.out.println("Person " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
            }
        }
    }
}
