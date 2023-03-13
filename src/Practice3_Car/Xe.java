package Practice3_Car;

public abstract class Xe {
	
	protected String color;
	protected String name;
	protected int giaXe;
	
	
	public Xe(String color, String name, int giaXe) {

		this.color = color;
		this.name = name;
		this.giaXe = giaXe;
	}


	public abstract void tinhThue();


	@Override
	public String toString() {
		return "Xe [color=" + color + ", name=" + name + ", giaXe=" + giaXe + "]";
	}
	
	
	public String print() {
		return "Xe [color=" + color + ", name=" + name + ", giaXe=" + giaXe + "]";
	}
}
