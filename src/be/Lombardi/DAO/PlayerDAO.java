package be.Lombardi.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import be.Lombardi.Tournament.Player;

public class PlayerDAO extends DAO<Player> {

	public PlayerDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Player obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Player obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Player obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Player> getPlayers(){
		List<Player> players = new ArrayList<Player>();
		try 
		{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Player");
			Player player;
			while(result.next()) {
				player = new Player(result.getString(1), result.getString(2), result.getString(3), result.getInt(4), result.getString(5));
				players.add(player);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return players;
	}
}
