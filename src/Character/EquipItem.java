package Character;

public class EquipItem extends Item {

	private int mSlot = 0;
	private boolean mIsEquipped = false; 
	
	public EquipItem(String Name, int Code, long GUID, int Count, int slot) {
		super(Name, Code, GUID, Count);
		this.mSlot = slot;
		mIsEquipped = false;
	}
	
}
