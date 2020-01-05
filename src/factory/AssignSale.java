package factory;

import strategy.sales.Sale;

public class AssignSale {
    private SaleFactory factory;

    public AssignSale(SaleFactory factory) {
        this.factory = factory;
    }

    public Sale determineSale(String type) {
        Sale sale;
        sale = factory.createSale(type);

        return sale;
    }
}
