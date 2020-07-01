package Character;

public class Item {

	private String Item_Name;
	private int Item_Code;
	private int Item_Count;
	private long Item_GUID;

	public Item(String Name, int Code, long GUID, int Count) {

		this.Item_Name = Name;
		this.Item_Code = Code;
		this.Item_GUID = GUID;
		this.Item_Count = Count;

	}

	public static Item createItem(String Name, int Code, long GUID, int Count) {
		return new Item(Name, Code, GUID, Count);
	}

}
