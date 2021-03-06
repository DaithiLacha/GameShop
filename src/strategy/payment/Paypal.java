package strategy.payment;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paypal implements Payment{
    private String username;
    private String email;

    public void makePayment(double sum, String name) {
        BufferedReader info = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Username: ");
            username = info.readLine();

            System.out.println("Email: ");
            email = info.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Paypal {" +
                "\n\t\tusername='" + username +
                "\n\t\temail='" + email + "\n\t}";
    }
}
