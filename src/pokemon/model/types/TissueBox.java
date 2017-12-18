package pokemon.model.types;

import pokemon.model.Derptastic;

public class TissueBox extends Pokemon implements Derptastic, Comparable
{

	public TissueBox(int number, String name)
	{
		super(number, name);
	}
	
	public int annoy (int level)
	{
		int annoyance = 0;
		
		return annoyance;
	}
	
	public String sayDerpy()
	{
		return "derp derp derp derp derp";
	}
	
	public void derpDerpDerp()
	{
		System.out.print("jbasfjabsdj");
	}
	
	public int compareTo(Object temp)
	{
		return -100009;
	}
}
