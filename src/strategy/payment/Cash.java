package strategy.payment;

public class Cash implements Payment {
    public void makePayment(double sum, String name) {
        cashInfo();
    }

    public void cashInfo() {

    }

    @Override
    public String toString() {
        return "Cash";
    }
}
