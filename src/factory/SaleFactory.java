package factory;

import strategy.sales.*;

public class SaleFactory {
    Sale createSale(String saleType) {
        Sale sale = null;

        if(saleType.equalsIgnoreCase("Christmas")) {
            sale = new Christmas();
        }else if(saleType.equalsIgnoreCase("Summer")) {
            sale = new Summer();
        }else if(saleType.equalsIgnoreCase("Halloween")) {
            sale = new Halloween();
        }else if(saleType.equalsIgnoreCase("None")) {
            sale = new None();
        }

        return sale;
    }
}
