package Practice1_TransferMoney;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void credit(int amount) {
		if (amount <= 0) {
			System.out.println("Số tiền không hợp lệ");
		} else {
			balance += amount;
			System.out.println("Nộp tiền thành công");

		}
	}

	public void debit(int amount) {
		if (amount <= 0) {
			System.out.println("Số tiền không hợp lệ");
		} else if (amount > balance) {
			System.out.println("Thanh toán không thành công");
		} else {
			balance -= amount;
			System.out.println("Thanh toán thành công");

		}
	}

	public void tranferTo(Account account, int amount) {
		if (amount <= 0) {
			System.out.println("Số tiền không hợp lệ");
		} else if (amount > balance) {
			System.out.println("Số tiền không đủ để chuyển");

		} else {
			this.balance -= amount;
			account.credit(amount);
			//account.balance += amount;
			System.out.println("Chuyển tiền thành công");
		}

	}

	public static void main(String[] args) {
		Account son = new Account("001", "SonLK", 50);
		System.out.println("Tai khoan cua Son: " + son.getBalance());
		System.out.println("Nap vao tai khoan Son 10k");
		son.credit(10);
		System.out.println("Số dư của bạn còn: " + son.getBalance());
		
		System.out.println(" Thanh toan tai khoan son 20k");
		son.debit(20);
		System.out.println("số dư của bạn còn: " + son.getBalance());

		Account tuan = new Account("002", "TuanNH", 0);
		System.out.println("Son chuyen tien cho tuan 40k");
		son.tranferTo(tuan, 40);
		System.out.println("số dư của Tuấn: " + tuan.getBalance());
		System.out.println("số dư của Son: " + son.getBalance());

	}

}
