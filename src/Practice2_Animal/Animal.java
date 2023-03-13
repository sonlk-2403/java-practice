package Practice2_Animal;

public class Animal {
	protected String ten;
	protected int tuoi;
	protected String giong;

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

	public String getGiong() {
		return giong;
	}

	public void setGiong(String giong) {
		this.giong = giong;
	}

	public Animal(String ten, int tuoi, String giong) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.giong = giong;
	}
	
	public void Info() {
	System.out.println("Thông tin của Animal gồm: " + "tên: " + getTen() + ", tuổi: " + getTuoi() + ", giống: " + getGiong());
}

}
