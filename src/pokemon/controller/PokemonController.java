package pokemon.controller;

import pokemon.model.types.*;
import java.util.List;
import java.util.ArrayList;
import pokemon.model.*;
import pokemon.controller.*;

public class PokemonController
{
	public PokemonController()
	{
		private ArrayList<Pokemon>();
		buildPokedex();
	
		appFrame = new PokemonFrame(this);
	}

	private void buildPokedex()
	{
		Charizard myCharizard = new
				Charizard();
		Charmander myCharmander = new
				Charmander();
		Gyarados myGyarados = new
				Gyarados();
		Pikachu myPikachu = new
				Pikachu();
		Squirtle mySquirtle = new
				Squirtle();
		Zapdos myZapdos = new
				Zapdos();
		
		return pokedex;
	}
	
	public List<Pokemon> getPokedex()
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only integer values are valid: " + sample + "is not");
		}
		
		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only double values are valid" + sampleDouble + " is not");
		}
		
		return valid;
	}

	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}

	public void start()
	{
		
	}
	 
}
