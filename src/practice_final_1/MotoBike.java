package practice_final_1;

public class MotoBike extends Vehicle{
	private String wattage;

	public MotoBike(String vehicleNumber, String producer, int year, String color, VehicleOwner vehicleOwner, String wattage) {
		super(vehicleNumber, producer, year, color, vehicleOwner);
		// TODO Auto-generated constructor stub
		this.wattage = wattage;
	}

	@Override
	public void thongTinXe() {
		// TODO Auto-generated method stub
		System.out.println(getVehicleNumber() + getProducer()+ getYear() + getColor() + getVehicleOwner());
		System.out.println(wattage);
	}
	

}
