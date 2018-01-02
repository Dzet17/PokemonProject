package pokemon.model.types;

import pokemon.model.Water;

public class Squirtle extends Pokemon implements Water, Comparable
{

	public Squirtle()
	{
		super(7, "Squirtle");
	}

	public Squirtle(String name)
	{
		super(7, name);
	}

	public Squirtle(int number, String name)
	{
		super(number, name);
	}
	protected void setup()
	{
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.92);
		this.setHealthPoints(60);
	}
}
