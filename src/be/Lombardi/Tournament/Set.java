package be.Lombardi.Tournament;

public class Set {

	private int scoreOp1;
	private int scoreOp2;
	private Match match;
	private Opponent winner;
	
	public int getScoreOp1() {
		return scoreOp1;
	}
	public void setScoreOp1(int scoreOp1) {
		this.scoreOp1 = scoreOp1;
	}
	public int getScoreOp2() {
		return scoreOp2;
	}
	public void setScoreOp2(int scoreOp2) {
		this.scoreOp2 = scoreOp2;
	}
	
	public Opponent getWinner() {
		return winner;
	}
	public void setWinner(Opponent winner) {
		this.winner = winner;
	}
	public void setMatch(Match match) {
		this.match = match;
	}

	public Match getMatch() {
		return match;
	}
	
	public Set(Match match) {
		this.match = match;
	}
	
	public void Play() {
		
	}
}
