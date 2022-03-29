package bibimbap.test.domain;

import java.util.HashMap;
import java.util.Map;

public class ItemStore {
    private static final Map<Integer, Item> store = new HashMap<>();
    private static int sequence = 0;
    private int revenue;

    public ItemStore() {

    }

    public void addItem(Item item) {
        item.setItemId(sequence);
        store.put(item.getItemId(), item);
        sequence += 1;
    }

    public void sellItem(int itemId, int quantity) {
        Item item = store.get(itemId);
        revenue += item.getPrice() * quantity;
        item.setQuantity(item.getQuantity() - quantity);
        store.put(itemId, item);
    }

    public void fillItem(int itemId, int quantity) {
        Item item = store.get(itemId);
        item.setQuantity(item.getQuantity() + quantity);
        store.put(itemId, item);
    }

    public void printItemList() {
        System.out.println("---itemStore---\n[itemList]");
        for (int key: store.keySet()) {
            System.out.printf("[%d] ", key);
            store.get(key).printItem();
        }
        System.out.println("\n[revenue] " + revenue);
    }
}
