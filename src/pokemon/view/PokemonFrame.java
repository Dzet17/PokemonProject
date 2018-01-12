package pokemon.view;

import javax.swing.JFrame;

import pokemon.controller.PokeController;
import pokemon.view.PokemonPanel;

public class PokemonFrame extends JFrame
{
	private PokeController pokeController;
	private PokemonPanel pokemonPanel;
	
	public PokemonFrame(PokeController pokeController)
	{
		super();
		this.pokeController = pokeController;
		pokemonPanel = new PokemonPanel(pokeController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setTitle("Pokemon");
		this.setContentPane(pokemonPanel);
		this.setResizable(false);
		this.setVisible(true);
	}

	public Object getBaseController()
	{
		return false;
	}
}