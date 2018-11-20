package cards;

import java.util.List;

public interface Deck {

    void shuffle();

    Card deal();

    List<Card> getCards();

}
