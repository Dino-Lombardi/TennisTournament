package be.Lombardi.Tournament;

import java.util.ArrayList;
import java.util.List;

public class Tournament {

	private String name;
	private List<Court> courts;
	private Schedule schedule[] = new Schedule[5];
	private List<Referee> referees;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Court> getCourts() {
		return courts;
	}

	public void setCourts(List<Court> courts) {
		this.courts = courts;
	}

	public Schedule[] getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule[] schedule) {
		this.schedule = schedule;
	}

	public List<Referee> getReferees() {
		return referees;
	}

	public void setReferees(List<Referee> referees) {
		this.referees = referees;
	}

	public void Play() {
		
	}
	

}
