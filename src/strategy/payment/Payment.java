package strategy.payment;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */


public interface Payment {
    void makePayment(double sum, String name);
}
