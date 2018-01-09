package pokemon.model.types;

import pokemon.model.Electric;

public class Zapdos extends Pokemon implements Electric, Comparable
{

	public Zapdos()
	{
		super(145, "Zapdos");
		setup();
	}
	
	public Zapdos(String name)
	{
		super(145, name);
		setup();
	}

	public Zapdos(int number, String name)
	{
		super(number, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(60);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.71);
		this.setHealthPoints(90);
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}

	@Override
	public void LightningStrike()
	{
		System.out.print("Zapdos used LightningStrike");
	}

	@Override
	public int intimidate(int amount)
	{
		int intimidation = 0;
		
		return intimidation;
	}

	@Override
	public String sayPika()
	{
		return "It's lit";
	}
}
