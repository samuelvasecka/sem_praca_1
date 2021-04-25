import java.util.Scanner;
import java.io.IOException;

/**
 * Tato trieda umoznuje hracovi komunikovat so vsetkymi 
 * ostatnymi triedami, pricom tvori ich celok.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Aplikacia {

    /**
     * Metoda main spolupracuje so vsetkymi triedami, pricom ich 
     * postupne spusta a umoznuje vytvorit rad operacii, ktore davaju
     * ako celok zmysel.
     */
    public static void main (String[] args) throws IOException {
        Scanner keypad = new Scanner(System.in);

        System.out.println("\f");

        Uvod uvod = new Uvod();
        uvod.uvod();
        int next0 = keypad.nextInt();

        System.out.println("\f");

        System.out.println("    Vitaj v hre Battle ships.");
        System.out.println("");
        System.out.println("    Vyberte si co chcete robit: ");
        System.out.println("    1. Play");
        System.out.println("    2. Credits");
        System.out.println("    3. Ranks");
        System.out.println("    4. End");

        int vyber = keypad.nextInt();
        do {
            switch (vyber) {
                case 3:
                    System.out.println("\f");
                    RankHraca hodnosti = new RankHraca();
                    for (int i = 20; i > 0; i--) {
                        if (i > 4) {
                            System.out.println(String.format("%2d. %27s -> %29s %s %s. ", (21 - i), hodnosti.rankHraca(i), "Na túto hodnost potrebujes", i, "nezasiahnutych pozicii lode"));
                        } 
    
                        if ((i < 5) && (i > 1)) {
                            System.out.println(String.format("%2d. %27s -> %29s %s %s. ", (21 - i), hodnosti.rankHraca(i), "Na túto hodnost potrebujes", i, "nezasiahnute pozicie lode"));
                        }
    
                        if (i == 1) {
                            System.out.println(String.format("%2d. %27s -> %29s %s %s. ", (21 - i), hodnosti.rankHraca(i), "Na túto hodnost potrebujes", i, "nezasiahnutu poziciu lode"));
                        }
                    }
                    System.out.println("");
                    System.out.println("    Vyberte si co chcete robit: ");
                    System.out.println("    1. Play");
                    System.out.println("    2. Credits");
                    System.out.println("    3. Ranks");
                    System.out.println("    4. End");
    
                    vyber = keypad.nextInt();
                    break;

                case 2:
                    System.out.println("\f");
                    System.out.println("    Vytvoril Samuel Vašečka (c) ");
                    System.out.println("    2018");
                    System.out.println("    Verzia 1.0");
                    System.out.println("");
                    System.out.println("    Pri testovani nebolo ublizene ziadnym zvieratam");
                    System.out.println("    Inspirovane Android aplikaciou Sea Battle 2");
                    System.out.println("");
                    System.out.println("    Ak tuto hru prezentuje niekto iny ako Samuel Vašečka,");
                    System.out.println("    pravdepodobne ju ukradol");
                    System.out.println("");
                    System.out.println("    Vyberte si co chcete robit: ");
                    System.out.println("    1. Play");
                    System.out.println("    2. Credits");
                    System.out.println("    3. Ranks");
                    System.out.println("    4. End");
    
                    vyber = keypad.nextInt();
                    break;

                case 4:
                    System.out.println("    Koniec");
                    break;

                case 1:
                    Tutorial tutorial = new Tutorial();
                    tutorial.tutorial();
                    System.out.println("\f");
    
                    PosledneId posledneId = new PosledneId();
    
                    System.out.println("    Zadaj svoj meno: (Hrac 1) ");
                    String meno1 = keypad.next();
                    Hraci hrac1 = new Hraci(meno1, posledneId);
                    System.out.println(hrac1.toString());
                    System.out.println("");
                    System.out.println("    Zadaj svoj meno: (Hrac 2) ");
                    String meno2 = keypad.next();
                    Hraci hrac2 = new Hraci(meno2, posledneId);
                    System.out.println(hrac2.toString());
                    System.out.println("");
                    System.out.println("    Zadaj 1 ak chces zacat hru: ");
                    int next = keypad.nextInt();
    
                    Polia pole1 = new Polia();
                    Polia pole2 = new Polia();
                    Strielanie strielanie1 = new Strielanie(pole1, hrac2);
                    Strielanie strielanie2 = new Strielanie(pole2, hrac1);
                    Zapisovanie zapisovanie1 = new Zapisovanie(pole1, hrac1);
                    Zapisovanie zapisovanie2 = new Zapisovanie(pole2, hrac2);
    
                    zapisovanie1.zadavanieLodeHrac();
    
                    System.out.println("    Stlacte 1. ak moze ist druhy hrac: ");
                    int next1 = keypad.nextInt();
    
                    if (next1 == 1) {
                        System.out.println("\f");
                    }
    
                    zapisovanie2.zadavanieLodeHrac();
    
                    System.out.println("    Stlacte 1. ak moze hra zacat: ");
                    int next2 = keypad.nextInt();
    
                    while ((pole1.kontrolaPlocha() == 0) && (pole2.kontrolaPlocha() == 0)) {
                        strielanie2.strielanieHrac();
                        pole2.kontrolaPlocha();
                        pole1.plochaHracia(0);
                        System.out.println("    Zadaj 1. ak moze ist druhy hrac");
                        int next3 = keypad.nextInt();
                        if (pole2.kontrolaPlocha() == 0) {
                            strielanie1.strielanieHrac();
                            pole1.kontrolaPlocha();
                            pole2.plochaHracia(0);
                            System.out.println("    Zadaj 1. ak moze ist druhy hrac");
                            int next4 = keypad.nextInt();
                        }
                    }
    
                    TopSkore skore = new TopSkore();
                    Top3Skore skore1 = new Top3Skore();
                    RankHraca rank = new RankHraca();
    
                    if ((pole1.kontrolaPlocha() == 1) || (pole2.kontrolaPlocha() == 1)) {
                        System.out.println("\f");
                        if (pole2.kontrolaPlocha() == 1) {
                            System.out.println("    Vyhral hrac: " + hrac1.getNickName());
                            System.out.println("    Ziskal si hodnost: " + rank.rankHraca(pole1.kontrolaPlochaSucet()));
                            System.out.println("");
                            skore1.vyberZoSuboru1(pole1.kontrolaPlochaSucet(), hrac1);
                            System.out.println("");
                            System.out.println(skore.vyberZoSuboru1(pole1.kontrolaPlochaSucet(), hrac1));
    
                            System.out.println("");
                            System.out.println("    Zadaj 1. ak chces pokracovat dalej");
                            int next5 = keypad.nextInt();
    
                            System.out.println("\f");
                            uvod.zaver(hrac1);
                            System.out.println("");
                            System.out.println("    Zadaj 1. ak chces pokracovat dalej");
                            int next6 = keypad.nextInt();
                        } else {
                            System.out.println("    Vyhral hrac: " + hrac2.getNickName());
                            System.out.println("    Ziskal si hodnost: " + rank.rankHraca(pole2.kontrolaPlochaSucet()));
                            System.out.println("");
                            skore1.vyberZoSuboru1(pole2.kontrolaPlochaSucet(), hrac2);
                            System.out.println("");
                            System.out.println(skore.vyberZoSuboru1(pole2.kontrolaPlochaSucet(), hrac2));
    
                            System.out.println("");
                            System.out.println("    Zadaj 1. ak chces pokracovat dalej");
                            int next5 = keypad.nextInt();
    
                            System.out.println("\f");
                            uvod.zaver(hrac2);
                            System.out.println("");
                            System.out.println("    Zadaj 1. ak chces pokracovat dalej");
                            int next6 = keypad.nextInt();
                        }
                    }
    
                    System.out.println("\f");
                    System.out.println("");
                    System.out.println("    Vyberte si co chcete robit: ");
                    System.out.println("    1. New Game");
                    System.out.println("    2. Credits");
                    System.out.println("    3. Ranks");
                    System.out.println("    4. End");
                    vyber = keypad.nextInt();
                    break;

                default:
                    System.out.println("\f");
                    System.out.println("    ZADAL SI ZLE!");
                    System.out.println("");
                    System.out.println("    Vyberte si co chcete robit: ");
                    System.out.println("    1. Play");
                    System.out.println("    2. Credits");
                    System.out.println("    3. Ranks");
                    System.out.println("    4. End");
                    vyber = keypad.nextInt();
                    break;
            }
        } while (vyber != 4);
    }
}