package be.Lombardi.Tournament;

public class Court {
	
	private int nbSpectators;
	private boolean covered;
	private Tournament tournament;
	private Match match;
	
	public int getNbSpectators() {
		return nbSpectators;
	}
	public void setNbSpectators(int nbSpectators) {
		this.nbSpectators = nbSpectators;
	}
	public boolean isCovered() {
		return covered;
	}
	public void setCovered(boolean covered) {
		this.covered = covered;
	}
	
	public Court(int nbsp, boolean covered,Tournament tournament) {
		nbSpectators = nbsp;
		this.covered = covered;
		this.tournament = tournament;
	}
	
	public Court(int nbsp, boolean covered,Tournament tournament, Match match) {
		this(nbsp, covered, tournament);
		this.match = match;
	}
	
	public void Available() {
		
	}
	
	public void Release() {
		
	}
	
}
