package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck implements Deck {

    private List<Card> cards;

    AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    public List<Card> getAnimalCards()
    {
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
