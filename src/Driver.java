import java.util.GregorianCalendar;

public class Driver {
    public static void main(String[] args) {
        Customer dave = new Customer();
        dave.setName("David O'Connor");
        dave.setAddress("Tralee");
        dave.setDob(new GregorianCalendar(01,01,1960).getTime());

        Game gta = new Game();
        gta.setName("Grand Theft Auto V");
        gta.setCost(59.99);
        gta.setGenre("Open World");

        Purchase daveGta = new Purchase();
        daveGta.setCustomer(dave);
        daveGta.setGame(gta);
        daveGta.toString();
        System.out.println(daveGta.toString());
    }
}
