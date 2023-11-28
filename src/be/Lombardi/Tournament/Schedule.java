package be.Lombardi.Tournament;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
	public enum ScheduleType{
		GentlemenSingle,
		LadiesSingle,
		GentlemenDouble,
		LadiesDouble,
		MixedDouble
	}
	private ScheduleType Type;
	private List<Match> matches = new ArrayList<Match>();
	private Tournament tournament;
	private int actualRound=0;

	public Schedule(Tournament tournament, ScheduleType type) {
		this.tournament = tournament;
		this.Type = type;
	}
	public Schedule(Tournament tournament) {
		this.tournament = tournament;
	}
	
	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matchs) {
		this.matches = matchs;
	}

	public ScheduleType getType() {
		return Type;
	}

	public void setType(ScheduleType type) {
		Type = type;
	}

	public int getActualRound() {
		return actualRound;
	}

	public void setActualRound(int actualRound) {
		this.actualRound = actualRound;
	}
	
	public void NbWinningSets() {
		
	}
	
	public void PlayNextRound() {
		
	}
	
	public void GetWinner() {
		
	}
}
