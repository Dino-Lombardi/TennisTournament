package be.Lombardi.Tournament;

import java.util.ArrayList;
import java.util.List;

public class Opponent {
	private Player players[] = new Player[2];
	private List<Set> sets = new ArrayList<Set>();
	private List<Match> matchs = new ArrayList<Match>();
 
	
	public Opponent(Player p) {
		players[0] = p;
	}
	
	public List<Set> getSets() {
		return sets;
	}

	public void setSets(List<Set> sets) {
		this.sets = sets;
	}

	public List<Match> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public void AddSecondPlayer(Player p) {
		players[1] = p;
	}

	public Player[] getPlayers() {
		return players;
	}
	
	public void AddSet(Set set) {
		sets.add(set);
	}
}
