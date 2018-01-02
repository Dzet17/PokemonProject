package pokemon.model.types;

public class Charizard extends Charmander
{
	public Charizard()
	{
		super(6, "Charizard");
		setup();
	}
	
	public Charizard(String name)
	{
		super(6, name);
		setup();
	}

	public Charizard(int number, String name)
	{
		super(number, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(150);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.98);
		this.setHealthPoints(160);
	}
}
