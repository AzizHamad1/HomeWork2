
public class Fish {
	static void swim() {
		System.out.println("can swin");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sizeInFt = 16;
		boolean canEat = true;
		Animal fish = new Animal(2,"male");
		System.out.println(fish.age);
		System.out.println(fish.gender);
		System.out.println(sizeInFt);
		System.out.println(canEat);
		fish.isMammal();
		fish.mate();
		swim();
	}

}