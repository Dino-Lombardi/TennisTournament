package be.Lombardi.Tournament;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import be.Lombardi.DAO.PlayerDAO;
import be.Lombardi.DAO.TennisConnection;
import be.Lombardi.DAO.TournamentDAO;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*PlayerDAO playerDAO = new PlayerDAO(TennisConnection.getInstance());
		*List<Player> players = playerDAO.getPlayers();*/
		TournamentDAO tournamentDAO = new TournamentDAO(TennisConnection.getInstance());
		Tournament tournament = tournamentDAO.createTournament();
		System.out.println(tournament.getSchedules()[1].getType());
		Match match = tournament.getSchedules()[0].getMatches().get(0);
		System.out.println(match.getDuration());
		System.out.println(match.getOpponents()[0].getPlayers()[0].getFirstname());
		System.out.println(match.getOpponents()[1].getPlayers()[0].getFirstname());

	}
}
