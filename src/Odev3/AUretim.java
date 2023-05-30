package Odev3;


import java.util.Random;

public class AUretim implements IUretim {
    public AUretim() {
        // BUretim sınıfının yapıcısı
    }

    @Override
    public void uret(Koloni koloni) {
    	if(koloni.getPopulasyon()>0 || koloni.getYemekStogu()>0) {
        Random random = new Random();
        int uret = random.nextInt(11);
        koloni.setYemekStogu(koloni.getYemekStogu()+uret);
    }
        // BUretim sınıfına özgü üretim işlemleri
    }
}
