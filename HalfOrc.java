/*
1. Declare and initialize variables
- String Array subRace, subRaceDescription
- String abilityIncrease, abilityIncrease2
- int abilityScoreIncrease, abilityScoreIncrease2, speed, darkVision
2. Create setHalfOrcSubRace method
- Assign element to subRace array
- Return subRace of String array type
3. Create setSubRaceDescription with int index parameter
- Assign element to subRaceDescription array
- Return subRaceDescription of String Array type
4. Create getHalfOrcRaceSkills method
- Declare and initialize subRaceSkills
- Return subRaceSkills of String type
5. Create getHalfOrcSubRaceSkills method
- Declare and initialize subRaceSkills
- Return subRaceSkills of String type
*/

public class HalfOrc
{
	private String[] subRace = new String[1];
	private String[] subRaceDescription = new String[1];
	private String abilityIncrease = "Strength";
	private int abilityScoreIncrease = 2;
	private String abilityIncrease2 = "Constitution";
	private int abilityScoreIncrease2 = 1;
	private int speed = 30; //feet
	private int darkVision = 60; //feet

	public String[] setHalfOrcSubRace()
	{
		subRace[0] = "None";
		return subRace;
	}
	public String[] setSubRaceDescription(int index)
	{
		subRaceDescription[0] = "";

		return subRaceDescription;
	}
	public String getHalfOrcRaceSkills()
	{
		String subRaceSkills = "Half-Orc Skills\n" + abilityIncrease + ": " + abilityScoreIncrease + " - " +
		abilityIncrease2 + ": " + abilityScoreIncrease2 + " - Speed: " + speed + " - Dark Vision: " + darkVision;
		return subRaceSkills;
	}
	public String getHalfOrcSubRaceSkills()
	{
		String subRaceSkills = "";
		return subRaceSkills;
	}
}
