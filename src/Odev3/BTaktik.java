package Odev3;
import java.util.Random;
class BTaktik implements ITaktik {
	public BTaktik() {
        super(); // Taktik sınıfının kurucu methodunu çağır
    }
    public void savas(Koloni koloni) {
    	if(koloni.getPopulasyon()>0 || koloni.getYemekStogu()>0) {

        // A taktiği uygulanacak özel işlemler
        Random random = new Random();
        int savasGucu = random.nextInt(1001);  // 0-1000 arasında rastgele bir değer üret
        koloni.setSavasGucu(savasGucu);  // Koloni nesnesinin savaş gücü değerini güncelle
    }
    }
}
