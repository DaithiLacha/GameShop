import decorator.CollectorsEdition;
import decorator.PCGame;
import decorator.SeasonPass;
import objects.Purchase;
import objects.Customer;
import decorator.Game;
import strategy.sales.Christmas;

import java.util.GregorianCalendar;

public class Driver {
    public static void main(String[] args) {
        Customer dave = new Customer();
        dave.setName("David O'Connor");
        dave.setAddress("Tralee");
        dave.setDob(new GregorianCalendar(1, 1,1960).getTime());

        Game gta = new PCGame();
        gta = new CollectorsEdition(gta);
        gta = new SeasonPass(gta);
        gta.setName("Grand Theft Auto V");
        gta.setGenre("Open World");

        Purchase daveGta = new Purchase();
        daveGta.setCustomer(dave);
        daveGta.setGame(gta);
        daveGta.setSale(new Christmas());
        System.out.println(daveGta.toString());
    }
}
