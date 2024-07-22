package Ornek5;

import java.util.Scanner;

class BankaHesabı{
	public double Bakiye=10000;
	
	public BankaHesabı(double Bakiye) {
		this.Bakiye=Bakiye;
	}
	
	void Deposit() {
		
	}
	void çekme(int Bakiye) {
		
		
}
}
class BirikimHesabı extends BankaHesabı{

	public BirikimHesabı(double Bakiye) {
		super(Bakiye);
		this.Bakiye=Bakiye;
		System.out.println("Hoş Geldiniz...");
		
	}
	@Override 
void çekme(int miktar) {
		if(miktar<100)
		{
		System.out.println("Para Çekilemedi...");	
		}
		
		else
		{
		   if(Bakiye-miktar<0) {
			System.out.println("Yetersiz Bakiye...");
		    }
		   else {
            Bakiye-=miktar;
            System.out.println("Para Çekildi...");
            System.out.println("Kalan Bakiye: "+Bakiye);		
		    }
	    }
	}
	
}

  public class Main{
	  
	  
	  public static void main(String[] args) {
		  Scanner scanner =new Scanner(System.in);
		  System.out.println("*********************");
		  System.out.println("Bankamıza HoşGeldiniz");
		  System.out.println("*********************");
		  System.out.println("Lütfen Bakiye Miktarı Girin: ");
		  double Bakiye=scanner.nextDouble();
		  
		  System.out.println("Lütfen Çekmek İstediğiniz Miktarı Girin: ");
		  int miktar=scanner.nextInt();
		  
		  BirikimHesabı hesap=new BirikimHesabı(Bakiye);
		  hesap.çekme(miktar);
		  
	  }
	  
  }

   
