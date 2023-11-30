package be.Lombardi.Tournament;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import be.Lombardi.DAO.PlayerDAO;
import be.Lombardi.DAO.RefereeDAO;
import be.Lombardi.DAO.TennisConnection;
import be.Lombardi.DAO.TournamentDAO;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TournamentDAO tournamentDAO = new TournamentDAO(TennisConnection.getInstance());
		RefereeDAO refereeDAO = new RefereeDAO(TennisConnection.getInstance());
		Tournament tournament = tournamentDAO.createTournament();
		tournament.setReferees(refereeDAO.getReferees());
	}
}
