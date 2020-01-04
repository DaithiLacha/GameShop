import decorator.CollectorsEdition;
import decorator.PCGame;
import decorator.SeasonPass;
import objects.Purchase;
import observers.Customer;
import decorator.Game;
import observers.NewsUpdate;
import strategy.memberships.Membership;
import strategy.payment.Paypal;
import strategy.sales.Christmas;

import java.util.GregorianCalendar;

public class Driver {
    public static void main(String[] args) {
        NewsUpdate newsUpdate = new NewsUpdate();
        Customer dave = new Customer(newsUpdate);
        Customer bob = new Customer(newsUpdate);
        Customer rob = new Customer(newsUpdate);
        dave.setName("David O'Connor");
        dave.setAddress("Tralee");
        dave.setDob(new GregorianCalendar(1, 1,1960).getTime());
        dave.setMembership(Membership.PREMIUM);
        bob.setName("Bob");
        bob.setAddress("Tralee");
        bob.setDob(new GregorianCalendar(1, 1,1960).getTime());
        bob.setMembership(Membership.PREMIUM);
        rob.setName("Rob");
        rob.setAddress("Tralee");
        rob.setDob(new GregorianCalendar(1, 1,1960).getTime());
        System.out.println(dave.toString());
        System.out.println();

        newsUpdate.makeAnnouncement("Cyberpunk 2022 is now available to premium members for pre-order");

        Game gta = new PCGame();
        gta = new CollectorsEdition(gta);
        gta = new SeasonPass(gta);
        gta.setName("Grand Theft Auto V");
        gta.setGenre("Open World");

        Purchase daveGta = new Purchase();
        daveGta.setCustomer(dave);
        daveGta.setGame(gta);
        daveGta.setSale(new Christmas());
        daveGta.setPayment(new Paypal());
        System.out.println(daveGta.toString());
    }
}
