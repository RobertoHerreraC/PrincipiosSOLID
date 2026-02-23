package SRP1;

import java.util.List;

public class Pedido {
    private List<Item> items;
    private double total;

    public List<Item> getItems() {
        return items;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
