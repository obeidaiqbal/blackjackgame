import java.util.Scanner;
import java.util.Stack;
import static java.lang.String.valueOf;

public class CardsGame
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        DeckOfCards myDeckOfCards = new DeckOfCards();

        System.out.println("\t\tWelcome to BlackJack! \nBlackJack is a game where you are dealt cards that\nhave values" +
                " with the goal of getting the cards to \nequal 21. If you go over 21 you go bust and lose.\nIf your" +
                " total is under or equal to 21, the dealer will\ndraw cards and try to get a better score than you." +
                "\nIf the dealer is closer to 21 than you lose, but if\nyou are closer to 21 than the dealer you win!\n");
        System.out.println("");

        String menu = "";
        String menu2 = "";

        while (menu.equals("") || menu.toLowerCase().charAt(0) != 'q')
        {
            System.out.println("Would you like to Play BlackJack or Quit? Enter Y to play and Q to quit: ");
            menu = console.next();

            myDeckOfCards.shuffle();
            int TotalScore = 0;

            if (menu.toLowerCase().charAt(0) == 'y')
            {
                Stack<String> cards = new Stack<String>();
                cards.add(valueOf(myDeckOfCards.dealCard()));
                RunTest(cards, TotalScore);

                while (menu2.equals("") || menu.toLowerCase().charAt(0) != 'q')
                {
                    cards.add(valueOf(myDeckOfCards.dealCard()));
                    RunTest(cards, TotalScore);
                    System.out.println(cards);
                    System.out.println(TotalScore);

                    System.out.println("Would you like to Hit or Hold? Press H to hit and Q to hold: ");
                    menu2 = console.next();

                }
            }
            else if (menu.toLowerCase().charAt(0) != 'q')
            {
                System.out.println("\n\nInvalid input\nplease try again");
            }
        }
    }
    static void RunTest(Stack<String> cards, int TotalScore)
    {
        Scanner console = new Scanner(System.in);
        switch (cards.peek())
        {
            case "Ace":
                TotalScore = TotalScore + 1;
                break;
            case "Two":
                TotalScore = TotalScore + 2;
                break;
            case "Three":
                TotalScore = TotalScore + 3;
                break;
            case "Four":
                TotalScore = TotalScore + 4;
                break;
            case "Five":
                TotalScore = TotalScore + 5;
                break;
            case "Six":
                TotalScore = TotalScore + 6;
                break;
            case "Seven":
                TotalScore = TotalScore + 7;
                break;
            case "Eight":
                TotalScore = TotalScore + 8;
                break;
            case "Nine":
                TotalScore = TotalScore + 9;
                break;
            case "Ten":
                TotalScore = TotalScore + 10;
                break;
            case "Jack":
                TotalScore = TotalScore + 10;
                break;
            case "Queen":
                TotalScore = TotalScore + 10;
                break;
            case "King":
                TotalScore = TotalScore + 10;
                break;
        }
    }
}

