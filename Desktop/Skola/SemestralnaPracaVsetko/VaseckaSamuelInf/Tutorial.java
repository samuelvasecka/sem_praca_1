import java.util.Scanner;

/**
 * Tato trieda umoznuje zobrazovat v terminali tutorial.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Tutorial { 

    /**
     * Metoda tutorial po zadani vstupu pomocou Scannera (0,1), bud 
     * vypise tutorial do terminalu, alebo ho naopak nevypise.
     */
    public void tutorial() {
        Scanner keypad = new Scanner(System.in);

        System.out.println("\f");
        System.out.println("    Ak chces spustit tutorial, zadaj 1, ak nie, zadaj 0 ");
        int vyber = keypad.nextInt();

        if ((vyber < 0) || (vyber > 1)) {
            while ((vyber < 0) || (vyber > 1)) {
                System.out.println("    ZADAL SI ZLE, ZADAJ ZNOVU (0,1)");
                vyber = keypad.nextInt();
            }
        }

        if (vyber == 1) {
            System.out.println("\f");
            System.out.println("");
            System.out.println("    Hra zacina rozmiestnovanim lodi na hracej ploche.");
            System.out.println("    Najpr lode zadava hrac 1, potom hrac 2.");
            System.out.println("    Lode sa do hracej plochy zadavaju nasledovne:");
            System.out.println("");
            System.out.println("        1. Najprv si treba zvolit smer akym bude lod polozena.");
            System.out.println("           Ak zadas nulu, lod bude umiestnena vodorovne");
            System.out.println("           a ak zadas jednotku, lod bude umiestnena zvyslo.");
            System.out.println("           (NEZABUDNI si precitat akej velkosti zadavana lod je, ");
            System.out.println("           aby si si vedel predstavit kde sa potom bude nachadat.");
            System.out.println("");
            System.out.println("        2. Nasledne zadavas poziciu kde bude lod zacinat.");
            System.out.println("           Najprv suradnicu stlpceka (x) a potom suradnicu riadku (y).");
            System.out.println("           To znamena ze ak si zadal vodorovny/zvysli smer, tak lod bude ");
            System.out.println("           zacinat na policku x,y a pokracovat bude smerom doprava/dole.");
            System.out.println("");
            System.out.println("        3. Nezabudni ze lode sa nemozu prekryvat, ani lezat vedla seba.");
            System.out.println("           Musi medzi nimi byt medzera aspon jedno policko");
            System.out.println("");
            System.out.println("    Tento postup opakujes dokym, nezadas vsetky lode.");
            System.out.println("    Potom nasleduje hrac 2, ktory postup opakuje.");
            System.out.println("");
            System.out.println("    Zadaj 1 ak si prve kroky pochopil a chces pokracovat dalej.");
            int next1 = keypad.nextInt();
            System.out.println("\f");
            System.out.println("");
            System.out.println("    Potom ako obidvaja zadate vsetky svoje Lode, nasleduje");
            System.out.println("    cast strelby. Prvy striela hrac 1.");
            System.out.println("    Na strelbu musis zadat suradnice stlpcu a riadka (x,y),");
            System.out.println("    kde chces vystrelit. Ak si zasiahol protivnikovu lod, na ");
            System.out.println("    obrazovke sa ti na mieste zasahu objavi X a tvoj tah dalej pokracuje,");
            System.out.println("    ak si lod nezasiahol, zobrazi sa nula a tvoj tah konci.");
            System.out.println("");
            System.out.println("    Ked tvoj tah skonci, na obrazovke sa ti zobrazi stav tvojich ");
            System.out.println("    vlastnych lodi, aby si vedel ako na tom si v porovnani s protivnikom.");
            System.out.println("");
            System.out.println("    Ak protivnikovi znicis celu lod (zasiahnes vsetky jej casti),");
            System.out.println("    obkolesi sa nulami, kvoli tomu, ze lode nemozu byt hned vedla seba,");
            System.out.println("    a preto na tieto miesta uz nemusis strielat.");
            System.out.println("");
            System.out.println("    Strelba sa opakuje az do kym jeden z hracou nepride o vsetky lode,");
            System.out.println("    potom sa hra konci a objavia sa statistiky hraca, ktory vyhral.");
            System.out.println("");
            System.out.println("    Zadaj 1 ak si vsetko pochopil a chces zacat hrat hru.");
            int next2 = keypad.nextInt();
        }

        System.out.println("");
    }
}
