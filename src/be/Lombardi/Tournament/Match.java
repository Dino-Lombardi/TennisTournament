package be.Lombardi.Tournament;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import be.Lombardi.Tournament.Schedule.ScheduleType;

public class Match {

	private LocalDate date;
	private int duration;
	private int round;
	private Referee referee;
	private List<Set> sets = new ArrayList<Set>();
	private Schedule schedule;
	private Court court;
	private Opponent opponents[] = new Opponent[2];
	
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}

	public List<Set> getSets() {
		return sets;
	}

	public void setSets(List<Set> sets) {
		this.sets = sets;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Court getCourt() {
		return court;
	}

	public void setCourt(Court court) {
		this.court = court;
	}

	public Opponent[] getOpponents() {
		return opponents;
	}


	public void setOpponents(Opponent opponents[]) {
		if(opponents.length > 2 || opponents.length < 1) {
			System.out.println("Erreur d'initilisiation.");
		}
		else
			this.opponents = opponents;
	}
	
	public Match(LocalDate date, int duration, Schedule schedule, Opponent opponents[]) {
		setOpponents(opponents);
		this.schedule = schedule;
		this.date = date;
		this.duration = duration;
		this.round = 0;
	}
	public void addOpponent(Opponent opponent) {
		
	}
}
