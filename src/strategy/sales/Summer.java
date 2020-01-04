package strategy.sales;

public class Summer implements Sale {
    private String name;

    public Summer() {
        name = "Summer";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double applyDiscount() {
        return 0.15;
    }
}
