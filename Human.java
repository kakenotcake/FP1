/*
1. Declare and initialize variables
- String Array subRace, SubRaceDescription
- String abilityIncrease, abilityIncrease2, abilityIncrease3
- int speed
2. Create setHumanSubRace method
- Assign elements to subRace array
- Return subRace of String Array type
3. Create setSubRaceDescription with int index parameter
- Assign elements to subRaceDescription array
- Return subRaceDescription of String Array type
4. Create getHumanSubRaceSkills
- Declare and initialize String subRaceSkills
- Return subRaceSkills
*/

public class Human
{
	private String[] subRace = new String[3];
	private String[] subRaceDescription = new String[3];
	private String abilityIncrease = "Agility";
	private int abilityScoreIncrease = 1;
	private String abilityIncrease2 = "Constitution";
	private String abilityIncrease3 = "Desxterity";
	private int speed = 30; //feet

	public String[] setHumanSubRace()
	{
		subRace[0] = "Calishite";
		subRace[1] = "Illuskan";
		subRace[2] = "Turami";
		return subRace;
	}
	public String[] setSubRaceDescription(int index)
	{
		subRaceDescription[0] = "Shorter and slighter in build than most other humans, Calishites have dusky brown skin, hair, and eyes.";
		subRaceDescription[1] = "Illuskans are tall, fair-skinned folk with blue or steely gray eyes. Most have raven-black hair, but those " +
		"who inhabit the extreme northwest have blond, red, or light brown hair.";
		subRaceDescription[2] = "Native to the southern shore of the Inner Sea, the Turami people are generally tall and muscular with dark " +
		"mahogany skin, curly black hair, and dark eyes.";

		return subRaceDescription;
	}
	public String getHumanRaceSkills()
	{
		String raceSkills = "Human Skills\n" + abilityIncrease + ": " + abilityScoreIncrease + " - " + abilityIncrease2 + ": " + abilityScoreIncrease +
		" - " + abilityIncrease3 + ": " + abilityScoreIncrease + " - Speed: " + speed;
		return raceSkills;
	}
	public String getHumanSubRaceSkills()
	{
		String subRaceSkills = "";
		return subRaceSkills;
	}
}
