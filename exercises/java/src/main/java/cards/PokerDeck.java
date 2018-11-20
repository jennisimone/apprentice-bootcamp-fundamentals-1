package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PokerDeck implements Deck {

    private List<Card> cards;

    public PokerDeck() {
        cards = new ArrayList<>();
        int[][] deck = new int[52][2];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit*13+faceValue] = new int[]{suit, faceValue};
            }
        }

        for (int[] card : deck) {
            String faceValueName;
            switch (card[1]){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(card[1]+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card[1] + "is not a valid faceValue!");
            }

            String suitName;
            switch (card[0]){
                case 0: suitName = "clubs"; break;
                case 1: suitName = "diamonds"; break;
                case 2: suitName = "hearts"; break;
                case 3: suitName = "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card[0] + "is not a valid suitName!");
            }

            cards.add(new PokerCard(faceValueName, suitName));
        }
    }

    public List<Card> getPokerCards(){
        return this.cards;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }


    @Override
    public List<Card> getCards() {
        return this.cards;
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }
}
