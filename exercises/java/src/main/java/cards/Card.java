package cards;

public abstract class Card {

    public boolean snap( Card otherCard ){
        return otherCard != null && this.getValue().equals(otherCard.getValue());
    }

    abstract String cardName();

    abstract String getValue();

}
