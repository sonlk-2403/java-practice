package Practice2_Animal;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog = new Dog("Mực", 4, "Alaska", "xám", 10);
		dog.Dog_info();
		
		Cat cat = new Cat("Cá", 3, "Châu Âu", "vàng nâu", 5);
		cat.Cat_info();
		
		Animal dog1 = new Dog("Đen", 1, "Cỏ", "trắng", 5);
		dog1.Info();
		//dog1.Dog_info();
		// vì sao ko gọi dc method của thèn con dc nhỉ ?
	}

}
