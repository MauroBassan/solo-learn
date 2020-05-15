package base;

public class TestAnimal {

	public static void main(String[] args) {
		
		
		Dog boxer = new Dog();
		boxer.eat();
		boxer.makeSound();
		System.out.println(boxer.legs);
		
		Animal pet[] = new Animal[2];
		pet[0] = new Dog();
		pet[1] = new Dog();
		for(int i = 0; i<2; i++) {
			pet[i].makeSoud();
		}

	}

}
