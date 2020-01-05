import adapter.TradeIn;
import adapter.TradeInAdapter;
import decorator.*;
import factory.AssignGameType;
import factory.GameFactory;
import objects.Purchase;
import observer.Customer;
import observer.NewsUpdate;
import strategy.memberships.Membership;
import strategy.payment.Cash;
import strategy.payment.Paypal;
import strategy.sales.Christmas;

import javax.swing.*;
import java.util.GregorianCalendar;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */


public class Driver {
    public static void main(String[] args) {
        NewsUpdate newsUpdate = new NewsUpdate();
        Customer dave = new Customer(newsUpdate);
        dave.setName("David O'Connor");
        dave.setAddress("Tralee");
        dave.setDob(new GregorianCalendar(1, 1,1960).getTime());
        dave.setMembership(Membership.PREMIUM);

        Customer bob = new Customer(newsUpdate);
        bob.setName("Bob Bobson");
        bob.setAddress("Tralee");
        bob.setDob(new GregorianCalendar(1960, 1,1).getTime());
        bob.setMembership(Membership.PREMIUM);

        Customer rob = new Customer(newsUpdate);
        rob.setName("Rob Robson");
        rob.setAddress("Tralee");
        rob.setDob(new GregorianCalendar(1960, 1,1).getTime());


        newsUpdate.makeAnnouncement("Cyberpunk 2022 is now available to premium members for pre-order");

//        GameFactory gameFactory = new GameFactory();
//        AssignGameType assignGameType = new AssignGameType(gameFactory);
//        String gameType = JOptionPane.showInputDialog("Enter game platform");
//        Game gta = assignGameType.determineGame(gameType);
        Game gta = new PCGame();
        gta .setName("GTA V");
        gta.setGenre("Open World");
        gta = new CollectorsEdition(gta);
        gta = new PreOrder(gta);


        Purchase daveGta = new Purchase();
        daveGta.setCustomer(dave);
        daveGta.setGame(gta);
        daveGta.setSale(new Christmas());
        TradeIn tradeIn = new TradeIn();
        daveGta.setPayment(new TradeInAdapter(tradeIn));
//        daveGta.setPayment(new Cash());
        JOptionPane.showMessageDialog(null, daveGta.printReceipt(),
                "Receipt", JOptionPane.INFORMATION_MESSAGE);


    }
}
