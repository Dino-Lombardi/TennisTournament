package be.Lombardi.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import be.Lombardi.Tournament.Match;
import be.Lombardi.Tournament.Opponent;
import be.Lombardi.Tournament.Player;
import be.Lombardi.Tournament.Schedule;
import be.Lombardi.Tournament.Tournament;

public class MatchDAO extends DAO<Match> {

	public MatchDAO(Connection conn) {
		super(conn);
	}

	public List<Match> createMatches(Schedule schedule, List<Player> shuffledplayers) {
		List<Match> matches = new ArrayList<Match>();
		Iterator<Player> iterator = shuffledplayers.iterator();
		Player player;
		int count=0;

		switch (schedule.getType()) {
		  case GentlemenSingle:
			  for(int i = 0; i < 5; i++) {
				  count=0;
				  Opponent opponents[] = new Opponent[2];
				  while(iterator.hasNext() && count < 2) {
					  player = iterator.next(); 
					  if(player.getGender().equals("Male")) {
						  opponents[count] = new Opponent(player);
						  iterator.remove();
						  count++;
					  }
				  }
				  matches.add(new Match(LocalDate.now(), 100, schedule, opponents));
			}
		return matches;
			
		  case LadiesSingle:
			  for(int i = 0; i < 5; i++) {
				  Opponent opponents[] = new Opponent[2];
				  count=0;
				  while(iterator.hasNext() && count < 2) {
					  player = iterator.next(); 
					  if(player.getGender().equals("Female")) {
						  opponents[count] = new Opponent(player);
						  iterator.remove();
						  count++;
					  }
				  }
				  matches.add(new Match(LocalDate.now(), 100, schedule, opponents));
			  }
				return matches;

		  case GentlemenDouble:
			  for(int i = 0; i < 5; i++) {
				  Opponent opponents[] = new Opponent[2];
				  count=0;
				  while(iterator.hasNext() && count < 2) {
					  player = iterator.next(); 
					  if(player.getGender().equals("Male")) {
						  opponents[count] = new Opponent(player);
						  iterator.remove();
						  count++;
					  }
				  }
				  
				  count=0;
				  while(iterator.hasNext() && count < 2) {
					  player = iterator.next(); 
					  if(player.getGender().equals("Male")) {
						  opponents[count].AddSecondPlayer(player);
						  iterator.remove();
						  count++;
					  }
				  }
				  matches.add(new Match(LocalDate.now(), 100, schedule, opponents));
			  }
			  return matches;	
			  
		  case LadiesDouble:
			  for(int i = 0; i < 5; i++) {
				  Opponent opponents[] = new Opponent[2];
				  count=0;
				  while(iterator.hasNext() && count < 2) {
					  player = iterator.next(); 
					  if(player.getGender().equals("Female")) {
						  opponents[count] = new Opponent(player);
						  iterator.remove();
						  count++;
					  }
				  }
				  
				  count=0;
				  while(iterator.hasNext() && count < 2) {
					  player = iterator.next(); 
					  if(player.getGender().equals("Female")) {
						  opponents[count].AddSecondPlayer(player);
						  iterator.remove();
						  count++;
					  }
				  }
				  matches.add(new Match(LocalDate.now(), 100, schedule, opponents));
			  }
			  return matches;	
			  
		  case MixedDouble:
			  for(int i = 0; i < 5; i++) {
				  Opponent opponents[] = new Opponent[2];
				  count=0;
				  while(iterator.hasNext() && count < 2) {
					  player = iterator.next(); 
					  if(player.getGender().equals("Male")) {
						  opponents[count] = new Opponent(player);
						  iterator.remove();
						  count++;
					  }
				  }
				  
				  count=0;
				  while(iterator.hasNext() && count < 2) {
					  player = iterator.next(); 
					  if(player.getGender().equals("Female")) {
						  opponents[count].AddSecondPlayer(player);
						  iterator.remove();
						  count++;
					  }
				  }
				  matches.add(new Match(LocalDate.now(), 100, schedule, opponents));
			  }
			  return matches;
		}
		return null;
	}

	@Override
	public boolean delete(Match obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Match obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Match find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Match obj) {
		// TODO Auto-generated method stub
		return false;
	}
}
