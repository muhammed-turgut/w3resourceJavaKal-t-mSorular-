package Ornek1;
class Hayvan{
	void makeSound(){
		System.out.println("Hav hav");
	}
}
class Cat extends Hayvan{
	@Override 
	void makeSound() {
		System.out.println("miyav miyav...");
	}
}

public class Main {
  public static void main(String[] args) {
	Hayvan hayvan=new Hayvan();
	Cat cat=new Cat();
	
	hayvan.makeSound();
	cat.makeSound();
}
	
}
