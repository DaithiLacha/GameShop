package strategy.sales;

public class Halloween implements Sale{
    private String name;

    public Halloween() {
        name = "Halloween";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double applyDiscount() {
        return 0.1;
    }

}
