/*
1. Import necessary Javafx classes
2. Create CharacterBuilder class which extends Application
3. Declare and initialize variables
- int variables raceIndex, subRaceIndex, archetypeIndex
- String Array variables raceTitle, archetypeTitle, subRaceTitle, raceDescription, archetypeDescription, subRaceDescription
- String raceSkills, subRaceSkills, archetypeSkills
4. Instantiate DescriptionPane
- raceDescriptionPane, archetypeDescriptionPane, subRaceDescriptionPane, skillsDescriptionPane
5. Instantiate ComboBox
- cboRace, cboArchetype, cbosubRace
6. Create start method with Stage primaryStage parameter
- Initialize raceDescription, archetypeDescription
- Instantiate Button
  - btCreate
- Instantiate GridPane
  - pane
- Add Labels for Race, Race Description, Archetype, Archetype Description, Sub-Race, Sub-Race Description, and Skills
- Add Labels, DescriptionPane’s, and ComboBox’s to pane with preferred properties
- Instantiate ObservableList
  - raceList, archetypeList, sub-raceList
- Add ObservableList’s to ComboBox’s
- Create actions
  - setRaceDescription method padding raceIndex, triggered by cboRace
  - setArchetypeDescription method passing archetypeIndex, triggered by cboArchetype
  - setSubRaceDescriptionPane method passing raceIndex and subRaceIndex, triggered by cboSubRace
  - setSkillsDescriptionPane method passing raceIndex, subRaceIndex, and archetypeIndex, triggered by btCreate
- Create a scene and set it in the stage with preferred propertie
7. Create setRaceDescription method with int index parameter
- raceDescriptionPane object call setDescription method in DescriptionPane class passing raceDescription[index]
- assign raceIndex to index
- Call setSubRaceTitle, passing index parameter
- Clear subRaceDescriptionPane
8. Create setArchetypeDescription, passing index parameter
- archetypeDescriptionPane object call setDescription method in DescriptionPane class, passing archetypeDescription[index]
- assign archetypeIndex to index
9. Create setSubRaceDescription method with int subRaceIndex and int raceIndex parameters
- If raceIndex is equal to 0
  - Instantiate Elf
  - subRaceDescription equals returned valued from elf object calling setRubRaceDescription in Elf class, passing subRaceIndex parameter
- if raceIndex is equal to 1
  - Instantiate Gnome
  - subRaceDescription equals returned value from gnome object calling setSubRaceDescription in Gnome class, passing subRaceIndex parameter
- if raceIndex is equal to 2
  - Instantiate Human
  - subRaceDescription equals returned value from human object calling setSubRaceDescription in Human class, passing subRaceIndex parameter
- if raceIndex is equal to 3
  - Instantiate HalfOrc
 - subRaceDescription equals returned value from halfOrc object calling setSubRaceDescription in HalfOrc class, passing subRaceIndex parameter
- Return subRaceDescription of String Array type
10. Create setSubRaceTitle method with int index parameter
- If index is equal to 0
- Instantiate Elf
- subRaceTitle equals returned value from elf object calling setElfSubRace
  - if index is equal to 1
- Instantiate Gnome
- subRaceTitle equals returned value from gnome object calling setGnomeSubRace
  - If index is equal to 2
- Instantiate Human
- subRaceTitle equals returned value from human object calling setHumanSubRace
  - if index is equal to 3
  - Instantiate HalfOrc
  - subRaceTitle equals returned value from human object calling setHalfOrcSubRace
- Return subRaceTitle of String Array type
11. Create getRaceSkills method with int raceIndex parameter
- If raceIndex is equal to 0
  - Instantiate Elf
  - raceSkills equals returned value from elf object calling getElfRaceSkills method in Elf class
- if raceIndex is equal to 1
  - Instantiate Gnome
  - raceSkills equals returned value from gnome object calling getGnomeRaceSkills method in Gnome class
- if raceIndex is equal to 2
  - Instantiate Human
  - raceSkills equals returned value from human object calling getHumRaceSkills method in Gnome class
- if raceIndex is equal to 3
  - Instantiate HalfOrce
  - raceSkills equals returned valued from halfOrc object calling getHalfOrcRaceSkills method in HalfOrc class
- Return raceSkills of String type
12. Create getSubRaceSkills method with int subRaceIndex and int raceIndex parameters
- If raceIndex is equal to 0
  - Instantiate Elf
  - subRaceSkills equals returned value from elf object calling getElfSubRaceSkills method in Elf class, passing subRaceIndex parameter
- if raceIndex is equal to 1
  - Instantiate Gnome
  - subRaceSkills equals returned value from gnome object calling getGnomeSubRaceSkills method in Gnome class, passing subRaceIndex parameter
- if raceIndex is equal to 2
  - Instantiate Human
  - subRaceSkills equals returned value from human object calling getHumanSubRaceSkills method in Human class
- if raceIndex is equal to 3
  - Instantiate HalfOrc
  - subRaceSkills equals returned value from halfOrc object calling getHalfOrcSubRaceSkills method in HalfOrc class
- Return subRaceSkills of String type
13. Create getArchetypeSkills method with int archetypeIndex parameter
- Instantiate Archetype
- archetypeSkills equals value returned from archetype object calling getArchetypeSkills method, passing archetypeIndex parameter
- Return archetypeSkills of String type
14. Create setSkillsDescriptionPane method with int raceIndex, int subRaceIndex, and int archetypeIndex parameters
- Call getRaceSkills method passing raceIndex parameter
- Call getSubRaceSkills method passing subRaceIndex and raceIndex parameters
- Call getArchetypeSkills method passing archetypeIndex parameter
- Assign String skillsCombined variable to raceSkills + subRaceSkills + archetypeSkills
- skillsDescriptionPane object call setDescription method in DescriptionPane method passing skillsCombined parameter
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.geometry.Orientation;

public class CharacterBuilder extends Application
{
	int raceIndex;
	int subRaceIndex;
	int archetypeIndex;

	//declare array of strings for gender, race, and archetypes
	private String[] raceTitle = {"Elf", "Gnome", "Human", "Half-Orc"};
	private String[] archetypeTitle = {"Wizard", "Fighter", "Rogue"};
	private String[] subRaceTitle;

	//declare array of Strings for title descriptions
	private String[] raceDescription = new String[4];
	private String[] archetypeDescription = new String[3];
	private String[] subRaceDescription;

	//declare strings for skills
	private String raceSkills;
	private String subRaceSkills;
	private String archetypeSkills;

	//declare and create description pane
	private DescriptionPane raceDescriptionPane = new DescriptionPane();
	private DescriptionPane archetypeDescriptionPane = new DescriptionPane();
	private DescriptionPane subRaceDescriptionPane = new DescriptionPane();
	private DescriptionPane skillsDescriptionPane = new DescriptionPane();

	//create a combo box for selections
	private ComboBox<String> cboRace = new ComboBox<>(); //race titles
	private ComboBox<String> cboArchetype = new ComboBox<>(); //archetype titles
	private ComboBox<String> cboSubRace = new ComboBox<>();

	ObservableList<String> subRaceList;


	@Override
	public void start(Stage primaryStage)
	{
		//set text descriptions
		raceDescription[0] = "Elves are magical people of other wordly grace, living in the world but not entirely part of it. " +
			"They live in places of etheral beauty in, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft " +
			"music drifts through the air and gentle fragrances waft on the breeze.  Elves love nature and magic, art, and artistry, music and poetry, " +
			"and the good things in the world.";
		raceDescription[1] = "A constant hum of busy activity pervades the warrens and neighborhoods where gnomes form their closeknit communities " +
			"Louder sounds punctuate the hum: a crunch of grinding gears here, a minor explosion there, a yelp of surprise or triumph, and especially " +
			"bursts of laughter.  Gnomes wtake delight in life, enjoying every moment of invention, exploration, investiagtion, creation, and play.";
		raceDescription[2] = "In the reckonings of most worlds, humans are the youngest of the common races, late to arrive on the world scene " +
			"and short-lived in comparison to dwarves, elves, and dragons.  Perhaps it is because of their shorter lives that they strive to achieve " +
			"as much as they can in the years they are given.  Or maybe they feel they have something to prove to the elder races, and that's why " +
			"they build their mighty empires on the foundation of conquest and trade.  Whatever drives them, humans are the innovators, the achievers, " +
			" and the pioneers of the worlds.";
		raceDescription[3] = "Whether united under the leadership of a mighty warlock or having fought to a standstill after years of conflict, " +
			"orc and human tribes sometimes form alliances, joining forces into larger horde to the terror of civilized lands nearby.  When these " +
			"alliances are sealed by marriages, half-orcs are born.  Some half-orcs rise to become proud chiefs of orc tribes, their human blood " +
			"giving them an edge over their full-blooded orc rivals.  Some venture into the world to prove their worth among humans and more civilized " +
			"races.  Many of these become adventurers, achieving greatness for their mighty deeds and notoriety for their barbaric customs and savage fury.";

		archetypeDescription[0] = "Wizards are supreme magic-users, defined and united as a class by the spells they cast. Drawing out on the subtle " +
			"weave if magic that permeates the cosmos, wizards cast spells of explosive fire, arcing lightning, subtle decption, and brute-force mind " +
			"control. Their magic conjures monsters from other planes of existence, glimpses the future, or turn slain foes into zombies. Their " +
			"mightiest spells change one substance into another, call meteors down from the sky, or open portals to other worlds.";
		archetypeDescription[1] = "Fighters are perhaps the most diverse class of characters. Questing knights, conquering overlords, royal champions, elite foot " +
			"soldiers, hardened mercenaries, and bandit kings - as fighters, they all share an unparalleled mastery with weapons and armor, " +
			"and a thorough knowledge of the skills of combat. And they are well acquainted with death, both meeting it out and staring it defiantly in the face.";
		archetypeDescription[2] = "Rogues rely on skill, stealth, and their foes' vulnerabilities to get the upper hand in any situation. They have " +
			"a knack for finding the solution to just about any problem, demonstrating a resourcefulness and versatility that is the cornerstone " +
			"of any adventuring party.";


		//create button
		Button btCreate = new Button("Create Character");


		//create a pane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);


		pane.add(new Label("Race:"), 0, 2);
		pane.add(cboRace, 1, 2);
		cboRace.setPrefWidth(400);

		pane.add(new Label("Race Description:"), 0, 3);
		pane.setPrefWidth(600);
		pane.add(raceDescriptionPane, 1, 3);

		pane.add(new Label("Archetype:"), 0, 4);
		pane.add(cboArchetype, 1, 4);
		cboArchetype.setPrefWidth(400);

		pane.add(new Label("Archetype Description:"), 0, 5);
		pane.add(archetypeDescriptionPane, 1, 5);

		pane.add(new Label("Sub-Race:"), 0, 6);
		pane.add(cboSubRace, 1, 6);
		cboSubRace.setPrefWidth(400);

		pane.add(new Label("Sub-Race Description"), 0, 7);
		pane.add(subRaceDescriptionPane, 1, 7);

		pane.add(btCreate, 0, 8);
		btCreate.setPrefWidth(300);

		pane.add(skillsDescriptionPane, 1, 8);

		//observable lists
		ObservableList<String> raceList = FXCollections.observableArrayList(raceTitle);
		ObservableList<String> archetypeList = FXCollections.observableArrayList(archetypeTitle);
		subRaceList = FXCollections.observableArrayList(setSubRaceTitle(raceList.indexOf(cboRace.getValue())));

		//add to combo boxes
		cboRace.getItems().addAll(raceList);
		cboArchetype.getItems().addAll(archetypeList);
		cboSubRace.getItems().addAll(subRaceList);

		//create actions - display items and create character button
		cboRace.setOnAction(e -> setRaceDescription(raceList.indexOf(cboRace.getValue())));

		cboArchetype.setOnAction(e -> setArchetypeDescription(archetypeList.indexOf(cboArchetype.getValue())));

		cboSubRace.setOnAction(e -> setSubRaceDescriptionPane(subRaceList.indexOf(cboSubRace.getValue()), raceIndex));
		subRaceIndex = subRaceList.indexOf(cboSubRace.getValue());

		btCreate.setOnAction(e -> setSkillsDescriptionPane(raceIndex, subRaceIndex, archetypeIndex));


		//create a scene and set in the stage
		Scene scene = new Scene(pane, 1200, 700);
		primaryStage.setTitle("CharacterBuilder");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	//set display information on the description pane
	public void setRaceDescription(int index)
	{
		raceDescriptionPane.setDescription(raceDescription[index]);
		raceIndex = index;
		subRaceDescriptionPane.setDescription("");

		setSubRaceTitle(index);
	}
	public void setArchetypeDescription(int index)
	{
		archetypeDescriptionPane.setDescription(archetypeDescription[index]);
		archetypeIndex = index;
	}
	public void setSubRaceDescriptionPane(int subIndex, int raceIndex)
	{
		int indexSubRace = subIndex;
		setSubRaceDescription(indexSubRace, raceIndex);
		subRaceDescriptionPane.setDescription(subRaceDescription[indexSubRace]);
		subRaceIndex = subIndex;
	}
	public String[] setSubRaceDescription(int subRaceIndex, int raceIndex)
	{
		int indexSubRace = subRaceIndex;

		if (raceIndex == 0)
		{
			Elf elf = new Elf();
			subRaceDescription = elf.setSubRaceDescription(indexSubRace);
		}
		else if (raceIndex == 1)
		{
			Gnome gnome = new Gnome();
			subRaceDescription = gnome.setSubRaceDescription(indexSubRace);
		}
		else if (raceIndex == 2)
		{
			Human human = new Human();
			subRaceDescription = human.setSubRaceDescription(indexSubRace);
		}
		else
		{
			HalfOrc halfOrc = new HalfOrc();
			subRaceDescription = halfOrc.setSubRaceDescription(indexSubRace);
		}
		return subRaceDescription;
	}

	public String[] setSubRaceTitle(int index) //set combo box items for sub race
	{
		if (index == 0)
		{
			Elf elf = new Elf();
			subRaceTitle = elf.setElfSubRace();
		}
		else if (index == 1)
		{
			Gnome gnome = new Gnome();
			subRaceTitle = gnome.setGnomeSubRace();
		}
		else if (index == 2)
		{
			Human human = new Human();
			subRaceTitle = human.setHumanSubRace();
		}
		else
		{
			HalfOrc halfOrc = new HalfOrc();
			subRaceTitle = halfOrc.setHalfOrcSubRace();
		}
		subRaceList = FXCollections.observableArrayList(subRaceTitle);
		cboSubRace.getItems().clear();
		cboSubRace.getItems().addAll(subRaceList);

		return subRaceTitle;
	}
	public String getRaceSkills(int raceIndex)
	{
		if (raceIndex == 0)
		{
			Elf elf = new Elf();
			raceSkills = elf.getElfRaceSkills();
		}
		else if (raceIndex == 1)
		{
			Gnome gnome = new Gnome();
			raceSkills = gnome.getGnomeRaceSkills();
		}
		else if (raceIndex == 2)
		{
			Human human = new Human();
			raceSkills = human.getHumanRaceSkills();
		}
		else
		{
			HalfOrc halfOrc = new HalfOrc();
			raceSkills = halfOrc.getHalfOrcRaceSkills();
		}
		return raceSkills;
	}
	public String getSubRaceSkills(int subRaceIndex, int raceIndex)
	{
		if (raceIndex == 0)
		{
			Elf elf = new Elf();
			subRaceSkills = elf.getElfSubRaceSkills(subRaceIndex);
		}
		else if (raceIndex == 1)
		{
			Gnome gnome = new Gnome();
			subRaceSkills = gnome.getGnomeSubRaceSkills(subRaceIndex);
		}
		else if (raceIndex == 2)
		{
			Human human = new Human();
			subRaceSkills = human.getHumanSubRaceSkills();
		}
		else
		{
			HalfOrc halfOrc = new HalfOrc();
			subRaceSkills = halfOrc.getHalfOrcSubRaceSkills();
		}
		return subRaceSkills;
	}
	public String getArchetypeSkills(int archetypeIndex)
	{
		Archetype archetype = new Archetype();
		archetypeSkills = archetype.getArchetypeSkills(archetypeIndex);
		return archetypeSkills;
	}
	public void setSkillsDescriptionPane(int raceIndex, int subRaceIndex, int archetypeIndex)
	{
		getRaceSkills(raceIndex);
		getSubRaceSkills(subRaceIndex, raceIndex);
		getArchetypeSkills(archetypeIndex);
		String skillsCombined = raceSkills + "\n" + subRaceSkills + "\n" + archetypeSkills;
		skillsDescriptionPane.setDescription(skillsCombined);
	}
}
