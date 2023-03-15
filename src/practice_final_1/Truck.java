package practice_final_1;

public class Truck extends Vehicle {
	private String tonnage;

	public Truck(String vehicleNumber, String producer, int year, String color, VehicleOwner vehicleOwner, String tonnage) {
		super(vehicleNumber, producer, year, color, vehicleOwner);
		this.tonnage = tonnage;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void thongTinXe() {
		// TODO Auto-generated method stub
		System.out.println(getVehicleNumber() + getProducer() + getYear() + getColor() + getVehicleOwner());
		System.out.println(tonnage);
	}

}
