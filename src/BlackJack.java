public class BlackJack {
    public boolean dealerWins(Hand playerHand)
    {
        int playerHandValue =0;
        for (Card card : playerHand)
        {
            playerHandValue += value(card.Value, playerHand);
        }

        Hand dealerHand = DealerManager.Hand;
        int dealerHandValue =0;
        for (Card card : dealerHand)
        {
            dealerHandValue += value(card.Value, dealerHand);
        }
        if (dealerHandValue>=playerHandValue)
        {
            return true;
        }
        else
            return false;
    }

    public int value(int value, Hand hand) {
        return value;
    }
}
