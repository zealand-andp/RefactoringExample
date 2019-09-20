public class BlackJack {
    public boolean dealerWins(Hand hand1)
    {
        Hand h1 = hand1; int sum1 =0;
        for (Card c : h1)
        {
            sum1 += value(c.Value, h1);
        }
        Hand h2 = DealerManager.Hand; int sum2 =0;
        for (Card c : h2)
        {
            sum2 += value(c.Value, h2);
        }
        if (sum2>=sum1)
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
