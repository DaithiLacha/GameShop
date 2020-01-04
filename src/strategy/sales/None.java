package strategy.sales;

public class None implements Sale {
    private String name;

    public None() {
        name = "None";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double applyDiscount() {
        return 0.0;
    }
}
