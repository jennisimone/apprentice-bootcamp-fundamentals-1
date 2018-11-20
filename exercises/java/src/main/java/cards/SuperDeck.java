package cards;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuperDeck implements Deck {

    private PokerDeck pokerDeck;
    private AnimalDeck animalDeck;
    private List<Card> cards;

    public SuperDeck(PokerDeck pokerDeck, AnimalDeck animalDeck) {
        this.pokerDeck = pokerDeck;
        this.animalDeck = animalDeck;

        cards = new ArrayList<>();
        cards.addAll(pokerDeck.getPokerCards());
        cards.addAll(animalDeck.getAnimalCards());

    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }

    @Override
    public List<Card> getCards() {
        return this.cards;
    }


}
