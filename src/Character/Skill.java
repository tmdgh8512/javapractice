package Character;

public class Skill {

	private static String Skill_Name;
	private static int Skill_Level;
	private static int Skill_Code;
	private static int Skill_Damage;

	public Skill(String Name, int Code, int Damage) {

		this.Skill_Level = 1;
		this.Skill_Name = Name;
		this.Skill_Code = Code;
		this.Skill_Damage = Damage;

	}

	public static Skill volcano() {
		return new Skill("Volcano", 1, 10);
	}

	public static Skill lightning() {
		return new Skill("Lightning", 11, 15);
	}

	public static Skill blizzard() {
		return new Skill("Blizzard", 21, 20);
	}

	public static Skill watercannon() {
		return new Skill("WaterCannon", 31, 25);
	}

	public static Skill cyclone() {
		return new Skill("Cyclone", 41, 30);
	}

	public static Skill createSkill(String Name, int Code, int Damage) {
		return new Skill(Name, Code, Damage);
	}

}
