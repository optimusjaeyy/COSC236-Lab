package restaurant;
// MenuItem class
public class MenuItem {
    private String name;
    //Changed the price attribute name to priceInDollars- by anshika sharma
    private double priceInDollars;

    public MenuItem(String name, double price) {
        this.name = name;
        this.priceInDollars = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return priceInDollars;
    }
}
