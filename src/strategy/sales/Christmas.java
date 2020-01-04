package strategy.sales;

public class Christmas implements Sale{
    private String name;

    public Christmas() {
        name = "Christmas";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double applyDiscount() {
        return 0.4;
    }
}
