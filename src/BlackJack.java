public class BlackJack {
    public boolean dealerWins(Hand playerHand)
    {
        int playerHandValue = getHandValue(playerHand);

        Hand dealerHand = DealerManager.Hand;
        int dealerHandValue = getHandValue(dealerHand);

        return dealerHandValue>=playerHandValue;

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
