package Odev3;

import java.util.Random;

class TaktikFactory {
    public static ITaktik createTaktik() {
        Random random = new Random();
        int taktikIndex = random.nextInt(2);  // 0 veya 1 rastgele bir sayı üret
        switch (taktikIndex) {
            case 0:
                return new ATaktik();
            case 1:
                return new BTaktik();
            default:
                throw new IllegalArgumentException("Geçersiz taktik index: " + taktikIndex);
        }
    }
}
