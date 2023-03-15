package practice_final_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import java.util.List;

public class VehicleManagement {
	private List<Vehicle> vehicles;

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public VehicleManagement() {
		vehicles = new ArrayList<>();
	}

	// 1. them phuong tien
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	 //tim kiem
	public Vehicle findVehicleByVehicleNumber(String vehicleNumber) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getVehicleNumber().equals(vehicleNumber)) {
				return vehicle;
			}
		}
		return null;
	}

	// 3. tim kiem phuong tien cua chu xe co so cmnd

	public List<Vehicle> findVehicleByCmnd(String CMND) {
		List<Vehicle> vehivlesByICMND = new ArrayList<>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getVehicleOwner().getCmnd().equals(CMND)) {
				vehivlesByICMND.add(vehicle);
			}

		}
		return vehivlesByICMND;
	}

	// 4. Xoa tat ca phuong tien giao thong cua 1 nha sx bat ky
	// cách 1:
//	public void removeVehicleByProducer(String producer) {
//		this.vehicles.removeIf(vehicle -> vehicle.getProducer().equals(producer));
//	}
	// cách 2
	public boolean removeVehicleByProducer(String producer) {
		Vehicle vh = this.vehicles.stream().filter(vehicle -> vehicle.getProducer().equals(producer)).findFirst().orElse(null);
		if (vh == null) {
			return false;
		}
		this.vehicles.remove(vh);
		return true;
	}

	// 5. hien thi nha sx co nhiu xe nhat
	public String findProducerWithMostVehicles() {
		Map<String, Integer> producerCountMap = new HashMap<>();
		for (Vehicle vehicle : this.vehicles) {
			String producer = vehicle.getProducer();
			int count = producerCountMap.getOrDefault(producer, 0);
			producerCountMap.put(producer, count + 1);
		}
		String producerWithMostVehicles = null;
		int maxVehicleCount = 0;
		for (Map.Entry<String, Integer> entry : producerCountMap.entrySet()) {
			if (entry.getValue() > maxVehicleCount) {
				producerWithMostVehicles = entry.getKey();
				maxVehicleCount = entry.getValue();
			}
		}
		return producerWithMostVehicles;

	}

	// 6. Sắp xếp các phương tiện giao thông theo số xe giảm dần
	public List<Vehicle> sortVehiclesByLicenseNumberDescending() {
		Collections.sort(vehicles);
		return vehicles;

	}

	// 7. Thống kê mỗi loại phương tiện có bao nhiêu xe đang được quản lý.
	public Map<String, Integer> countVehiclesByType() {
		Map<String, Integer> vehicleCountMap = new HashMap<>();
		vehicleCountMap.put("Car", getNumberOfCars());
		vehicleCountMap.put("Motorcycle", getNumberOfMotorcycle());
		vehicleCountMap.put("Truck", getNumberOfTrucks());
		return vehicleCountMap;
	}

	private int getNumberOfCars() {
		int count = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Car) {
				count++;
			}
		}
		return count;
	}

	private int getNumberOfMotorcycle() {
		int count = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof MotoBike) {
				count++;
			}
		}
		return count;
	}

	private int getNumberOfTrucks() {
		int count = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Truck) {
				count++;
			}
		}
		return count;
	}

}
