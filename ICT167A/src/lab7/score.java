package lab7;

public class score {
	private String name;
	private int score;
	
	public score() {
		
	}
	
	public score(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
