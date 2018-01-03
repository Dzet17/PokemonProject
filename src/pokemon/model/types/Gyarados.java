package pokemon.model.types;

import pokemon.model.Water;

public class Gyarados extends Pokemon implements Water, Comparable
{

	public Gyarados()
	{
		super(130, "Gyarados");
		setup();
	}

	public Gyarados(String name)
	{
		super(130, name);
		setup();
	}

	public Gyarados(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(50);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.78);
		this.setHealthPoints(100);
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}

	@Override
	public void doSoak()
	{
		
	}

	@Override
	public int Whirlpool(int amount)
	{
		return 0;
	}

	@Override
	public String sayBubbleBeam()
	{
		return null;
	}
}
