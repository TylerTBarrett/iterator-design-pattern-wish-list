/**
 * A virtual representation of a WishList
 * @author Tyler Barrett
 * 
 */

public class WishList {
    private String name;
    private Item[] items;
    private int count;

    public WishList(String name) {
        this.name = name;
        items = new Item[5];
    }

    public void addItem(String title, String description, double price) {
        if (count == items.length) {
            items = growArray(items);
        }
        items[count] = new Item(title, description, price);
        count++;
    }

    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    public double getTotalCost() {
        WishListIterator iterator = createIterator();
        double totalcost = 0;
        while(iterator.hasNext()) {
            Item curritem = iterator.next();
            totalcost += curritem.getPrice();
        }
        return totalcost;
    }

    private Item[] growArray(Item[] items) {
        Item[] itemscopy = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            itemscopy[i] = items[i];
        }
        return itemscopy;
    }


}