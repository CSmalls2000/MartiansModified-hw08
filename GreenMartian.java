package prob1;

public class GreenMartian extends Martian implements Teleporter {
	
	//Constructors
	public GreenMartian(int id, int volume) {
		super(id, volume);
	}
	
	public GreenMartian(int id) {
		this(id, 1);
	}
	
	//Methods
	@Override
	public String speak() {
		return String.format("id=%d, Grobldy Grock", getId());
	}
	
	@Override
	public String teleport(String dest) {
		return String.format("id=%d teleporting to %s", getId(), dest);
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("Green Martian - id=%d, vol=%d", getId(), getVolume());
	}

	

}
