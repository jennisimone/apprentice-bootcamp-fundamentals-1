//package cards.encapsulation;
//
//
//import cards.Card;
//import cards.Deck;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class ClassicDeck {
//
//    private final int MAX_DECK_SIZE = 52;   // Legal ClassicDeck size
//    private final int MAX_SUIT_SIZE = 4;    // Only 4 suits exist
//    private final int MAX_FACE_VALUE = 13;  // Ace through King
//    private final int MAX_CARD_ATTRIBUTES = 2;  // each card has a Suit and a Face Value
//
//    private String faceValueName;
//    private String suitName;
//
//    private List<Card> classicCards;
//
//
//
//    @Override
//    public void shuffle() {
//        Collections.shuffle(classicCards);
//    }
//
//
//    @Override
//    public Card deal() {
//        return classicCards.remove(0);
//    }
//
//    @Override
//    public String[] getCards() {
//        String[] result = new String[MAX_DECK_SIZE];
//        int[][] deck = new int[MAX_DECK_SIZE][MAX_CARD_ATTRIBUTES];
//
//        for (int suit = 0; suit < MAX_SUIT_SIZE; suit++) {
//            fillArraysWithValues(deck, suit);
//        }
//        determineCardValuesAndSuits(result, deck);
//        //classicCards = Arrays.asList(result);
//        return result;
//    }
//
//    private void fillArraysWithValues(int[][] deck, int suit) {
//        for (int faceValue = 0; faceValue < MAX_FACE_VALUE; faceValue++) {
//            deck[suit * MAX_FACE_VALUE + faceValue] = new int[]{suit, faceValue};
//        }
//    }
//
//    private void determineCardValuesAndSuits(String[] result, int[][] deck) {
//        int cardNumber = 0;
//        for (int[] card : deck) {
//
//            faceValueName = assignFaceValue(card[1]);
//            suitName = assignSuitType(card[0]);
//
//            result[cardNumber] = faceValueName + " of " + suitName;
//            cardNumber++;
//        }
//    }
//
//    private String assignFaceValue(int cardValue) {
//        switch (cardValue){
//            case 0: faceValueName = "ace"; break;
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9: faceValueName = Integer.toString(cardValue +1); break; // +1 accounts for there being no zero
//            case 10: faceValueName = "jack"; break;
//            case 11: faceValueName = "queen"; break;
//            case 12: faceValueName = "king"; break;
//            default: throw new IllegalArgumentException("Something went wrong " + cardValue + "is not a valid faceValue!");
//        }
//        return faceValueName;
//    }
//
//    private String assignSuitType(int suitArrayValue) {
//        switch (suitArrayValue){
//            case 0: suitName = "clubs"; break;
//            case 1: suitName = "diamonds"; break;
//            case 2: suitName = "hearts"; break;
//            case 3: suitName = "spades"; break;
//            default: throw new IllegalArgumentException("Something went wrong " + suitArrayValue + "is not a valid suitName!");
//        }
//        return suitName;
//    }
//
//
//
//
//}
