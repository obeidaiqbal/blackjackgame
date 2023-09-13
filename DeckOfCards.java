
import java.security.SecureRandom;

public class DeckOfCards
{
    private static final SecureRandom randomNumbers = new SecureRandom();     // This adds the random java class
    private static final int NUMBER_OF_CARDS = 52;                         // This initializes the total card count for
                                                                           // the deck
    private Card[] deck = new Card[NUMBER_OF_CARDS];      // This calls to the Card class
    private int currentCard = 0;

    public DeckOfCards()              // This method initializes the different cards that could possibly be dealt
    {
        String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Jack", "Queen", "King"};

        for (int count = 0; count < deck.length; count++)
        {
            deck[count] = new Card(faces[count % 13]);         // This randomly selects a card
        }
    }
    public void shuffle()         // This method is called when the deck needs to be shuffled
    {
        currentCard = 0;

        for (int first = 0; first < deck.length; first++)
        {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public String dealCard()          // This method is called when a card is being dealt from the deck
    {
        if (currentCard < deck.length)
        {
            return String.valueOf(deck[currentCard++]);
        }
        else
        {
            return null;
        }
    }
}
