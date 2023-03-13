package Practice4_QuanLyHocSinh;

public class Main {

	public static void main(String[] args) {
		School hs = new School();
		hs.addStudent(new Student("SonLK", 20, "QN"));
		hs.addStudent(new Student("Tuan", 23, "DN"));
		hs.addStudent(new Student("Nhu", 21, "QN"));
		hs.addStudent(new Student("Mi", 23, "DN"));
		

		System.out.println("20 years old students:");
		for (Student student : hs.getStudentList()) {
			if (student.getTuoi() == 20) {
				student.HS_infor();
			}
		}
		

		
		System.out.println("======================");

		int count = 0;
		for (Student student : hs.getStudentList()) {
			if (student.getTuoi() == 23 && student.getDiaChi() == "DN") {
				count += 1;
			}
		}
		System.out.println("Number of students with 23 years old and Address in DN: " + count);
		

	}

}
