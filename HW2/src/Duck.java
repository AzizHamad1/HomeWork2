
public class Duck {
	public static void swim() {
		System.out.println("can swim");
	}
	public static void quack() {
		System.out.println("can quack");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beakColor = "yellow";
		Animal duck = new Animal(3,"Female");
		System.out.println(duck.age);
		System.out.println(duck.gender);
		System.out.println(beakColor);
		duck.isMammal();
		duck.mate();
		swim();
		quack();
	}

}