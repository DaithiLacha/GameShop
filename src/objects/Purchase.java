package objects;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */

import adapter.TradeInAdapter;
import decorator.Game;
import observer.Customer;
import strategy.payment.Cash;
import strategy.payment.Payment;
import strategy.sales.None;
import strategy.sales.Sale;

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
        payment.makePayment(netPrice(), customer.getName());
    }

    private double netPrice() {
        return (game.cost() - (game.cost() * sale.applyDiscount()));
    }

    public String printReceipt() {
        if(payment instanceof TradeInAdapter) {
            return "Customer name: " + customer.getName() +
                    "\nTitle: " + game.getName() +
                    "\nFull Details: " + game.getDescription() +
                    "\nPayment Type: " + payment.toString();
        }else {
            return "Customer name: " + customer.getName() +
                    "\nTitle: " + game.getName() +
                    "\nPayment Type: " + payment.toString() +
                    "\nFull Details: " + game.getDescription() +
                    "\nSale: " + sale.getName() + " " + sale.applyDiscount()*100 + "% discount" +
                    "\nTotal: " + String.format("€%.2f", netPrice());
        }
    }
}

