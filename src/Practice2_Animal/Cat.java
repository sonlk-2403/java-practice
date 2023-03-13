package Practice2_Animal;

public class Cat extends Animal{
	private String mauLong;
	private int chieuCao;

	public Cat(String ten, int tuoi, String giong, String mauLong, int chieuCao) {
		super(ten, tuoi, giong);
		this.mauLong = mauLong;
		this.chieuCao = chieuCao;
	}
	public void Cat_info() {
		super.Info();
		System.out.println("màu lông: " + mauLong + ", chiều cao: " + chieuCao);
	}
	
}
