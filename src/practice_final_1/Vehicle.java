package practice_final_1;

import java.util.Comparator;

public abstract class Vehicle implements Comparable<Vehicle>, Comparator<Vehicle> {
	private String vehicleNumber;
	private String producer;
	private int year;
	protected String color;
	protected VehicleOwner vehicleOwner;


	public Vehicle(String vehicleNumber, String producer, int year, String color, VehicleOwner vehicleOwner) {
		this.vehicleNumber = vehicleNumber;
		this.producer = producer;
		this.year = year;
		this.color = color;
		this.vehicleOwner = vehicleOwner;
	}
	public abstract void thongTinXe();

	@Override
	public int compareTo(Vehicle other) {
		return other.vehicleNumber.compareTo(this.vehicleNumber);
	}
	
	@Override
	public int compare(Vehicle a, Vehicle b) {
		return b.vehicleNumber.compareTo(a.getVehicleNumber());
	}
	
	public void loaiPhuongTien() {
		System.out.println(this.getClass().toString());
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public String getProducer() {
		return producer;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public VehicleOwner getVehicleOwner() {
		return vehicleOwner;
	}


	@Override
//	public String toString() {
//		return "Vehicle{" + "number=" + vehicleNumber + '\'' + ", producer=" + producer + ", year='" + year + '}'
//				+ System.getProperty("line.separator");
//	}
	
    public String toString() {
        return "Vehicle{" +
                "number='" + vehicleNumber + '\'' +
                ", producer=" + producer +
                ", year='" + year + '\'' +
                '}';
    }
}
