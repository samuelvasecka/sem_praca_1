
/**
 * Tato trieda vytvara dvojrozmerne polia, do ktorych
 * sa zaznacuju lode a strely, a umoznuje s nimi 
 * pouzivatelovi pracovat.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Polia {
    private static final int VELKOST_POLA = 16;
    private static final int CISLO = ((Polia.VELKOST_POLA - 10) / 2);
    private int[][] pole;
    
    private String[][] poleHracie;
    /**
     * Konstruktor vytvori dve dvojrozmerne polia
     * s konkretnou velkostou.
     */
    public Polia() {
        this.pole = new int[this.VELKOST_POLA][this.VELKOST_POLA];
        
        this.poleHracie = new String[this.VELKOST_POLA][this.VELKOST_POLA];
    }
    
    /**
     * Metoda getCislo vrati hodnotu atributu CISLO.
     */
    public int getCislo () {
        return this.CISLO;
    }

    /**
     * Metoda plocha vykresli dvojrozmerne pole 
     * s nazvom pole do terminalu.
     */
    public void plocha() {

        System.out.println("\f");

        for (int riadky = 0; riadky < this.VELKOST_POLA; riadky++) {
            for (int stlpce = 0; stlpce < this.VELKOST_POLA; stlpce++) {
                if (stlpce == this.VELKOST_POLA - 1) {
                    System.out.print(this.pole[riadky][stlpce] + " " + "\n");
                } else {
                    System.out.print(this.pole[riadky][stlpce] + "  ");
                }
            }
        }
    }

    /**
     * Metoda kontrolaPlocha zrata kolkokrat sa v dvojrozmernom poli
     * s nazvom pole, nachadza hodnota rovnajuca sa -1 (znicena cast 
     * lode)a porovna vysledok s cislom 20 (Vsetky lode maju dokopy 
     * 20 casti), a vrati hodnotu 1 ak su uz vsetky lode znicene, 
     * a naopak 0, ak este nie.
     */
    public int kontrolaPlocha() {
        int kontrola = 0;
        int sucet = 7;
        for (int riadky = 0; riadky < this.VELKOST_POLA; riadky++) {
            for (int stlpce = 0; stlpce < this.VELKOST_POLA; stlpce++) {
                if (this.pole[riadky][stlpce] == -1) {
                    kontrola += 1;
                }
            }
        }

        if (kontrola == sucet) {
            return 1;
        } else {
            return 0;
        }
    } 
    
    /**
     * Metoda kontrolaPlochaSucet funguje rovnako ako metoda 
     * kontrolaPlocha, ale vracia pocet policok v dvojrozmernom 
     * poli s nazvom pole, ktorych hodnota je vacsia ako 1 (nezostrelene
     * casti lode).
     */
    public int kontrolaPlochaSucet() {
        int sucet = 0;
        
        for (int riadky = 0; riadky < this.VELKOST_POLA; riadky++) {
            for (int stlpce = 0; stlpce < this.VELKOST_POLA; stlpce++) {
                if (this.pole[riadky][stlpce] > 1) {
                    sucet += 1;
                }
            }
        }

        return sucet;
    } 
    
    /**
     * Metoda getPlocha vrati konkretnu hodnotu z dvojrozmerneho pola
     * s nazvom pole na pozicii y (riadok) a x (stlpec).
     */
    public int getPlocha(int y, int x) {
        return this.pole[y][x];
    }

    /**
     * Metoda setPlocha zmeni hodnotu dvojrozmerneho pola
     * s nazvom pole na pozicii y (riadok) a x (stlpec), za hodnotu z.
     */
    public void setPlocha(int y, int x, int z) {
        this.pole[y][x] = z;
    }    

    /**
     * Metoda plochaHracia vykresli do terminalu dvojrozmerne pole
     * s nazvom poleHracie, pricom parameter zadavanie ovplivnuje,
     * ake znaky budu na polickach tohoto pola.
     */
    public void plochaHracia(int zadavanie) {

        System.out.println("\f");

        for (int riadky = 0; riadky < this.VELKOST_POLA; riadky++) {
            for (int stlpce = 0; stlpce < this.VELKOST_POLA; stlpce++) {
                if (zadavanie == 0) {
                    if (this.pole[riadky][stlpce] >= 1) {
                        this.poleHracie[riadky][stlpce] = "1";
                    } else {
                        this.poleHracie[riadky][stlpce] = "~";
                    }
                    
                    if (this.pole[riadky][stlpce] == -1) {
                        this.poleHracie[riadky][stlpce] = "X";
                    }
                    
                    if (this.pole[riadky][stlpce] == -2) {
                        this.poleHracie[riadky][stlpce] = "0";
                    }
                    
                } else {
                    switch(this.pole[riadky][stlpce]) {
                        case 0:
                            this.poleHracie[riadky][stlpce] = "~";
                            break;

                        case 1:
                            this.poleHracie[riadky][stlpce] = "~";
                            break;

                        case 2:
                            this.poleHracie[riadky][stlpce] = "~";
                            break;

                        case 3:
                            this.poleHracie[riadky][stlpce] = "~";
                            break;

                        case 4:
                            this.poleHracie[riadky][stlpce] = "~";
                            break;

                        case -1:
                            this.poleHracie[riadky][stlpce] = "X";
                            break;

                        case -2:
                            this.poleHracie[riadky][stlpce] = "0";
                            break;

                    }
                }

                if (riadky == 1) {
                    for (int i = 3; i < this.VELKOST_POLA - 3; i++) {
                        this.poleHracie[riadky][i] = "" + (i - 3);
                    }
                } 
                
                if (riadky == 0) {
                    for (int i = 0; i < this.VELKOST_POLA - 3; i++) {
                        this.poleHracie[riadky][i] = "";
                    }
                }

                for (int j = 2; j < 3; j++) {
                    if (riadky == j) {
                        for (int i = 0; i < this.VELKOST_POLA; i++) {
                            this.poleHracie[riadky][i] = "";
                        }
                    }
                }

                if (stlpce == 1) {
                    for (int i = 3; i < this.VELKOST_POLA - 3; i++) {
                        this.poleHracie[i][stlpce] = "" + (i - 3);
                    }
                }
                
                if (stlpce == 0) {
                    for (int i = 0; i < this.VELKOST_POLA - 3; i++) {
                        this.poleHracie[riadky][i] = "";
                    }
                }

                for (int j = 2; j < 3; j++) {
                    if (stlpce == j) {
                        for (int i = 0; i < this.VELKOST_POLA; i++) {
                            this.poleHracie[i][stlpce] = "";
                        }
                    }
                }

                for (int j = 13; j < 16; j++) {
                    if (stlpce == j) {
                        for (int i = 0; i < this.VELKOST_POLA; i++) {
                            this.poleHracie[i][stlpce] = "";
                        }
                    }
                }

                for (int j = 13; j < 16; j++) {
                    if (riadky == j) {
                        for (int i = 0; i < this.VELKOST_POLA; i++) {
                            this.poleHracie[riadky][i] = "";
                        }
                    }
                }
                
                if (riadky == 14) {
                    for (int i = 3; i < this.VELKOST_POLA - 3; i++) {
                        this.poleHracie[riadky][i] = "" + (i - 3);
                    }
                }
                
                if (stlpce == 14) {
                    for (int i = 3; i < this.VELKOST_POLA - 3; i++) {
                        this.poleHracie[i][stlpce] = "" + (i - 3);
                    }
                }

                this.poleHracie[0][0] = " ";
                this.poleHracie[1][1] = " ";

                if (stlpce == this.VELKOST_POLA - 1) {
                    System.out.print(this.poleHracie[riadky][stlpce] + " " + "\n");
                } else {
                    System.out.print(this.poleHracie[riadky][stlpce] + "  ");
                }
            }
        }
    }
}