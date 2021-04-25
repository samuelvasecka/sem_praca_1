
import java.util.Scanner;

/**
 * Tato trieda umoznuje hracovi zadavat lode na pozicie, 
 * ktore si zadavanim pomocou Scannera vyberie.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Zapisovanie {
    private int pocetLodi;
    private Polia pole;    
    private Hraci hrac;

    /**
     * Konstruktor vytvori asociaciu s triedami Polia a Hraci, 
     * a atributu pocetLodi priradi hodnotu 10.
     */
    public Zapisovanie(Polia pole, Hraci hrac) {
        this.pocetLodi = 10;
        this.pole = pole;
        this.hrac = hrac;
    }

    /**
     * Metoda zadavanieLodeHrac umoznuje hracovi zadavat lode na poziciu,
     * ktoru chce, pricom najprv musi pomocou Scannera zadat smer lode
     * (bud vodorovny alebo zvysli) a nasledne musi zadat suradnice
     * stlpec a riadok. Metoda tiez testuje ci sa zadane lode v dvojrozmernom
     * poli s nazvom pole neprekryvaju alebo nie su hned vedla seba, a tiez 
     * kontroluje ci su zadane vstupy spravne (v ramci intervalu v ktorom 
     * mali byt zadane).
     */
    public void zadavanieLodeHrac() {
        Scanner keypad  = new Scanner (System.in);
        int pocetLodi1 = this.pocetLodi;

        int[] poleLodi = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        int poziciaPolaLodi = 0;

        int smer = 0;
        int velkost = 0;
        int stlpec = 0;
        int riadok = 0;

        while (pocetLodi1 > 8) {
            int kontrola = 0;

            while (kontrola == 0) {
                System.out.println("\f");
                this.pole.plochaHracia(0);
                System.out.println("");
                System.out.println("    Lode zadava hrac: " + this.hrac.getNickName());
                System.out.println("");
                System.out.println("    Zadavas lod velkosti: " + poleLodi[poziciaPolaLodi]);
                System.out.println("");
                System.out.println("    Mozes zadat este " + pocetLodi1 + " lodi"); 
                System.out.println("");
                System.out.println("    Zadajte smer lode: ");
                System.out.println("    0. vodorovne ");
                System.out.println("    1. zvislo ");
                velkost = poleLodi[poziciaPolaLodi];
                smer = keypad.nextInt();

                if ((smer > 1) || (smer < 0)) {
                    while (((smer > 1) || (smer < 0))) {
                        System.out.println("\f");
                        this.pole.plochaHracia(0);
                        System.out.println("");
                        System.out.println("    Lode zadava hrac: " + this.hrac.getNickName());
                        System.out.println("");
                        System.out.println("    ZADAL SI ZLY SMER. ZADAJ ZNOVU!");
                        System.out.println("");
                        System.out.println("    Zadavas lod velkosti: " + poleLodi[poziciaPolaLodi]);
                        System.out.println("");
                        System.out.println("    Mozes zadat este " + pocetLodi1 + " lodi");
                        System.out.println("");
                        System.out.println("    Zadajte smer lode: ");
                        System.out.println("    0. vodorovne ");
                        System.out.println("    1. zvislo ");
                        smer = keypad.nextInt();
                    }
                }

                System.out.println("\f");
                this.pole.plochaHracia(0);
                System.out.println("");
                System.out.println("    Lode zadava hrac: " + this.hrac.getNickName());
                System.out.println("");
                System.out.println("    Zadavas lod velkosti: " + poleLodi[poziciaPolaLodi]);
                System.out.println("    Zadaj suradnice (x,y) zaciatku lode: ");
                stlpec = keypad.nextInt();
                riadok = keypad.nextInt();                       

                if (smer == 0) {
                    if (( stlpec < 0) || (stlpec > (9 - velkost + 1)) || (riadok < 0) || (riadok > 9)) {
                        while (( stlpec < 0) || (stlpec > (9 - velkost + 1)) || (riadok < 0) || (riadok > 9)) {
                            System.out.println("\f");
                            this.pole.plochaHracia(0);
                            System.out.println("");
                            System.out.println("    Lode zadava hrac: " + this.hrac.getNickName());
                            System.out.println("");
                            System.out.println("    ZADAL SI ZLE SURADNICE. ZADAJ ZNOVU!");
                            System.out.println("");
                            System.out.println("    Zadavas lod velkosti: " + poleLodi[poziciaPolaLodi]);
                            System.out.println("    Zadaj suradnice (x,y) zaciatku lode: ");
                            stlpec = keypad.nextInt();
                            riadok = keypad.nextInt();

                        }
                    } 
                } else {
                    if (( stlpec < 0) || (stlpec > 9) || (riadok < 0) || (riadok > (9 - velkost + 1))) {
                        while (( stlpec < 0) || (stlpec > 9) || (riadok < 0) || (riadok > (9 - velkost + 1))) {
                            System.out.println("\f");
                            this.pole.plochaHracia(0);
                            System.out.println("");
                            System.out.println("    Lode zadava hrac: " + this.hrac.getNickName());
                            System.out.println("");
                            System.out.println("    ZADAL SI ZLE SURADNICE. ZADAJ ZNOVU!");
                            System.out.println("");
                            System.out.println("    Zadavas lod velkosti: " + poleLodi[poziciaPolaLodi]);
                            System.out.println("    Zadaj suradnice (x,y) zaciatku lode: ");
                            stlpec = keypad.nextInt();
                            riadok = keypad.nextInt();

                        }
                    } 
                }

                int sucet = 0;

                if (smer == 0) {
                    switch (velkost) {
                        case 1:
                            for (int j = -1; j < 2; j++) {
                                for (int i = -1; i < 2; i++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + j, stlpec + this.pole.getCislo() + i) > 1) {
                                        sucet += 1;
                                    } else {
                                        sucet += 0;
                                    }
    
                                    if (sucet > 0) {
                                        kontrola = 0;
                                    } else {
                                        kontrola = 1;
                                    }
                                }
                            }
                            break;

                        case 2:
                            for (int j = -1; j < 2; j++) {
                                for (int i = -1; i < 3; i++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + j, stlpec + this.pole.getCislo() + i) > 1) {
                                        sucet += 1;
                                    } else {
                                        sucet += 0;
                                    }
    
                                    if (sucet > 0) {
                                        kontrola = 0;
                                    } else {
                                        kontrola = 1;
                                    }
                                }
                            }
                            break;

                        case 3:
                            for (int j = -1; j < 2; j++) {
                                for (int i = -1; i < 4; i++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + j, stlpec + this.pole.getCislo() + i) > 1) {
                                        sucet += 1;
                                    } else {
                                        sucet += 0;
                                    }
    
                                    if (sucet > 0) {
                                        kontrola = 0;
                                    } else {
                                        kontrola = 1;
                                    }
                                }
                            }
                            break;

                        case 4:
                            for (int j = -1; j < 2; j++) {
                                for (int i = -1; i < 5; i++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + j, stlpec + this.pole.getCislo() + i) > 1) {
                                        sucet += 1;
                                    } else {
                                        sucet += 0;
                                    }
    
                                    if (sucet > 0) {
                                        kontrola = 0;
                                    } else {
                                        kontrola = 1;
                                    }
                                }
                            }
                            break;
                    }
                } else {
                    switch (velkost) {
                        case 1:
                            for (int j = -1; j < 2; j++) {
                                for (int i = -1; i < 2; i++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + j, stlpec + this.pole.getCislo() + i) > 1) {
                                        sucet += 1;
                                    } else {
                                        sucet += 0;
                                    }
    
                                    if (sucet > 0) {
                                        kontrola = 0;
                                    } else {
                                        kontrola = 1;
                                    }
                                }
                            }
                            break;

                        case 2:
                            for (int j = -1; j < 3; j++) {
                                for (int i = -1; i < 2; i++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + j, stlpec + this.pole.getCislo() + i) > 1) {
                                        sucet += 1;
                                    } else {
                                        sucet += 0;
                                    }
    
                                    if (sucet > 0) {
                                        kontrola = 0;
                                    } else {
                                        kontrola = 1;
                                    }
                                }
                            }
                            break;

                        case 3:
                            for (int j = -1; j < 4; j++) {
                                for (int i = -1; i < 2; i++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + j, stlpec + this.pole.getCislo() + i) > 1) {
                                        sucet += 1;
                                    } else {
                                        sucet += 0;
                                    }
    
                                    if (sucet > 0) {
                                        kontrola = 0;
                                    } else {
                                        kontrola = 1;
                                    }
                                }
                            }
                            break;

                        case 4:
                            for (int j = -1; j < 5; j++) {
                                for (int i = -1; i < 2; i++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + j, stlpec + this.pole.getCislo() + i) > 1) {
                                        sucet += 1;
                                    } else {
                                        sucet += 0;
                                    }
    
                                    if (sucet > 0) {
                                        kontrola = 0;
                                    } else {
                                        kontrola = 1;
                                    }
                                }
                            }
                            break;
                    }
                }
            }

            if (smer == 0) {
                for (int i = 0; i < velkost; i++) {
                    this.pole.setPlocha(riadok + this.pole.getCislo(), stlpec + i + this.pole.getCislo(), velkost);
                }
                pocetLodi1 -= 1;
            } else {
                for (int i = 0; i < velkost; i++) {
                    this.pole.setPlocha(riadok + i + this.pole.getCislo(), stlpec + this.pole.getCislo(), velkost);
                }
                pocetLodi1 -= 1; 
            }
            poziciaPolaLodi += 1;

            System.out.println("\f");
            this.pole.plochaHracia(0);
        }
    }
}
