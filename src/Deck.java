public class Deck {
    public final static int n = 52;

    public final Card[] cards = new Card[52];
    private int cnt = 0;

    public Deck() {
        while(cnt < n) {
            for(int i = 1; i < Card.KING + 1; i++) {
                for (int j = 1; j < Card.SPADES + 1; j++) {
                    cards[cnt] = new Card(i, j);
                    cnt++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Deck dk = new Deck();
        for(int i = 0; i < 52; i++) {
            System.out.println(dk.cards[i].getRank() + " " + dk.cards[i].getSuit() );
        }
    }
}
