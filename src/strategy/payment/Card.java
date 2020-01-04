package strategy.payment;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Card implements Payment {
    private String cardNum;
    private String cvv;
    private String expDate;

    public void makePayment(double sum, String name) {
        cardInfo();
        System.out.println("Purchased by " + name + "Paid by cash: €" + sum);
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void cardInfo() {
        BufferedReader info = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Card Number: ");
            cardNum = info.readLine();

            System.out.println("Card CVV: ");
            cvv = info.readLine();

            System.out.println("Expiry Date: ");
            expDate = info.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNum='" + cardNum + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expDate='" + expDate + '\'' +
                '}';
    }
}
