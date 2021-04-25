import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

/**
 * Tato trieda umoznuje pracovat s textovym suborom, v ktorom
 * su zaznamenane vysledky a identifikacne cisla prvych troch hracov,
 * ktory vyhrali hru.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Top3Skore {

    /**
     * Metoda vlozDoSuboru zapise do suboru predvolene hodnoty,
     * v pripade, ze je subor prazdny.
     */
    public static void vlozDoSuboru() throws IOException {
        File subor = new File("Top3Skore");
        PrintWriter writer = new PrintWriter(subor);

        writer.print(1 + " ");
        writer.print(0 + " ");
        writer.println(0);
        writer.print(2 + " ");
        writer.print(0 + " ");
        writer.println(0);
        writer.print(3 + " ");
        writer.print(0 + " ");
        writer.print(0);

        writer.close();
    }

    /**
     * Metoda vlozDoSuboru1 zapise do suboru hodnoty, ktore ziska z parametru,
     * ktory predstavuje pole typu int. Tieto hodnoty predstavuju, 
     * identifikacne cislo hraca a jeho vysledok v hre.
     */
    public static void vlozDoSuboru1(int[] topSkore) throws IOException {
        File subor = new File("Top3Skore");        
        PrintWriter writer = new PrintWriter(subor);
        int[] pole = topSkore;

        for (int i = 0; i < 9; i++) {
            if (((i - 2) % 3 == 0) && ((i - 2) / 3 < 2)) {
                writer.println(pole[i] + " ");
            } else {
                writer.print(pole[i] + " ");
            }
        }

        writer.close();
    }
    
    /**
     * Metoda vyberZoSuboru1 na zaciatku, ak je subor prazdny spusti
     * metodu vlozDoSuboru a vrati hodnoty precitane v subore, 
     * a okrem toho ak je aktulny hrac lepsi ako hraci na prvych 
     * troch poziciach, pozmeni udaje a spusti metodu vlozDoSuboru1. 
     */
    public static int[] vyberZoSuboru1(int cislo, Hraci hrac1) throws IOException {
        File subor = new File("Top3Skore");

        if (subor.length() == 0) { 
            Top3Skore.vlozDoSuboru();   
        }       

        Scanner reader = new Scanner(subor);
        int[] topSkore = new int[9];

        for (int i = 0; i < 9; i++) {
            int cislica = reader.nextInt();
            topSkore[i] = cislica;
        }

        Hraci hrac = hrac1;

        int kontrola = 0;
        if (topSkore[2] <= cislo) {
            for (int i = 8; i > 2; i--) {
                if (i % 3 != 0) {
                    topSkore[i] = topSkore[i - 3];
                }
            }

            topSkore[1] = hrac.getId();
            topSkore[2] = cislo;
            kontrola = 1;
        }

        if (kontrola == 0) {
            if (topSkore[5] <= cislo) {
                for (int i = 8; i > 5; i--) {
                    if (i % 3 != 0) {
                        topSkore[i] = topSkore[i - 3];
                    }
                }

                topSkore[4] = hrac.getId();
                topSkore[5] = cislo;
                kontrola = 1;
            }
        }

        if (kontrola == 0) {
            if (topSkore[8] <= cislo) {                
                topSkore[7] = hrac.getId();
                topSkore[8] = cislo;
            }
        }

        Tabulka tabulka = new Tabulka();
        tabulka.tabulka(topSkore, hrac, cislo);

        Top3Skore.vlozDoSuboru1(topSkore);
        reader.close();
        return topSkore;
    }
}
