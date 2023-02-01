package gr.aueb.cf.ch19Collections;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private T item;
    private List<? extends T> items = new ArrayList<>();

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public List<? extends T> getItems() {
        return items;
    }

    public void setItems(List<? extends T> items) {
        this.items = items;
    }

    public long getCount(List<? extends T> arrList) {
        return arrList.size();
    }
}
