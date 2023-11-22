package be.Lombardi.Tournament;

import java.util.ArrayList;
import java.util.List;

public class Player extends Person {
	private int rank;
	private String gender;
	private List<Opponent> opponents = new ArrayList<Opponent>();
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getGender() {
		return gender;
	}
	
	public List<Opponent> getOpponents(){
		return opponents;
	}

	public Player(String firstname, String lastname, String nationality, int rank, String gender) {
		super(firstname, lastname, nationality);
		this.rank = rank;
		this.gender = gender;
	}
	
	public Player(String firstname, String lastname, String nationality, int rank, String gender,Opponent opp) {
		super(firstname, lastname, nationality);
		this.rank = rank;
		this.gender = gender;
		opponents.add(opp);
	}
	
	public Player(String firstname, String lastname, String nationality, int rank, String gender,List<Opponent> opps) {
		super(firstname, lastname, nationality);
		this.rank = rank;
		this.gender = gender;
		opponents = opps;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nRank: " + rank + "\nGender: " + gender;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + this.getRank() + this.getGender().hashCode();
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Player) 
		{
			Player p =(Player)obj;
			if (super.equals(obj) & p.getRank() == getRank() & p.getGender().equals(getGender()))
			{	
				return true;
			}
			else 
			{
				return false;
			}
		}
		else 
		{
			return false;
		}
	}
}
