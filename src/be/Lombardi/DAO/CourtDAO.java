package be.Lombardi.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.Lombardi.Tournament.Court;
import be.Lombardi.Tournament.Player;
import be.Lombardi.Tournament.Tournament;

public class CourtDAO extends DAO<Court>{

	public CourtDAO(Connection conn) {
		super(conn);
	}

	public List<Court> getCourts(Tournament tournament){
		List<Court> courts = new ArrayList<Court>();
		try 
		{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Court");
			Court court;
			while(result.next()) {
				court = new Court(result.getInt(1), result.getInt(2), result.getBoolean(3), tournament);
				courts.add(court);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return courts;
	}
	
	@Override
	public boolean create(Court obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Court obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Court obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Court find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
