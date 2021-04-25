import java.io.IOException;

/**
 * Tato trieda umoznuje vytvorit profil hraca, ktory sa sklada 
 * z mena, ktore si sam zada a z identifikacneho cisla, ktore je
 * automaticky pridelene.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Hraci {
    private static int posledneId = 100;

    private int id;
    private String nickName;
    private int cislo;

    /**
     * Konstruktor vytvori asociaciu s triedou PosledneId
     * atributu cislo priradi hodnotu, ktoru ziska precitanim
     * suboru, a ktora predstavuje jeho identifikacne cislo. Nasledne sa
     * aj atribut triedy zmeni na rovnaku hodnotu a nakoniec aj atribut 
     * id nadobudne tuto hodnotu. Konstruktor tiez atributu nickName
     * priradi parameter nickNAme.
     */
    public Hraci(String nickName, PosledneId cisloId) throws IOException {
        this.cislo = cisloId.vyberZoSuboru();

        this.posledneId = this.cislo; 
        this.id = this.posledneId;

        this.nickName = nickName; 
    }

    /**
     * Metoda getNickName vrati hodnotu atributu nickName.
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * Metoda getId vrati hodnotu atributu id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Metoda toString vrati pripraveny retazec.
     */
    public String toString() {
        return "    Hrac: " + this.getNickName() + " " + this.getId();
    }

    /**
     * Metoda getTabulka vrati pole Stringov, ktore predstavuje 
     * udaje o hracovi: meno, identifikacne cislo a vysledok, 
     * ktroy v hre dosiahol.
     */
    public String[] getTabulka(int cislo) {
        String[] vysledok = {this.getNickName(), "" + this.getId(), "" + cislo};
        return vysledok;
    }
}