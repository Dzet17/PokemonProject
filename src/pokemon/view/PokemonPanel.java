package pokemon.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
	{
		private PokemonController appController;
		private JButton pokemonButton;
		private JTextField inputField;
		private JTextArea pokemonArea;
		private SpringLayout baseLayout;
		private SpringLayout baseLayout_1;
		private JButton checkerButton;
		private JLabel infoLabel;
		private JScrollPane chatScrollPane;
	

	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		pokemonButton = new JButton("Enter");
		inputField = new JTextField();
		infoLabel = new JLabel("Enter Pokemon");
		baseLayout = new SpringLayout();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
}
