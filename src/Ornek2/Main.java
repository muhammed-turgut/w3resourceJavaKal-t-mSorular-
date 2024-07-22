package Ornek2;

  class Araç{
	public void drive() {
		System.out.println("Burası Araç Sınıfı");
	}
}
  class Araba extends Araç{
	  @Override
	  public void drive() {
		  System.out.println("Bir araba tamir ediliyor");
	  }
  }

public class Main {
	public static void main(String[] args) {
		Araç araç=new Araç();
		Araba araba=new Araba();
		
		araba.drive();
		araç.drive();
	}

}
