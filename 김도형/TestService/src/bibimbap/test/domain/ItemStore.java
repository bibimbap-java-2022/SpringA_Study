package bibimbap.test.domain;

import java.util.HashMap;
import java.util.Map;

public class ItemStore {
    private static Map<Integer, Item> store = new HashMap<>(); // item이 저장됩니다.
    private static int sequence = 0; // 이 값을 활용해 item에 id를 부여합니다.

    private int revenue; // 수익

    public ItemStore() {

    }

    /**
     * store에 item을 등록해주세요
     * store의 key값은 item의 itemId를 사용합니다.
     * store에 item이 등록되기 전에, sequence 값을 활용해서 itemId를 세팅해주세요
     * @param item : 등록될 아이템
     */
    public void addItem(Item item) {
    	item.setItemId(sequence);
    	store.put(item.getItemId(), item);
    	sequence++;
    }

    /**
     * item을 팔게되면, item 가격과 팔린 수량에 맞게 revenue를 조정해주세요
     * @param itemId : 팔 아이템의 id
     * @param quantity : 팔 아이템의 수량
     */
    public void sellItem(int itemId, int quantity) {
    	Item item = store.get(itemId);
    	revenue += item.getPrice() * quantity;
    	item.setQuantity(item.getQuantity() - quantity);
    	store.put(itemId, item);
    }

    /**
     * item을 채워주세요. 기존에 있는 item에 수량을 조정합니다.
     * @param itemId : 채울 아이템의 id
     * @param quantity : 채울 수량
     */
    public void fillItem(int itemId, int quantity) {
    	Item item = store.get(itemId);
    	item.setQuantity(item.getQuantity() + quantity);
    	store.put(itemId, item);
    }

    // 형식에 맞게 현재 보유중인 아이템들을 출력해주세요
    public void printItemList() {
    	System.out.println("---itemStore---");
    	System.out.println("[itemStore]");
    	
    	for(int i=0; i<sequence; i++) {
    		Item item = store.get(i);
    		System.out.printf("[%d] %s\n", i, item.toString());
    	}
    	System.out.printf("revenue : %d\n",revenue);
    	
    }
}