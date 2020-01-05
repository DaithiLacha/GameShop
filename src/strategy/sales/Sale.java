package strategy.sales;

public interface Sale {
    String getName();
    void setName(String name);
    double applyDiscount();
}
