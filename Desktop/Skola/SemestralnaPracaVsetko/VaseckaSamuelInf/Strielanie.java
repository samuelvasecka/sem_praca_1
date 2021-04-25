import java.util.Scanner;

/**
 * Tato trieda umoznuje hracovi strielat na konkretne pozicie
 * v dvojrozmernom poli s nazvom pole, a vyhodnocuje ci sa na 
 * tejto pozicii lod nachadza alebo nenachadza.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Strielanie {
    private Polia pole;
    private Kontrola kontrola;
    private Hraci hrac;
    
    /**
     * Konstruktor vytvori asciaciu s triedami Polia a Hraci 
     * a kompoziciu s triedou Kontrola.
     */
    public Strielanie(Polia pole, Hraci hrac) {
        this.pole = pole;
        this.kontrola = new Kontrola(pole);
        this.hrac = hrac;
    }

    /**
     * Metoda strielanieHrac umoznuje hracovi strielat an konkretne 
     * pozicie x, y, ktore zadava ako input pomocou Scannera. Tato
     * metoda nsaledne rozhodne ci je na tejto pozicii lod alebo ci tam
     * nie je, a ak sa tu lod nachadza, pouzije metodu s triedy Kontrola
     * aby zisila ci je dana lod znicena uplne.
     */
    public void strielanieHrac() {
        Scanner keypad = new Scanner(System.in);
        int kontrola1 = 0;

        while (kontrola1 == 0) {
            System.out.println("\f");
            this.pole.plochaHracia(1);

            if (this.kontrola.getLode1() != 0) {
                System.out.println("    Musis znicit este " + this.kontrola.getLode1() + " lode velkosti 1");
            } 

            if (this.kontrola.getLode2() != 0) {
                System.out.println("    Musis znicit este " + this.kontrola.getLode2() + " lode velkosti 2");
            }

            if (this.kontrola.getLode3() != 0) {
                System.out.println("    Musis znicit este " + this.kontrola.getLode2() + " lode velkosti 3");
            }

            if (this.kontrola.getLode4() != 0) {
                System.out.println("    Musis znicit este " + this.kontrola.getLode2() + " lode velkosti 4");
            }

            System.out.println("");
            System.out.println("    Na rade je hrac: " + this.hrac.getNickName());
            System.out.println("");
            System.out.println("    Zadaj suradnice (x,y) vystrelu: ");
            int stlpec = keypad.nextInt();
            int riadok = keypad.nextInt();

            if (( stlpec < 0) || (stlpec > 9) || (riadok < 0) || (riadok > 9) || (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo()) == -1) || (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo()) == -2)) {
                while (( stlpec < 0) || (stlpec > 9) || (riadok < 0) || (riadok > 9) || (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo()) == -1) || (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo()) == -2)) {
                    System.out.println("\f");
                    this.pole.plochaHracia(1);

                    if (this.kontrola.getLode1() != 0) {
                        System.out.println("    Musis znicit este " + this.kontrola.getLode1() + " lode velkosti 1");
                    } 

                    if (this.kontrola.getLode2() != 0) {
                        System.out.println("    Musis znicit este " + this.kontrola.getLode2() + " lode velkosti 2");
                    }

                    if (this.kontrola.getLode3() != 0) {
                        System.out.println("    Musis znicit este " + this.kontrola.getLode2() + " lode velkosti 3");
                    }

                    if (this.kontrola.getLode4() != 0) {
                        System.out.println("    Musis znicit este " + this.kontrola.getLode2() + " lode velkosti 4");
                    }

                    System.out.println("");
                    System.out.println("    ZADAL SI ZLE SURADNICE. ZADAJ ZNOVU!");
                    System.out.println("");
                    System.out.println("    Na rade je hrac: " + this.hrac.getNickName());
                    System.out.println("");
                    System.out.println("    Zadaj suradnice (x,y) vystrelu: ");
                    stlpec = keypad.nextInt();
                    riadok = keypad.nextInt();

                }
            }

            if (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo()) >= 1) {
                this.kontrola.kontrola(stlpec, riadok);
                this.pole.setPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo(), -1); 
                if (this.pole.kontrolaPlocha() == 0) {
                    kontrola1 = 0;
                } else {
                    kontrola1 = 1;
                }

            } else {
                this.pole.setPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo(), -2);  
                kontrola1 = 1; 
                this.pole.plochaHracia(1);
                System.out.println("    Zadaj 1. aby si si pozrel stav svojich lodiciek");
                int next = keypad.nextInt();

            }
        }
    }
}