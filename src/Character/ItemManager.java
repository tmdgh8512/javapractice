package Character;

import java.util.HashMap;

public class ItemManager {

	private long Current_GUID = 10000000000L;

	private HashMap ItemMap = new HashMap();

	public ItemManager() {
		initItems();
	}

	private void initItems() {

		ItemMap.put(ItemDef.초보자의검, "초보자의 검");
		ItemMap.put(ItemDef.초보자의방패, "초보자의 방패");
		ItemMap.put(ItemDef.초보자의투구, "초보자의 투구");
		ItemMap.put(ItemDef.초보자의상의, "초보자의 상의");
		ItemMap.put(ItemDef.초보자의하의, "초보자의 하의");
		ItemMap.put(ItemDef.초보자의신발, "초보자의 신발");
	}

	public long getGUID() {
		Current_GUID += 1;
		return Current_GUID;
	}

	public Item createItem(int ItemCode, int ItemCount) {
		Object ItemNameObj = ItemMap.get(ItemCode);
		if (ItemNameObj == null)
			return null;

		return Item.createItem((String) ItemNameObj, ItemCode, getGUID(), ItemCount);
	}

}
