package be.Lombardi.Tournament;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import be.Lombardi.DAO.PlayerDAO;
import be.Lombardi.DAO.TennisConnection;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Player> players;
		PlayerDAO pDAO = new PlayerDAO(TennisConnection.getInstance());
		players=pDAO.getPlayers();
		players.forEach(p -> System.out.println(p));
	}
}
