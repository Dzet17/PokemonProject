package pokemon.view;

import javax.swing.JFrame;

import pokemon.controller.PokemonController;
import pokemon.view.PokemonPanel;

public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokemonPanel appPanel;
	
	public Pokemon(PokemonController appController)
	{
		super();
		this.appController = appController;
		appPanel = new ChatPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setTitle("Pokemon");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}

	public Object getBaseController()
	{
		return false;
	}
}