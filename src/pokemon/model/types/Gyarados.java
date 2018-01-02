package pokemon.model.types;

import pokemon.model.Water;

public class Gyarados extends Pokemon implements Water, Comparable
{

	public Gyarados()
	{
		super(130, "Gyarados");
	}

	public Gyarados(String name)
	{
		super(130, name);
	}

	public Gyarados(int number, String name)
	{
		super(number, name);
	}
	
	protected void setup()
	{
		this.setAttackPoints(50);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.78);
		this.setHealthPoints(100);
	}
}
