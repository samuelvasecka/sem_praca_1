
/**
 * Tato trieda priraduje ku vysledku hraca rank,
 * aky sa mu podarilo dosiahnut.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class RankHraca {

    /**
     * Metoda rankHraca vrati po vyhodnoteni zadaneho parametru cislo,
     * ktory predstavuje vysledok hraca, rank ktory hrac dosiahol.
     */
    public Rank rankHraca(int cislo) {
        Rank[] pole = {Rank.KID, Rank.CIVILIAN, Rank.TRAINING_PRIVATE, Rank.PRIVATE_FIRST_CLASS, Rank.SPECIALIST, Rank.CORPORAL, Rank.SERGEANT, Rank.STAFF_SERGEANT, Rank.FIRST_CLASS_SERGEANT, Rank.MASTER_SERGEANT, Rank.FIRST_SERGEANT, Rank.SERGEANT_MAJOR, Rank.COMMAND_SERGEANT_MAJOR, Rank.SERGEANT_MAJOR_OF_THE_ARMY, Rank.MAJOR_ADMIRAL, Rank.LIEUTENANT_ADMIRAL, Rank.ADMIRAL, Rank.ADMIRAL_OF_THE_ARMY, Rank.LEGENDARY_ADMIRAL, Rank.CHUCK_NORRIS};
        switch (cislo) {
            case 1:
                return pole[cislo - 1];

            case 2:
                return pole[cislo - 1];

            case 3:
                return pole[cislo - 1];

            case 4:
                return pole[cislo - 1];

            case 5:
                return pole[cislo - 1];

            case 6:
                return pole[cislo - 1];

            case 7:
                return pole[cislo - 1];

            case 8:
                return pole[cislo - 1];

            case 9:
                return pole[cislo - 1];

            case 10:
                return pole[cislo - 1];

            case 11:
                return pole[cislo - 1];

            case 12:
                return pole[cislo - 1];

            case 13:
                return pole[cislo - 1];

            case 14:
                return pole[cislo - 1];

            case 15:
                return pole[cislo - 1];

            case 16:
                return pole[cislo - 1];

            case 17:
                return pole[cislo - 1];

            case 18:
                return pole[cislo - 1];

            case 19:
                return pole[cislo - 1];

            case 20:
                return pole[cislo - 1];

            default: 
                return pole[0];
        }
    }
}
