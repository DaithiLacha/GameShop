package adapter;

import strategy.payment.Payment;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

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
