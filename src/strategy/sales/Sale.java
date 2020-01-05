package strategy.sales;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */


public interface Sale {
    String getName();
    void setName(String name);
    double applyDiscount();
}
