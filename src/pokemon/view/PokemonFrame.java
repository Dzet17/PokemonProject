package pokemon.view;

import javax.swing.JFrame;

import pokemon.controller.PokemonController;
import pokemon.view.PokemonPanel;

public class PokemonFrame extends JFrame
{
	private PokemonController pokemonController;
	private PokemonPanel pokemonPanel;
	
	public PokemonFrame(PokemonController pokemonController)
	{
		super();
		this.pokemonController = pokemonController;
		pokemonPanel = new PokemonPanel(pokemonController);
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