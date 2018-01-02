package pokemon.model.types;

import pokemon.model.Fire;

public class Charmander extends Pokemon implements Fire, Comparable
{

	public Charmander()
	{
		super(4, "Charmander");
		setup();
	}
	
	public Charmander(String name)
	{
		super(4, name);
		setup();
	}

	public Charmander(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.64);
		this.setHealthPoints(50);
	}

	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doFireblast()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int doIncinerate(int amount)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String sayBlastOff()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
