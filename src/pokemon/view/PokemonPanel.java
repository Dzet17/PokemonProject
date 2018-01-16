package pokemon.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pokemon.model.*;
import pokemon.model.types.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import pokemon.controller.*;

public class PokemonPanel
{
	
		private PokeController appController;
	
		private JLabel healthLabel;
		private JLabel attackLabel;
		private JLabel nameLabel;
		private JLabel numberLabel;
		private JLabel evolvableLabel;
		private JLabel modifierLabel;
		private JLabel iconLabel;
	
		private JCheckBox evolvableBox;
		private JTextField nameField;
		private JTextField numberField;
		private JTextField attackField;
		private JTextField healthField;
		private JTextField modifierField;
	
		private JTextArea decriptionArea;
		private JTextArea typeArea;
	
		private JButton saveButton;
		private JButton clearButton;
		private JComboBox pokedexDropDown;
	
		private JPanel firstType;
		private JPanel secondType;
		private JPanel thirdType;
		private JPanel fourthType;

		private JTextArea descriptionArea;
	
public PokemonPanel(PokeController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField("##");
		numberField = new JTextField("number");
		attackField = new JTextField("attack");
		
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		
		iconLabel = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		healthLabel = new JLabel("health");
		modifierLabel = new JLabel("modifier");
		pokedexDropDown = new JComboBox();
		clearButton = new JButton("Clear");
		saveButton = new JButton("Save");
		
		descriptionArea = new JTextArea(5,10);
		typeArea = new JTextArea(4,15);
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();	
	}
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		attackField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes());
		{
			typeArea.append(current + "\n");
		}
	}	
		
	 private void setupComboBox()
	 {
		 DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		 pokedexDropDown.setModel(pokemonModel);
	 }
	 
	private void setupTypePanels()
	 {
		 
	 }
	
	 private void setupPanel()
	 {
		 
	 }
	 
	 private void updateImage()
	 {
		 String path = "/pokemon/view/images/";
		 String defaultName = "ultraball";
		 String name = pokedexDropDown.getSelectedItem().toString();
		 String extension = ".png";
		 ImageIcon pokemonIcon;
		 
		 try
		 {
			 pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		 }
		 catch (NullPointerException missingImageFile)
		 {
			 pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		 }
		 
		 iconLabel.setIcon(pokemonIcon);
	 }

	 private void setupLayout()
	 {
		 
	 }
	 
	 private void setupListeners()
	 {
		 pokedexDropDown.addActionListener(new ActionListener() {
			 {
				 public void actionPerformed(ActionEvent selection)
				 {
					 int selectedPokemonIndex = pokedexDropDown.getSelectedIndex();
					 updatePokedexInfo(selectedPokemonIndex);
					 updateImage();
					 updateTypePanels();
					 repaint();
				 });
			 }
		 }

	 
	 private void updateTypePanels()
	 {
		 String [] types = appController.getPokedex().get(pokedexDropDown.getSelectedIndex()).getPokemonTypes();
		 
		 //Change this to match your 3 minimum Types in your pokedex
		 if (types[0].equals("electric"))
		 {
			 firstType.setBackground(Color.YELLOW);
		 }
		 else if (types[0].equals("Water"))
		 {
			 firstType.setBackground(Color.BLUE);
		 }
		 else if (types[0].equals("Fire"))
		 {
			 firstType.setBackground(Color.RED);
	 	 }
		 else
		 {
			 firstType.setBackground(Color.BLUE);
		 }
		 if (types.length > 1)
		 {
			 if(types[1].equals("Electric"))
			 {
				 secondType.setBackground(Color.YELLOW);
			 }
			 
			 if (types.length == 3)
			 {
				 
			 }
		 }
	 }
	 
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
}
