package be.Lombardi.DAO;

import java.sql.Connection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Random;

import be.Lombardi.Tournament.Court;
import be.Lombardi.Tournament.Player;
import be.Lombardi.Tournament.Schedule;
import be.Lombardi.Tournament.Tournament;

public class TournamentDAO extends DAO<Tournament> {

	public TournamentDAO(Connection conn) {
		super(conn);
	}

	
	
	@Override
	public boolean create(Tournament obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Tournament obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Tournament obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tournament find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Tournament createTournament() {
		CourtDAO courtDAO = new CourtDAO(this.connect);
		PlayerDAO playerDAO = new PlayerDAO(this.connect);
		MatchDAO matchDAO = new MatchDAO(this.connect);
		Tournament tournament = new Tournament("Tennis Slam");
		List<Player> players = playerDAO.getPlayers();
		Collections.shuffle(players);
		for(int i=0 ; i < tournament.getSchedules().length ; i++) {
			tournament.getSchedules()[i].setMatches(matchDAO.createMatches(tournament.getSchedules()[i], players));
		}
		
		return tournament;
	}
}
