
/**
 * Tato trieda vytvara tabulku v ktorej sa nachadzaju udaje
 * o troch najlepsich hracoch a udaje aktualneho hraca.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Tabulka {

    /**
     * Metoda tabulka do terminalu vypise, tabulku, ktora
     * obsahuje identifikacne cislo a vysledok prvych troch hracov
     * a tiez meno, identifikacne cislo a vysledok aktualneho hraca.
     */
    public void tabulka(int[] topSkore1, Hraci hrac, int cislo) {
        int[] topSkore = topSkore1;
        System.out.println(String.format("%11s %11s %11s", "poradie", "cislo", "body" ));
        for (int i = 0; i < 9; i++) {
            if ((i - 2) % 3 == 0) {
                System.out.println(String.format("%11s", topSkore[i]));
            } else {
                System.out.print(String.format("%11s", topSkore[i]));
            }
        }
        System.out.println("");
        System.out.println(String.format("%11s%11s%11s", hrac.getNickName(), hrac.getId(), cislo ));
    }
}
