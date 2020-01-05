package observer;

import strategy.memberships.Membership;

import javax.swing.*;
import java.util.Date;

public class Customer implements Observer {
    private String name;
    private String address;
    private Date dob;
    private Membership membership;
    private NewsUpdate newsUpdate;

    public Customer(NewsUpdate newsUpdate) {
        this.newsUpdate = newsUpdate;
        membership=Membership.STANDARD;
    }

    public void setMembership(Membership membership) {
        if(this.membership == Membership.PREMIUM && membership == Membership.STANDARD) {
            this.membership = membership;
            newsUpdate.removeObserver(this);
        }else if(this.membership == Membership.STANDARD && membership == Membership.PREMIUM) {
            this.membership = membership;
            newsUpdate.registerObserver(this);
        }else {
            this.membership = membership;
        }
    }

    @Override
    public void update(String newsUpdate) {
        JOptionPane.showMessageDialog(null, "Hello " + name + "\nNews update available: \n" + newsUpdate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Membership getMembership() {
        return membership;
    }



    @Override
    public String toString() {
        return "Customer: \n" +
                "name: " + name +
                "\naddress: " + address +
                "\ndob: " + dob +
                "\nmembership: " + membership;
    }

}
