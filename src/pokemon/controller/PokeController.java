package pokemon.controller;

import pokemon.model.types.*;
import pokemon.view.PokemonFrame;
import java.util.List;
import java.util.ArrayList;
import pokemon.model.*;
import pokemon.controller.*;

public class PokeController<PokedexFrame>
{
	private List<Pokemon> pokedex;
	private PokedexFrame appFrame;
	private PokeController appController;
	
	public PokeController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
	
		appFrame = new PokedexFrame(this);
	}

	public String[] getPokemonTypes()
	{
		String [] types = null;
		ArrayList<String> parentType = new ArrayList<String>();
		Class<?> currentClass = this.getClass();
		
		while(currentClass.getSuperclass() != null)
		{
			Class<?> [] pokemonTypes = getClass().getInterfaces();
			types = new String[pokemonTypes.length];
			
			for(int index = 0; index < types.length; index++)
			{
				String currentInterface = pokemonTypes[index].getCanonicalName();
				currentInterface = currentInterface.replaceAll(this.getClass().getPackage().getName() + ".",  "");
				if(!parentType.contains(currentInterface))
				{
					parentType.add(currentInterface);
				}
			}
			
			currentClass = currentClass.getSuperclass();
		}
		
		types = new String [parentType.size()];
		
		for(int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}
		
		return types;
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
	
	public List<Pokemon> pokedex()
	{
		return pokedex();
	}
	
	public boolean isValidInteger(String input)
	{	
		return false;
	}
	
	public boolean isValidDouble(String input)
	{

		return false;
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
	
	 public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	 {
		 Pokemon selected = pokedex.get(selection);
		 
		 selected.setAttackPoints(attack);
		 selected.setCanEvolve(evolve);
		 selected.setEnhancementModifier(modify);
		 selected.setName(name);
		 selected.setHealthPoints(health);
		 
	 }
}
