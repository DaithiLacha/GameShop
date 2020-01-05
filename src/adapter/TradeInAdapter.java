package adapter;

import strategy.payment.Payment;

public class TradeInAdapter implements Payment {
    private TradeIn tradeIn;

    public TradeInAdapter(TradeIn tradeIn) {
        this.tradeIn = tradeIn;
    }

    @Override
    public void makePayment(double sum, String name) {
        tradeIn.makeTrade();
    }

    @Override
    public String toString() {
        return "Trade In\n" + tradeIn.makeTrade();
    }
}
