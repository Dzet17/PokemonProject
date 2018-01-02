package pokemon.model.types;

import pokemon.model.Electric;

public class Pikachu extends Pokemon implements Electric, Comparable
{

	public Pikachu()
	{
		super(25, "Pikachu");
	}

	public Pikachu(String name)
	{
		super(25, name);
	}

	public Pikachu(int number, String name)
	{
		super(number, name);
	}
	protected void setup()
	{
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.99);
		this.setHealthPoints(60);
	}
}
