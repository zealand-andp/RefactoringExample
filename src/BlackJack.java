public class BlackJack {
    public boolean dealerWins(Hand playerHand)
    {
        return getHandValue(DealerManager.Hand)>=getHandValue(playerHand);
    }

    private int getHandValue(Hand playerHand) {
        int playerHandValue = 0;
        for (Card card : playerHand) {
            playerHandValue += determineCardValue(card.Value, playerHand);
        }
        return playerHandValue;
    }

    public int determineCardValue(int value, Hand hand) {
        return value;
    }
}
