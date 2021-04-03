
public class Zebra {
	static void run() {
		System.out.println("can run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean is_wild = true;
		Animal zebra = new Animal(9,"male");
		System.out.println(zebra.age);
		System.out.println(zebra.gender);
		System.out.println(is_wild);
		zebra.isMammal();
		zebra.mate();
		run();

	}

}
