package be.Lombardi.Tournament;

import java.util.ArrayList;
import java.util.List;

import be.Lombardi.Tournament.Schedule.ScheduleType;

public class Tournament {

	private String name;
	private List<Court> courts;
	private Schedule schedules[] = new Schedule[5];
	private List<Referee> referees;
	
	
	
	public Tournament(String name) {
		createSchedules();
		this.name = name;
		
	}
	
	public Tournament(String name, List<Referee> referees) {
		this(name);
		createSchedules();
		this.referees = referees;
	}

	
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

	public Schedule[] getSchedules() {
		return schedules;
	}

	private void createSchedules() {
		schedules[0] = new Schedule(this, ScheduleType.GentlemenSingle);
		schedules[1] = new Schedule(this, ScheduleType.LadiesSingle);
		schedules[2] = new Schedule(this, ScheduleType.GentlemenDouble);
		schedules[3] = new Schedule(this, ScheduleType.LadiesDouble);
		schedules[4] = new Schedule(this, ScheduleType.MixedDouble);

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
