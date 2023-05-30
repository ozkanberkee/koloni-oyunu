package Odev3;

import java.util.Random;

class UretimFactory {
    public static IUretim createUretim() {
    	
        Random random = new Random();
        int uretimIndex = random.nextInt(2);  // 0 veya 1 rastgele bir sayı üret
        switch (uretimIndex) {
            case 0:
                return new AUretim();
            case 1:
                return new BUretim();
            default:
                throw new IllegalArgumentException("Geçersiz taktik index: " + uretimIndex);
        }
    }
}
