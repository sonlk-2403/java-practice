package Practice3_Car;

public class XeOtoKhach extends Xe {

	private int soCho;

	public XeOtoKhach(String color, String name, int giaXe, int soCho) {
		super(color, name, giaXe);
		this.soCho = soCho;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhThue() {
		System.out.println("Thông tin của xe: " + color +" "+name);

		double thueTieuThu;
		if (soCho >= 5) {

			thueTieuThu = 0.3;
		} else {
			thueTieuThu = 0.5;

		}
		System.out.println("Số tiền trả: " + (giaXe * 0.1 + giaXe * 0.2 + thueTieuThu*giaXe + giaXe));
	}

}
