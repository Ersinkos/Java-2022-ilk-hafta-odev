package miniProjeSesliHarf;

public class Main {

	public static void main(String[] args) {
		char harf='o';
		char[] kalinHarfler= {'A','I','O','U','a','ı','o','o'};
		char[] inceHarfler= {'E','İ','Ö','Ü','e','i','ö','ü'};
		
		for(char kontrol:kalinHarfler) {
			if(harf==kontrol) {
				System.out.println("Kalın Sesli Harf.");
				return;
			}
		}
		for(char kontrol:inceHarfler) {
			if(harf==kontrol) {
				System.out.println("İnce Sesli Harf.");
				return;
			}
		}
		System.out.println("Geçersiz Veri Girişi!!!!!");
	}

}
