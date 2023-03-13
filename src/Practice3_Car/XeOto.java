package Practice3_Car;

public class XeOto extends Xe{

	public XeOto(String color, String name, int giaXe) {
		super(color, name, giaXe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhThue() {
		// TODO Auto-generated method stub
		System.out.println("Thông tin của xe: " + color +" "+name);
		System.out.println("Số tiền trả: " + (giaXe*0.1 + giaXe*0.02 + giaXe));
	}

}
