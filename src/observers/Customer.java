package observers;

import observers.NewsUpdate;
import observers.Observer;
import strategy.memberships.Membership;

import java.util.ArrayList;
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

    public void setMembership(Membership membership) {
        this.membership = membership;
        if(membership == Membership.PREMIUM) {
            newsUpdate.registerObserver(this);
        }
    }

    @Override
    public void update(String newsUpdate) {
        System.out.println("News update available: \n" + newsUpdate);
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
