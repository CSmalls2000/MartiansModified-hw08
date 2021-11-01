package prob1;

public class RedMartian extends Martian {
	
	//Instance Variable
	private int tenacity;
	
	//Constructor
	public RedMartian(int id, int volume, int tenacity) {
		super(id,volume);
		this.tenacity = tenacity;
	}
	
	public RedMartian(int id, int tenacity) {
		this(id, 1, tenacity);
	}
	
	//Getter
	public int getTenacity() {
		return tenacity;
	}
	
	//Method
	@Override
	public String speak() {
		return String.format("id=%d, Rubldy Rock", getId());
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("Red Martian   - id=%d, vol=%d, ten=%d", getId(), getVolume(), getTenacity());
	}

}
