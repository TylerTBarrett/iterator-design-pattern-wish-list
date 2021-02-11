/**
 * A representation of an item on a wishlist
 * @author Tyler Barrett
 * 
 */

public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Constructs a new item based on the inputted parameters
     * @param title String which will be used to set the value of the title for the item
     * @param description String which will be used to set the value of the description for the item
     * @param price double which will be used to set the value of the price for the item
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Will return a String showing the attributes of the item
     * @return String denoting the title, description, and price of the item
     */
    public String toString() {
        return "\n**** " + title + " ****\n" + description + "\nPrice: " + price;
    }

    /**
     * Will access and return the price of the item
     * @return double denoting the price of the item
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Will print the attributes of the item to the console
     */
    public void print() {
        System.out.println(toString());
    }
}
