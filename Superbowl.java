public class Superbowl 
{
	String winner;
	String loser;
	Superbowl ()
	{
		winner = "Falcons";
		loser = "Patriots";
	}
	
	public String getWinner()
	{
		return winner;
	}
	
	public String getLoser()
	{
		return loser;
	}
	
	public String toString()
	{
		return "Winner = " + winner + "\n" +
				"Loser = " + loser;
	}
}
