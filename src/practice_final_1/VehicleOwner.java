package practice_final_1;

public class VehicleOwner {
	private String cmnd;
	private String name;
	private String email;

	public VehicleOwner(String cmnd, String name, String email) {
		super();
		this.cmnd = cmnd;
		this.name = name;
		this.email = email;
	}
	public void thongTinChuXe() {
		System.out.println("Thong tin chu xe gom: ");
		System.out.println(cmnd + name + email);
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "VehicleOwner [cmnd=" + cmnd + ", name=" + name + ", email=" + email + "]";
	}

	
}
