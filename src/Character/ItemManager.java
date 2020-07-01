package Character;

import java.util.HashMap;

public class ItemManager {

	private long Current_GUID = 10000000000L;

	private HashMap ItemMap = new HashMap();

	public ItemManager() {
		initItems();
	}

	private void initItems() {

		ItemMap.put(ItemDef.�ʺ����ǰ�, "�ʺ����� ��");
		ItemMap.put(ItemDef.�ʺ����ǹ���, "�ʺ����� ����");
		ItemMap.put(ItemDef.�ʺ���������, "�ʺ����� ����");
		ItemMap.put(ItemDef.�ʺ����ǻ���, "�ʺ����� ����");
		ItemMap.put(ItemDef.�ʺ���������, "�ʺ����� ����");
		ItemMap.put(ItemDef.�ʺ����ǽŹ�, "�ʺ����� �Ź�");
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
