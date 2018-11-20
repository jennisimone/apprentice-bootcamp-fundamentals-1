package cards;



import java.util.Scanner;


class Snap {
    private int player1Score;
    private int player2Score;
    private SuperDeck superDeck;




    Snap(SuperDeck superDeck) {
        this.superDeck = superDeck;
        superDeck.shuffle();
    }

    public static void main(String[] args) {
        AnimalDeck animalDeck = new AnimalDeck();
        PokerDeck pokerDeck = new PokerDeck();

        Snap snap = new Snap(new SuperDeck(pokerDeck,animalDeck));
        snap.play();
    }

    void play() {
        Scanner scanner = new Scanner(System.in);

        Card previousCard = null;
        while (superDeck.getCards().size() > 0) {
            Card currentCard = superDeck.deal();
            System.out.println(currentCard);
            String input = scanner.nextLine();
            if (input.length() > 0 && input.charAt(0) == 'a') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! score Player 1");
                    player1Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 1");
                    player1Score--;
                }
            } else if (input.length() > 0 && input.charAt(0) == 'l') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! scorePlayer 2");
                    player2Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 2");
                    player2Score--;
                }
            }
            previousCard = currentCard;
        }

        if (player1Score == player2Score) {
            System.out.println("Draw.");
        } else if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else System.out.println("Player 2 wins!");

        System.out.println("Scores: " + player1Score + " vs " + player2Score);
    }
}
