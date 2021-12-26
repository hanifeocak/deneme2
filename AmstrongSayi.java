package ATM_Projesi;

import java.util.Scanner;

public class AmstrongSayi {

	public static void main(String[] args) {
		//Amstrongsayi
	Scanner scan=new Scanner(System.in);
	System.out.println("bir sayi giriniz");
	int sayi=scan.nextInt();
	System.out.println("Basamak sayisi");
	int basamakSayisi=scan.nextInt();
	
	int geciciSayi=sayi;
	int toplam=0;
	
	do {
		int basamak_Degeri=geciciSayi % 10;
		geciciSayi/=10;
	toplam+=Math.pow(basamak_Degeri, basamakSayisi);
	
	} while (geciciSayi >0);
	if (sayi == toplam) {
		System.out.println("sayi bir amstrong sayisidir..");
	
	} else {
		System.out.println("sayi bir amstrong sayisi  degildir..");
	}
	
	}

}
