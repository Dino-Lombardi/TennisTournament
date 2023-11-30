package be.Lombardi.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be.Lombardi.Tournament.Referee;

public class RefereeDAO extends DAO<Referee> {

		public RefereeDAO(Connection conn) {
			super(conn);
		}

		@Override
		public boolean create(Referee obj) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean delete(Referee obj) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean update(Referee obj) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Referee find(int id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public List<Referee> getReferees(){
			
			List<Referee> referees = new ArrayList<Referee>();
			try 
			{
				ResultSet result = this.connect.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Referee");
				Referee referee;
				while(result.next()) {
					referee = new Referee(result.getInt("idReferee"), 
							result.getString("firstname"), result.getString("lastname"),
							result.getString("nationality"));
					referees.add(referee);
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			return referees;		
		}
}
