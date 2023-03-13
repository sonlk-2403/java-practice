package Practice3_Car;

public class XeDap extends Xe {

	public XeDap(String color, String name, int giaXe) {
		super(color, name, giaXe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhThue() {
		// TODO Auto-generated method stub
		System.out.println("Thông tin của xe: " + color +" "+name);
		System.out.println("Số tiền trả: " + giaXe);
	}
	

}
