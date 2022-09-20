package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi=31;
		boolean asalMi=true;
		if(sayi==1) {
			System.out.println("Sayı Asal Değildir.");
			return;
		}
		if(sayi<1) {
			System.out.println("Geçersiz Sayı!");
			return;
		}
		
		
		for(int i=2;i<(sayi/2);i++) {
			if(sayi%i==0) {
				asalMi=false;
				break;
			}
		}
		if(asalMi==true) System.out.println("Sayı Asaldır.");
		else System.out.println("Sayı Asal Değildir.");
		

	}

}
