package practice_final_1;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleOwner son1 = new VehicleOwner("204120020022", "son1", "son1@gmail.com");
		VehicleOwner son2 = new VehicleOwner("204120022023", "son2", "son2@gmail.com");
		VehicleOwner son3 = new VehicleOwner("2041200230", "son3", "son3@gmail.com");

		// add vehicle successfully

		Vehicle car1 = new Car("ABC-111", "Honda", 2022, "Red", son1, 4, "2 engine");
		Vehicle car2 = new Car("ABC-222", "Yamaha", 2022, "Red", son2, 4, "2 engine");

		Vehicle motobike1 = new MotoBike("ABC-333", "Suzuki", 2022, "Red", son3, "2 engine");
		Vehicle motobike2 = new MotoBike("ABC-333", "Toyota", 2022, "Red", son1, "2 engine");

		VehicleManagement obj = new VehicleManagement();
		obj.addVehicle(car1);
		obj.addVehicle(car2);

		obj.addVehicle(motobike1);
		obj.addVehicle(motobike2);

		//obj.findVehicleByVehicleNumber("ABC-222").thongTinXe();
		obj.findVehicleByVehicleNumber("ABC-333").thongTinXe();

		obj.removeVehicleByProducer("Toyota");
		System.out.println("\n\n\n");

		for (Vehicle vehicle : obj.getVehicles()) {
			vehicle.thongTinXe();
		}
		System.out.println("\n\n\n");
		System.out.println(obj.findProducerWithMostVehicles());

		obj.sortVehiclesByLicenseNumberDescending();
		for (Vehicle vehicle : obj.getVehicles()) {
			vehicle.thongTinXe();
		}

		Map<String, Integer> vehiclesByTypes = obj.countVehiclesByType();
		vehiclesByTypes.forEach((k, v) -> {
			System.out.println("Loại " + k + " - số lượng: " + v);
		});

	}

}
