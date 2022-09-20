package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar= {1,2,5,7,9,0};
		int aranacak=3;
		
		for(int sayi:sayilar) {
			if(aranacak==sayi) {
				System.out.println("Sayı Bulundu.");
				return;
			}
		}
		System.out.println("Sayı Bulunamadı.");

	}

}
