

public class Card
{
    private final String face;

    public Card(String cardFace)
    {
        this.face = cardFace;
    }
    public String toString()               // This method returns the name of the card as a string when it is called
    {
        String face = this.face;
        return face;
    }
}
