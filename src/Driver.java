import adapter.TradeIn;
import adapter.TradeInAdapter;
import decorator.CollectorsEdition;
import decorator.PCGame;
import decorator.SeasonPass;
import factory.AssignGameType;
import factory.GameFactory;
import objects.Purchase;
import observer.Customer;
import decorator.Game;
import observer.NewsUpdate;
import strategy.memberships.Membership;
import strategy.payment.Cash;
import strategy.payment.Paypal;
import strategy.sales.Christmas;

import java.util.GregorianCalendar;

public class Driver {
    public static void main(String[] args) {
        NewsUpdate newsUpdate = new NewsUpdate();
        Customer dave = new Customer(newsUpdate);
        dave.setName("David O'Connor");
        dave.setAddress("Tralee");
        dave.setDob(new GregorianCalendar(1, 1,1960).getTime());
        dave.setMembership(Membership.PREMIUM);
        System.out.println(dave.toString());
        System.out.println();

        Customer bob = new Customer(newsUpdate);
        bob.setName("Bob");
        bob.setAddress("Tralee");
        bob.setDob(new GregorianCalendar(1960, 1,1).getTime());
        bob.setMembership(Membership.PREMIUM);

        Customer rob = new Customer(newsUpdate);
        rob.setName("Rob");
        rob.setAddress("Tralee");
        rob.setDob(new GregorianCalendar(1960, 1,1).getTime());


        newsUpdate.makeAnnouncement("Cyberpunk 2022 is now available to premium members for pre-order");

        Game gta = new PCGame();
        gta.setName("Grand Theft Auto V");
        gta.setGenre("Open World");
        gta = new CollectorsEdition(gta);


        Purchase daveGta = new Purchase();
        daveGta.setCustomer(dave);
        daveGta.setGame(gta);
        daveGta.setSale(new Christmas());
        daveGta.setPayment(new Cash());
        System.out.println(daveGta.printReceipt());


    }
}
