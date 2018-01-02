package pokemon.model.types;

public class Charizard extends Charmander
{
	public Charizard()
	{
		super(6, "Charizard");
	}
	
	public Charizard(String name)
	{
		super(6, name);
	}

	public Charizard(int number, String name)
	{
		super(number, name);
	}
	protected void setup()
	{
		this.setAttackPoints(150);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.98);
		this.setHealthPoints(160);
	}
}
