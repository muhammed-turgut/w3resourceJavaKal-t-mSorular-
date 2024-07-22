package Ornek3;
 
class Shape{

	 void getArea(int kenar1,int kenar ) {
		
	}
}
class Rectangle extends Shape{
	
	@Override
	void getArea( int kısaKenar,int uzunKenar) {
		
		int alan=kısaKenar*uzunKenar;
		System.out.println("Alan: "+alan);
	}
}

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.getArea(12, 10);
		
	}
	

}
