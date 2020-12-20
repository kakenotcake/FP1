/*
1. Declare and initialize variables
- String Array subRace, subRaceDescription
- String abilityIncrease, subAbilityIncrease, special
- int abilityScoreIncrease, darkVision, subAbilityScoreIncrease
2. Create setGnomeSubRace method
- Assign elements to subRace
- Retrun String Array subRace
3. Create subRace Description method with int index parameter
- Assign elements to subRaceDescription
- Return subRaceDescription type String Array
4. Create getGnomeSubRaceSkills method with int index parameter
- Declare String subRaceSkills variable
- If index is equal to 0
  - Assign elements that pertain to gnome to variables
  - Combine all in subRaceSkills
- If index is equal to 1
  - Assign elements that pertain to rock gnome to variables
  - Combine all in subRaceSkills
- Return subRaceSkills of String type
*/

public class Gnome
{
	private String[] subRace = new String[2];
	private String[] subRaceDescription = new String[2];
	private String abilityIncrease = "Intelligence";
	private int abilityScoreIncrease = 2;
	private int speed = 25; //feet
	private int darkVision = 60;
	private String subAbilityIncrease;
	private int subAbilityScoreIncrease;
	private String special;


	public String[] setGnomeSubRace()
	{
		subRace[0] = "Forest Gnome";
		subRace[1] = "Rock Gnome";

		return subRace;
	}
	public String[] setSubRaceDescription(int index)
	{
		subRaceDescription[0] = "As a forest gnome, you have a natural knack for illusion and inherent quickness and stealth. In the " +
		"worlds, forest gnomes are rare and secretive. They gather in hidden communities in sylvan forests, using illusions and trickery to " +
		"conceal themselves from threats or to mask their escape should they be detected. Forest gnomes tend to be friendly with other good-spirited " +
		"woodland folk, and they regard elves and good fey as their most important allies. These gnomes also befriend small forest animals and rely " +
		"on them for information about threats that might prowl their lands.";

		subRaceDescription[1] = "As a rock gnome, you have a natural inventiveness and hardiness beyond that of other gnomes. Most gnomes in the " +
		"worlds are rock gnome.";

		return subRaceDescription;
	}
	public String getGnomeRaceSkills()
	{
		String raceSkills = "Gnome Skills\n" + abilityIncrease + ": " + abilityScoreIncrease + " - Speed: " + speed + " - Dark Vision: " + darkVision;
		return raceSkills;
	}
	public String getGnomeSubRaceSkills(int index)
	{
		String subRaceSkills = "";
		if (index == 0) //forest gnome
		{
			subAbilityIncrease = "Dexterity";
			subAbilityScoreIncrease = 1;
			special = "Speak with Small Beasts";
			subRaceSkills = "Forest Gnome Skills\n" + subAbilityIncrease + ": " + subAbilityScoreIncrease + " - Special Skill: " + special;
		}
		if (index == 1) //rock gnome
		{
			subAbilityIncrease = "Constitution";
			subAbilityScoreIncrease = 1;
			special = "Tinker";
			subRaceSkills = "Rock Gnome Skills\n" + subAbilityIncrease + ": " + subAbilityScoreIncrease + " - Special Skill: " + special;
		}
		return subRaceSkills;
	}
}
