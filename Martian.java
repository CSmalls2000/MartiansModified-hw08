package prob1;

public abstract class Martian implements Comparable<Martian>{
	
	//Instance Variables
	private int id;
	private int volume;
	
	//Constructor
	public Martian (int id, int volume) {
		this.id = id;
		this.volume = volume;
	}
	
	//Getters and Setter
	public int getId() {
		return id;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//Methods
	@Override
	public int compareTo(Martian m) {
		int diff = this.id - m.id;
		if(diff<0) {
			return diff;
		}
		if(diff>0) {
			return diff;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Martian) {
			if(this.id == ((Martian)o).id) {
				return true;
			}
		}
		return false;
	}
	
	
	public abstract String speak();

}
