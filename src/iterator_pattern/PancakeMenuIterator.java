package iterator_pattern;

import java.util.ArrayList;


import java.util.Iterator;
public class PancakeMenuIterator implements Iterator<MenuItem>{
    ArrayList<MenuItem> items;
    int position = 0;
    public PancakeMenuIterator(ArrayList <MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() ) {
            return false;
        } else {
            return true;
        }
    }
}
