/**
 * An Iterator for Wish List
 * @autor Tyler Barrett
 * 
 */

import java.util.Iterator;

public class WishListIterator implements Iterator<Item> {
    private Item[] items;
    private int position;

    /**
     * Will construct a new WishListIterator and set the values for position and items
     * @param items Item[] used to set the value of items in the iterator
     */
    public WishListIterator(Item[] items) {
        position = 0;
        this.items = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            this.items[i] = items[i];
        }
    }

    /**
     * Will check to see if there is another item in the Item[] items and return true if so
     * @return boolean denoting whether there is another item in the Item[] items
     */
    public boolean hasNext() {
        return ((position < items.length) && (items[(position)] != null));
    }

    /**
     * Will access and return the next Item in the Item[] items
     * @return Item that is next in position in the Item[] items
     */
    public Item next() {
        Item ret = items[position];
        position++;
        return ret;
    }
}
