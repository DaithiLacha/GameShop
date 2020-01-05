package strategy.payment;

public class Cash implements Payment {
    public void makePayment(double sum, String name) {
        System.out.println("Purchased by " + name + "\nPaid by cash: €" + Math.round(sum*100.0)/100.0);
    }

    @Override
    public String toString() {
        return "Cash";
    }
}
