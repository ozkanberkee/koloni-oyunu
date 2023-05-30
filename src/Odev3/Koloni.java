package Odev3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Koloni {
    private int populasyon;
    private int yemekStogu;
    private char sembol;
    private int kazanma=0;
    private int kaybetme=0;
	private int savasGucu;
	public String kazanmaString="--";
	public String populasyonString="--";
	public String kaybetmeString="--";
	public String YemekStoguString="--";

	public boolean isAlive() {
        return populasyon > 0 && yemekStogu > 0;
    }
    public int getYemekStogu() {
		return yemekStogu;
	}
	public void setYemekStogu(int yemekStogu) {
		this.yemekStogu = yemekStogu;
	}
	public Koloni(int populasyon) {
        this.populasyon = populasyon;
        this.yemekStogu=populasyon*populasyon;
        this.sembol=getRandomSembol();
        
    }
    
    
    public int getSavasGucu() {
        return savasGucu;
    }
    
   
    public int getPopulasyon() {
        return populasyon;
    }
    public int getKazanma() {
        return kazanma;
    }
    public int getKaybetme() {
        return kaybetme;
    }
    public void setSavasGucu(int savasGucu) {
        this.savasGucu = savasGucu;
    }
    public void setKazanma(int kazanma) {
        this.kazanma = kazanma;
    }
    public void setKaybetme(int kaybetme) {
        this.kaybetme = kaybetme;
    }
    public void setPopulasyon(int populasyon) {
        this.populasyon = populasyon;
    }

   
    public void koloni_Yazdir() {
        String format = "%-10s%-15s%-15s%-10s%-10s%n";
        System.out.format(format, "Koloni", "Populasyon", "Yemek Stogu", "Kazanma", "Kaybetme");

        // Kontrol ve ilgili değerlerin "--" olarak gösterilmesi
        if (populasyon <= 2|| yemekStogu <= 2) {
            populasyonString = "--";
            YemekStoguString = "--";
            kazanmaString = "--";
            kaybetmeString = "--";
        } else {
            populasyonString = String.valueOf(populasyon);
            YemekStoguString = String.valueOf(yemekStogu);
            kazanmaString = String.valueOf(kazanma);
            kaybetmeString = String.valueOf(kaybetme);
        }

        System.out.format(format, sembol, populasyonString, YemekStoguString, kazanmaString, kaybetmeString);
    }

    

    static char getRandomSembol() {
        List<Character> letters = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            letters.add(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            letters.add(c);
        }
        Collections.shuffle(letters);
        return letters.get(0);
    }
   
}