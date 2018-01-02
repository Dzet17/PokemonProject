package pokemon.model.types;

import pokemon.model.Electric;

public class Pikachu extends Pokemon implements Electric, Comparable
{

	public Pikachu()
	{
		super(25, "Pikachu");
		setup();
	}

	public Pikachu(String name)
	{
		super(25, name);
		setup();
	}

	public Pikachu(int number, String name)
	{
		super(number, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.99);
		this.setHealthPoints(60);
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}

	@Override
	public void LightningStrike()
	{
		
	}

	@Override
	public int intimidate(int amount)
	{
		return 0;
	}

	@Override
	public String sayPika()
	{
		return null;
	}
}
