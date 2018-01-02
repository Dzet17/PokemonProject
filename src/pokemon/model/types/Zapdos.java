package pokemon.model.types;

import pokemon.model.Electric;

public class Zapdos extends Pokemon implements Electric, Comparable
{

	public Zapdos()
	{
		super(145, "Zapdos");
	}
	
	public Zapdos(String name)
	{
		super(145, name);
	}

	public Zapdos(int number, String name)
	{
		super(number, name);
	}
	protected void setup()
	{
		this.setAttackPoints(60);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.71);
		this.setHealthPoints(90);
	}
}
