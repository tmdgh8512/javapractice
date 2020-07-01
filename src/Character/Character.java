package Character;

import java.util.ArrayList;

public class Character {

	private ArrayList<Item> Items;
	private ArrayList<Skill> Skills;
	private int Character_Level;
	private int HP;
	private long Character_GUID;
	private String Character_Name;

	private ItemManager Item_Manager;

	public Character(String Name, long GUID) {

		this.Character_Name = Name;
		this.Character_Level = 1;
		this.HP = 100;
		this.Items = new ArrayList<Item>();
		this.Skills = new ArrayList<Skill>();
		this.Character_GUID = GUID;

		Item_Manager = new ItemManager();

		initItems();
		initSkills();

	}

	private void initItems() {
		createItem(ItemDef.�ʺ����ǰ�, 1);
		createItem(ItemDef.�ʺ����ǹ���, 1);
		createItem(ItemDef.�ʺ���������, 1);
		createItem(ItemDef.�ʺ����ǻ���, 1);
		createItem(ItemDef.�ʺ���������, 1);
		createItem(ItemDef.�ʺ����ǽŹ�, 1);
	}

	private void initSkills() {

		Skill volcano = Skill.volcano();
		Skill lightning = Skill.lightning();
		Skill blizzard = Skill.blizzard();
		Skill watercannnon = Skill.watercannon();
		Skill cyclone = Skill.cyclone();
		Skills.add(volcano);
		Skills.add(lightning);
		Skills.add(blizzard);
		Skills.add(watercannnon);
		Skills.add(cyclone);

	}

	public boolean createItem(int ItemCode, int ItemCount) {

		Items.add(Item_Manager.createItem(ItemCode, ItemCount));
		return true;

	}

	public boolean removeItem(long GUID) {
		return true;
	}

}
