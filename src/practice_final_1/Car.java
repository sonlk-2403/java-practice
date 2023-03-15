package practice_final_1;

public class Car extends Vehicle {

	private int soChoNgoi;
	private String kieuDongCo;

	public Car(String vehicleNumber, String producer, int year, String color, VehicleOwner vehicleOwner, int soChoNgoi, String kieuDongCo) {
		super(vehicleNumber, producer, year, color, vehicleOwner);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void thongTinXe() {
		// TODO Auto-generated method stub
		System.out.println(getVehicleNumber() + getProducer()+ getYear() + getColor() + getVehicleOwner());
		System.out.println(soChoNgoi + kieuDongCo);
	}

}
