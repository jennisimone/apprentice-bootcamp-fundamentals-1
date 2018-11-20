package cards;

    public class PokerCard extends Card {
        private final String value;
        private final String suit;
        public PokerCard(String value, String suit
        ) {
            this.value = value;
            this.suit = suit;
        }
        @Override
        public String getValue(){
            return this.value;
        }
        @Override
        public String cardName() {
            return this.value + " of " + this.suit;
        }

        @Override
        public String toString() {
            return this.cardName();
        }
    }

