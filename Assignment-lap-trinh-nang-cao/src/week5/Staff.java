package week5;

public class Staff extends Employee {
	
	private String rank;
	
	public Staff() {
		super();
	}

	public Staff(String rank) {
		super();
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + ", rank = " + rank;
	}
	
	
}
