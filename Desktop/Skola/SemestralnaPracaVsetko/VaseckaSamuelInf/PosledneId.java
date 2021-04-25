import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

/**
 * Tato trieda umoznuje pracovat s textovym suborom, ktory
 * uchovava udaje o identifikacnom cisle posledneho hraca.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class PosledneId {

    /**
     * Metoda vlozDoSuboru1 zapise do suboru konkretne cislo
     * zadane parametrom cislo.
     */
    public static void vlozDoSuboru1(int cislo) throws IOException {
        File subor = new File("PosledneId");
        PrintWriter writer = new PrintWriter(subor);

        writer.print(cislo);
        writer.close();
    }

    /**
     * Metoda vlozDoSuboru zapise do suboru cislo 99 v pripade,
     * ze je subor prazdny.
     */
    public static void vlozDoSuboru() throws IOException {
        File subor = new File("PosledneId");
        PrintWriter writer = new PrintWriter(subor);

        writer.print(99);
        writer.close();
    }

    /**
     * Metoda vyberZoSuboru precita subor a vrati hodnotu, ktoru v sebe 
     * subor mal. Tiez na zaciatku, ak je subor prazdny spusti 
     * metodu vlozDoSuboru, inak spusti metodu vyberZoSuboru1, ktorej
     * vlozi ako parameter cislo precitane zo suboru + 1.
     */
    public static int vyberZoSuboru() throws IOException {
        File subor = new File("PosledneId");
        if (subor.length() == 0) {
            PosledneId.vlozDoSuboru();   
        }

        Scanner reader = new Scanner(subor);

        int posledneId = reader.nextInt();
        
        PosledneId.vlozDoSuboru1(posledneId + 1);
        reader.close();
        return posledneId + 1;

    }
}
