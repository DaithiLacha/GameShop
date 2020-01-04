import strategy.payment.Cash;
import strategy.payment.Payment;
import strategy.sales.None;
import strategy.sales.Sale;

import java.util.Date;

public class Purchase {
    private Customer customer;
    private Sale sale;
    private Game game;
    private Payment payment;

    public Purchase() {
        payment = new Cash();
        sale = new None();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public double netPrice() {
        return (game.getCost()) - (game.getCost() * sale.applyDiscount());
    }

    @Override
    public String toString() {
        return "Purchase:\n" +
                " customer=" + customer.getName() +
                "\n sale=" + sale.getName() +
                "\n game=" + game.getName() +
                "\n payment=" + payment.toString() +
                "\n price =" + netPrice();
    }
}
