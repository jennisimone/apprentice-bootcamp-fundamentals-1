package cards;

public class AnimalCard extends Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }


    @Override
    public String getValue(){
        return animal.toString();
    }
    @Override
    public String toString() {
        return animal.toString();
    }

    @Override
    public String cardName(){
        return animal.toString();
    };
}
