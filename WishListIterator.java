/**
 * An Iterator for Wish List
 * @autor Tyler Barrett
 * 
 */

import java.util.Iterator;

public class WishListIterator implements Iterator<Item> {
    private Item[] items;
    private int position;

    public WishListIterator(Item[] items) {
        position = 0;
        this.items = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            this.items[i] = items[i];
        }
    }

    public boolean hasNext() {
        return (position) < items.length && items[(position)] != null;
    }

    public Item next() {
        Item ret = items[position];
        position++;
        return ret;
    }
}
