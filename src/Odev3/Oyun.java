package Odev3;

public class Oyun {
    private Koloni[] koloniler;
    private int turSayisi;

    public Oyun(Koloni[] koloniler) {
        this.koloniler = koloniler;
        this.turSayisi = 0;
    }

    public void oyunuBaslat() {
    	
        int koloniSayisi = koloniler.length;

        while (koloniSayisi > 1) {
            turSayisi++;

            for (Koloni koloni : koloniler) {
            	if (koloni == null) {
                    continue; // Ölü kolonileri atla
                }
                ITaktik randomTaktik = TaktikFactory.createTaktik();
                randomTaktik.savas(koloni);
            }

            Savas.savasSonu(koloniler);

            System.out.println();
            for (Koloni koloni : koloniler) {
                koloni.koloni_Yazdir();
                System.out.println();
            }
            Konsol.clearConsole();


            for (Koloni koloni : koloniler) {
                IUretim randomUretim = UretimFactory.createUretim();
                randomUretim.uret(koloni);
            }

            koloniSayisi = turuTamamla(koloniler);
            System.out.println();
        }
        System.out.println("Tur " + turSayisi);

        for (Koloni koloni : koloniler) {
            koloni.koloni_Yazdir();
            System.out.println();
        }

    }

    private int turuTamamla(Koloni[] koloniler) {
        int aktifKoloniler = 0;

        for (Koloni koloni : koloniler) {
            int populasyon = koloni.getPopulasyon();
            int yeniPopulasyon = (int) (populasyon * 1.2);
            int yemekAzalmasi = populasyon * 2;

            if (koloni.getYemekStogu() <= 2 || koloni.getPopulasyon() <= 2) {
                koloni.setPopulasyon(0);
            } else {
                koloni.setYemekStogu(koloni.getYemekStogu() - yemekAzalmasi);
                koloni.setPopulasyon(yeniPopulasyon);
                aktifKoloniler++;
            }
        }

        return aktifKoloniler;
    }
}






