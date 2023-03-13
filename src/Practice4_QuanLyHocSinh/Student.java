package Practice4_QuanLyHocSinh;

public class Student {
	private String ten;
	private int tuoi;
	private String diaChi;
	
	public Student(String ten, int tuoi, String diaChi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void HS_infor() {
		System.out.println("Thông tin học sinh gồm: ");

		System.out.println("Tên: " + getTen());
		System.out.println("Tuổi: " + getTuoi());
		System.out.println("Địa chỉ: " + getDiaChi());

		
	}

	@Override
	public String toString() {
		return "Student [ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + "]";
	}



}
