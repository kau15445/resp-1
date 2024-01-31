import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        // Card class definition
        class Card {
            int number;
            String suit;

            Card(int number, String suit) {
                this.number = number;
                this.suit = suit;
            }
        }

        // Array of suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        // Array to hold seven cards
        Card[] magicHand = new Card[7];
        Random random = new Random();

        // Generate random cards
        for (int i = 0; i < magicHand.length; i++) {
            int number = random.nextInt(13) + 1; // Numbers 1 to 13
            String suit = suits[random.nextInt(suits.length)]; // Random suit
            magicHand[i] = new Card(number, suit);
        }

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card number (1-13):");
        int userNumber = scanner.nextInt();
        System.out.println("Pick a suit (Hearts, Diamonds, Clubs, Spades):");
        String userSuit = scanner.next();

        // Search for the user's card in the magic hand
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.number == userNumber && card.suit.equals(userSuit)) {
                cardFound = true;
                break;
            }
        }

        // Output result
        if (cardFound) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}
