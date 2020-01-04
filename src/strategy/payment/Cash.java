package strategy.payment;

public class Cash implements Payment {
    public void makePayment(double sum, String name) {
        System.out.println("Purchased by " + name + "Paid by cash: €" + sum);
    }

    @Override
    public String toString() {
        return "Cash";
    }
}
