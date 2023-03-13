package Practice2_Animal;

public class Dog extends Animal{

	private String mauSac;
	private int trongLuong;

	public Dog(String ten, int tuoi, String giong, String mauSac, int trongLuong) {
		super(ten, tuoi, giong);
		this.mauSac = mauSac;
		this.trongLuong = trongLuong;
	}
	public void Dog_info() {
		System.out.println("Thông tin của chó gồm: " + "tên: " + getTen() + ", tuổi: " + getTuoi() + ", giống: " + getGiong() 
		+ ", màu sắc: " + mauSac + ", trọng lượng: " + trongLuong);
	}
}
