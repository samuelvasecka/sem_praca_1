
/**
 * Tato trieda kontroluje po kazdom zasahu lode,
 * ci je dana lod znicena uplne. Najprv zisti o aku velkost
 * lode ide, a nasledne skontroluje policka, ktore sa nachadzaju
 * v dvojrozmenrom poli s nazvom pole, okolo miesta zasahu.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Kontrola {
    private Polia pole;
    private int lode1;
    private int lode2;
    private int lode3;
    private int lode4;
    /**
     * Konstruktor vytvori asociaciu s triedou Polia a atributom 
     * lode1, 2, 3, 4 priradi konkretne hodnoty.
     */
    public Kontrola(Polia pole) {        
        this.pole = pole;
        this.lode1 = 4;
        this.lode2 = 3;
        this.lode3 = 2;
        this.lode4 = 1;
    }

    /**
     * Metoda getLode1 vrati hodnotu atributu lode1.
     */
    public int getLode1 () {
        return this.lode1;
    }

    /**
     * Metoda getLode2 vrati hodnotu atributu lode2.
     */
    public int getLode2 () {
        return this.lode2;
    }

    /**
     * Metoda getLode3 vrati hodnotu atributu lode3.
     */
    public int getLode3 () {
        return this.lode3;
    }

    /**
     * Metoda getLode4 vrati hodnotu atributu lode4.
     */
    public int getLode4 () {
        return this.lode4;
    }

    /**
     * Metoda kontrola skontroluje ci je lod, ktora bola zasiahnuta,
     * uplne znicena a to tak zes kontroluje policka okolo zasahu so 
     * suradnicami zadanymi ako parametre stlpec a riadok,
     * v dvojrozmernom poli s nazvom polea a ak je lod znicena uplne
     * prepise hodnoty v danom poli tak, aby predstavovsli hodnoty 
     * prazdenho zasahu, z dovodu, ze dve lode nemozu stat hned vedla 
     * seba a preto by bolo zbytocne strielat na tieto pozicie.
     */
    public void kontrola(int stlpec, int riadok) {
        switch (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo())) {
            case 1:
                for (int y = -1; y < 2; y++) {
                    for (int x = -1; x < 2; x++) {
                        if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                            this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                        }
                    }
                }
                this.lode1--;
                break;

            case 2:
                int kontrola1 = 0;
                if (kontrola1 == 0) {
                    if ((this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1) || (this.pole.getPlocha(riadok + this.pole.getCislo() + 1, stlpec + this.pole.getCislo()) == -1)) {
                        if (this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1) {
                            for (int y = -2; y < 2; y++) {
                                for (int x = -1; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode2--;
                        } else {
                            for (int y = -1; y < 3; y++) {
                                for (int x = -1; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode2--;
                        }
                    } else {
                        kontrola1 = 1;
                    }
                }
    
                if (kontrola1 == 1) {
                    if ((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1) || (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 1) == -1)) {
                        if (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1) {
                            for (int y = -1; y < 2; y++) {
                                for (int x = -2; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode2--;
                        } else {
                            for (int y = -1; y < 2; y++) {
                                for (int x = -1; x < 3; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode2--;
                        }
                    }
                }
                break;

            case 3:
                int kontrola2 = 0;
                if (kontrola2 == 0) {
                    if ((this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() + 1, stlpec + this.pole.getCislo()) == -1)) {
                        for (int y = -2; y < 3; y++) {
                            for (int x = -1; x < 2; x++) {
                                if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                    this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                }
                            }
                        }
                        this.lode3--;
                    } else {
                        kontrola2 = 1;
                    }
                }
    
                if (kontrola2 == 1) {
                    if ((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 1) == -1)) {
                        for (int y = -1; y < 2; y++) {
                            for (int x = -2; x < 3; x++) {
                                if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                    this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                }
                            }
                        }
                        this.lode3--;
                    } else {
                        kontrola2 = 2;
                    }
                }
    
                if (kontrola2 == 2) {
                    if (((this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() - 2, stlpec + this.pole.getCislo()) == -1)) || ((this.pole.getPlocha(riadok + this.pole.getCislo() + 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() + 2, stlpec + this.pole.getCislo()) == -1))) {
                        if ((this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() - 2, stlpec + this.pole.getCislo()) == -1)) {
                            for (int y = -3; y < 2; y++) {
                                for (int x = -1; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode3--;
                        } else {
                            for (int y = -1; y < 4; y++) {
                                for (int x = -1; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode3--;
                        }
                    } else {
                        kontrola2 = 3;
                    }
                }
    
                if (kontrola2 == 3) {
                    if (((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 2) == -1)) || ((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 2) == -1))) {
                        if ((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 2) == -1)) {
                            for (int y = -1; y < 2; y++) {
                                for (int x = -3; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode3--;
                        } else {
                            for (int y = -1; y < 2; y++) {
                                for (int x = -1; x < 4; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode3--;
                        }
                    }
                }
                break;

            case 4:
                int kontrola3 = 0;
                if (kontrola3 == 0) {
                    if (((this.pole.getPlocha(riadok + this.pole.getCislo() - 2, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() + 1, stlpec + this.pole.getCislo()) == -1)) || ((this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() + 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() + 2, stlpec + this.pole.getCislo()) == -1))) {
                        if ((this.pole.getPlocha(riadok + this.pole.getCislo() - 2, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() + 1, stlpec + this.pole.getCislo()) == -1)) {
                            for (int y = -3; y < 3; y++) {
                                for (int x = -1; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode4--;
                        } else {
                            for (int y = -2; y < 4; y++) {
                                for (int x = -1; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode4--;
                        }
                    } else {
                        kontrola3 = 1;
                    }
                } 
    
                if (kontrola3 == 1) {
                    if (((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 2) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 1) == -1)) || ((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 2) == -1))) {
                        if ((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 2) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 1) == -1)) {
                            for (int y = -1; y < 2; y++) {
                                for (int x = -3; x < 3; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode4--;
                        } else {
                            for (int y = -1; y < 2; y++) {
                                for (int x = -2; x < 4; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode4--;
                        }
                    } else {
                        kontrola3 = 2;
                    }
                } 
    
                if (kontrola3 == 2) {
                    if (((this.pole.getPlocha(riadok + this.pole.getCislo() - 3, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() - 2, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1)) || ((this.pole.getPlocha(riadok + this.pole.getCislo() + 1, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() + 2, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() + 3, stlpec + this.pole.getCislo()) == -1))) {
                        if ((this.pole.getPlocha(riadok + this.pole.getCislo() - 3, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() - 2, stlpec + this.pole.getCislo()) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo() - 1, stlpec + this.pole.getCislo()) == -1)) {
                            for (int y = -4; y < 2; y++) {
                                for (int x = -1; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode4--;
                        } else {
                            for (int y = -1; y < 5; y++) {
                                for (int x = -1; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode4--;
                        }
                    } else {
                        kontrola3 = 3;
                    }
                }
    
                if (kontrola3 == 3) {
                    if (((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 3) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 2) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1)) || ((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 1) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 2) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() + 3) == -1))) {
                        if ((this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 3) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 2) == -1) && (this.pole.getPlocha(riadok + this.pole.getCislo(), stlpec + this.pole.getCislo() - 1) == -1)) {
                            for (int y = -1; y < 2; y++) {
                                for (int x = -4; x < 2; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode4--;
                        } else {
                            for (int y = -1; y < 2; y++) {
                                for (int x = -1; x < 5; x++) {
                                    if (this.pole.getPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x) == 0) {
                                        this.pole.setPlocha(riadok + this.pole.getCislo() + y, stlpec + this.pole.getCislo() + x, -2);
                                    }
                                }
                            }
                            this.lode4--;
                        }
                    }
                }
                break;
        } 
    }
}