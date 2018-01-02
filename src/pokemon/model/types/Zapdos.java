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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void LightningStrike()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int intimidate(int amount)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String sayPika()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
