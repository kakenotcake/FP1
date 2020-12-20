/*
1. Declare and initialize variables
- String Array subRace, subRaceDescription
- String abilityIncrease, keenSense, subAbilityIncrease
- int abilityScoreIncrease, speed, darkVision, subAbilityScoreIncrease, existing
2. Create setElfSubRace method
- Assign elements to subRace array
- Return subRace of String Array type
3. Create setSubRaceDescription method with int index parameter
- Assign elements to subRaceDescription array
- Return subRaceDescription of String array type
4. Get getElfSubRaceSkills method with int index parameter
- Declare String variable subRaceSkills
- If index is equal to 0
  - Assign elements to variables pertaining to a high elf
  - Combine all to subRaceSkills
- If index is equal to 1
  - Assign elements to variables pertaining to a wood elf
  - Combine all to SubRaceSkills
- If index is equal to 2
  - Assign elements to variables pertaining to a dark elf
  - Combine all to subRaceSkills
- Return subRaceSkills of String type
*/

public class Elf
{
	private String[] subRace = new String[3];
	private String[] subRaceDescription = new String[3];
	private String abilityIncrease = "Dexterity";
	private int abilityScoreIncrease = 2;
	private int speed = 30; //feet
	private int darkVision = 60; //feet
	private String keenSense = "Perception";
	private String subAbilityIncrease;
	private int subAbilityScoreIncrease;
	private int existing;

	public String[] setElfSubRace()
	{
		subRace[0] = "High Elf";
		subRace[1] = "Wood Elf";
		subRace[2] = "Dark Elf";
		return subRace;
	}
	public String[] setSubRaceDescription(int index)
	{
		subRaceDescription[0] = "As a high elf, you have a keen mind and a mastery of at least the basics of magic. In many of the worlds, " +
			"there are two kinds of high elves. One type is haughty and reclusive, believing themselves to be superior to non-elves and even " +
			"other elves. The other type are more common and more friendly, and often encountered among humans and other races.";
		subRaceDescription[1] = "As a wood elf, you have keen senses and intuition, and your fleet feet carry you quickly and stealthily through " +
			"your native forests.";
		subRaceDescription[2] = "Descended from an earlier subrace of elves, the drow were banished from the surface world for following the goddess " +
			"of Lolth down the path of evil. Now they have built their own civilization in the depths of the Underdark patterned after the Way of Lolth. " +
			"Also called dark elves, the drow have skin that resembles charcoal or obsidian, as well as stark white or pale yellow hair.";

		return subRaceDescription;
	}
	public String getElfRaceSkills()
	{
		String raceSkills = "Elf Skills\n" + abilityIncrease + ": " + abilityScoreIncrease + " - Speed: " + speed + " - DarkVision: " + darkVision +
		" - Keen Sense: " + keenSense;

		return raceSkills;
	}
	public String getElfSubRaceSkills(int index)
	{
		String subRaceSkills;


		if (index == 0) //high elf
		{
			subAbilityIncrease = "Intelligence";
			subAbilityScoreIncrease = 1;
			existing = abilityScoreIncrease; //skill for all elfs
			existing = 3;
			subRaceSkills = "High Elf Skills\n" + subAbilityIncrease + ": " + subAbilityScoreIncrease + " - " + abilityIncrease +
			": " + existing;
		}
		else if (index == 1) //wood elf
		{
			subAbilityIncrease = "Wisdom";
			subAbilityScoreIncrease = 1;
			existing = speed; //skill for all elfs
			existing = 35;
			subRaceSkills = "Wood Elf Skills\n" + subAbilityIncrease + ": " + subAbilityScoreIncrease + " - " + "Speed: " + existing;
		}
		else //dark elf
		{
			subAbilityIncrease = "Charisma";
			subAbilityScoreIncrease = 1;
			existing = darkVision; //skill for all elfs
			existing = 120;
			subRaceSkills = "Dark Elf Skills\n" + subAbilityIncrease + ": " + subAbilityScoreIncrease + " - " + "Dark Vision: " + existing;
		}
		return subRaceSkills;

	}
}
