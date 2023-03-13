package Practice3_Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

//	public static void name(Xe a) {
//		if (a instanceof XeDap) {
//			System.out.println("gia xe la: " + a.giaXe);
//		} else if (a instanceof XeMay) {
//			System.out.println("gia xe la: " + a.giaXe);
//		}

//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XeDap xedap = new XeDap("đỏ", "maxtin", 500000);
		xedap.tinhThue();

		XeMay xemay = new XeMay("Hồng", "honda", 1000000);
		xemay.tinhThue();

		XeOtoKhach xeotokhach = new XeOtoKhach("Đen", "huyndai", 5000000, 10);
		xeotokhach.tinhThue();

//		Xe a1 = new XeDap("đỏ1", "maxtin1", 5100000);
//		Xe a2 = new XeMay("Hồng", "honda", 12000000);
//
//		System.out.println(xedap instanceof XeDap);
//		
//		Main.name(a1); 
//		Main.name(a2); 
		
		//Cach 1
		List<Xe> quanLyXe2 = new ArrayList<Xe>();
		quanLyXe2.add(xedap);
		quanLyXe2.add(xemay);
		System.out.println(quanLyXe2);
		
		//Cach 2
		List<Xe> quanLyXe = Arrays.asList(xedap, xemay, xeotokhach);
		for (Xe xe : quanLyXe) {
			System.out.print(xe.toString());
			System.out.print(", ");
		}
	}

}
