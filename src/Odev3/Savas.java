package Odev3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Savas {
	public static void savasSonu(Koloni[] koloniler) {
	    Set<String> karsilastirmaSet = new HashSet<>();
	    

	    for (int i = 0; i < koloniler.length - 1; i++) {
	        for (int j = i + 1; j < koloniler.length; j++) {
	            Koloni koloni1 = koloniler[i];
	            Koloni koloni2 = koloniler[j];
	            if (koloni1 == koloni2 || karsilastirmaSet.contains(koloni1.getRandomSembol() + "-" + koloni2.getRandomSembol())) {
	                continue;
	            }
	            	if(koloni1.getPopulasyon()>1 || koloni1.getYemekStogu()>1 || koloni2.getPopulasyon()>1 || koloni2.getYemekStogu()>1) {
	            int savasGucu1 = koloni1.getSavasGucu();
	            int savasGucu2 = koloni2.getSavasGucu();

	            char sembol1 = koloni1.getRandomSembol();
	            char sembol2 = koloni2.getRandomSembol();
                int fark = Math.abs(savasGucu1 - savasGucu2);
	            if (savasGucu1 > savasGucu2) {
	                double oran = (double)fark / 1000.0;
	                	koloni1.setKazanma(koloni1.getKazanma()+1);
	                	koloni2.setKaybetme(koloni2.getKaybetme()+1);
	                	 int azalanPopulasyon = (int)(koloni2.getPopulasyon() * oran);
	                     int yemekAzalmasi = (int)(koloni2.getYemekStogu() * oran);
	                     koloni2.setYemekStogu(koloni2.getYemekStogu() - yemekAzalmasi);
	                     koloni1.setYemekStogu(koloni1.getYemekStogu() + yemekAzalmasi);

	                     koloni2.setPopulasyon(koloni2.getPopulasyon() - azalanPopulasyon);
	                karsilastirmaSet.add(koloni1.getRandomSembol() + "-" + koloni2.getRandomSembol());
	            } else if (savasGucu1 < savasGucu2) {
	            	double oran = (double)fark / 1000.0;

	            	koloni2.setKazanma(koloni2.getKazanma()+1);
                	koloni1.setKaybetme(koloni1.getKaybetme()+1);
                	int azalanPopulasyon = (int)(koloni1.getPopulasyon() * oran);
                    int yemekAzalmasi = (int)(koloni1.getYemekStogu() * oran);
                    koloni1.setYemekStogu(koloni1.getYemekStogu() - yemekAzalmasi);
                    koloni2.setYemekStogu(koloni2.getYemekStogu() + yemekAzalmasi);
                    koloni1.setPopulasyon(koloni1.getPopulasyon() - azalanPopulasyon);

	                karsilastirmaSet.add(koloni2.getRandomSembol() + "-" + koloni1.getRandomSembol());

	            } else {
	            	if(koloni1.getPopulasyon()>koloni2.getPopulasyon())
	                System.out.println("Kolon " + sembol1 + " Kolon " + sembol2 + " karşısında savaşı kazandı!");
	            	else if(koloni2.getPopulasyon()>koloni1.getPopulasyon())
		                System.out.println("Kolon " + sembol2 + " Kolon " + sembol1 + " karşısında savaşı kazandı!");
	            	else {
	            		Random random = new Random();
	                    int sansliSayi = random.nextInt(2); 
	                    if(sansliSayi==1)
	    	                System.out.println("Kolon " + sembol1 + " Kolon " + sembol2 + " karşısında savaşı kazandı!");
	                    else 
			                System.out.println("Kolon " + sembol2 + " Kolon " + sembol1 + " karşısında savaşı kazandı!");

	            	}
	            		
	                karsilastirmaSet.add(koloni1.getRandomSembol() + "-" + koloni2.getRandomSembol());
	            }
	        }
	    }
	}
	}
}



