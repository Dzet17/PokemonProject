package pokemon.model.types;

import pokemon.model.Water;

public class Squirtle extends Pokemon implements Water, Comparable
{

	public Squirtle()
	{
		super(7, "Squirtle");
		setup();
	}

	public Squirtle(String name)
	{
		super(7, name);
		setup();
	}

	public Squirtle(int number, String name)
	{
		super(number, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.92);
		this.setHealthPoints(60);
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
