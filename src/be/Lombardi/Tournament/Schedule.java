package be.Lombardi.Tournament;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
	enum ScheduleType{
		GentlemenSingle,
		LadiesSingle,
		GentlemenDouble,
		LadiesDouble,
		MixedDouble
	}
	private ScheduleType Type;
	private List<Match> matchs = new ArrayList<Match>();
	private Tournament tournament;
	private int actualRound=0;

	public Schedule(Match match, Tournament tournament) {
		matchs.add(match);
		this.tournament = tournament;
	}
	
	public List<Match> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
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
