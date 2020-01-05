package strategy.payment;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cash implements Payment {
    private String name;

    public void makePayment(double sum, String name) {
        BufferedReader info = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Customer Name: ");
            this.name = info.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Cash Payment from " + name;
    }
}
