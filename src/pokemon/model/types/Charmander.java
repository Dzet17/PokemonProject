package pokemon.model.types;

import pokemon.model.Fire;

public class Charmander extends Pokemon implements Fire, Comparable
{

	public Charmander()
	{
		super(4, "Charmander");
	}
	
	public Charmander(String name)
	{
		super(4, name);
	}

	public Charmander(int number, String name)
	{
		super(number, name);
	}
	
	protected void setup()
	{
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.64);
		this.setHealthPoints(50);
	}
}
