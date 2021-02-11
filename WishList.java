/**
 * A virtual representation of a WishList
 * @author Tyler Barrett
 * 
 */

public class WishList {
    private String name;
    private Item[] items;
    private int count;

    /**
     * Constructs a new WishList with an array of length 5 for the items
     */
    public WishList(String name) {
        this.name = name;
        items = new Item[5];
    }

    /**
     * Adds an item to the array of items in the WishList based on the 
     * inputted parameters. Will grow the array if the current array of
     * items is not large enough.
     * @param title String that will be used to set the title of the item 
     * @param description String that will be used to set the description of the item
     * @param price double that will be used to set the price of the item
     */
    public void addItem(String title, String description, double price) {
        if (count == items.length) {
            items = growArray(items);
        }
        items[count] = new Item(title, description, price);
        count++;
    }

    /**
     * Will construct and return a new WishListIterator
     * @return WishListIterator based on the current items in the WishList
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    /**
     * Will return the total cost of all the current items in the WishList
     * @return double based on the cost of the items in the WishList
     */
    public double getTotalCost() {
        WishListIterator iterator = createIterator();
        double totalcost = 0;
        while(iterator.hasNext()) {
            Item curritem = iterator.next();
            totalcost += curritem.getPrice();
        }
        return totalcost;
    }

    /**
     * Will double the length of the current items array in the class so as to
     * add more room for more items
     * @return Item[] double the length of the inputted array, but with the same data
     * in the original positions
     */
    private Item[] growArray(Item[] items) {
        Item[] itemscopy = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            itemscopy[i] = items[i];
        }
        return itemscopy;
    }
}