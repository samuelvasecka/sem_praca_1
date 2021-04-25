
/**
 * Tato trieda umoznuje vypisat do terminalu uvod a zaver hry.
 * 
 * @author (Vasecka) 
 * @version (1.0 2018)
 */
public class Uvod {  

    /**
     * Metoda uvod vypise do terminalu predpripravene retazce.
     */
    public void uvod() {
        System.out.println("\f");
        System.out.println("");
        System.out.println("    BBBB      A   TTTTTTT TTTTTTT L     EEEEE ");
        System.out.println("    B   B    A A     T       T    L     E     ");
        System.out.println("    BBBB    A   A    T       T    L     EEEEE ");
        System.out.println("    B   B  AAAAAAA   T       T    L     E     ");
        System.out.println("    BBBB  A       A  T       T    LLLLL EEEEE ");
        System.out.println("");
        System.out.println("                     __.#-+.__                 ");
        System.out.println("                 -==|__.---.__|==-             ");
        System.out.println("                    __V|   |V__                ");
        System.out.println("                --==|_ .---. _|==--            ");
        System.out.println("                    _A       A_                ");
        System.out.println("              V __'{     A     }'__ V         ");
        System.out.println("             _'{ ! o     O     o ! }'_         ");
        System.out.println("       ====={            V            }=====   ");
        System.out.println("     _________________________________________ ");
        System.out.println("     | ,          .-' V  .  V '-.          , | ");
        System.out.println("     |  ---_____-' +   V ! V   + '-_____---  | ");
        System.out.println("     |             !    V V    !             | ");
        System.out.println("      V                  V                  V  ");
        System.out.println("       V_                |    U.S.A. NAVY _V   ");
        System.out.println("         V_              |              _V     ");
        System.out.println("           V_            |            _V       ");
        System.out.println("    ~~~~~~~~V~~~~~~~~~~~~|~~~~~~~~~~~_V~~~~~~~~");
        System.out.println("");
        System.out.println("           SSSS   H   H  I  PPPP    SSSS       ");
        System.out.println("          S       H   H  I  P   P  S           ");
        System.out.println("           SSSS   HHHHH  I  PPPP    SSSS       ");
        System.out.println("               S  H   H  I  P           S      ");
        System.out.println("           SSSS   H   H  I  P       SSSS       ");
        System.out.println("");
        System.out.println("    Zadaj 1 a vojdi do menu:");
    }

    /**
     * Metoda zaver vypise do terminalu predpripravene retazce, ktorych
     * sucastou je aj meno hraca, ktory vyhral.
     */
    public void zaver(Hraci hrac) {
        System.out.println("\f");
        System.out.println("");
        System.out.println("                                         |>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("                                         | Vyhral hrac: " + hrac.getNickName() + " >>>>>>>>>>>");
        System.out.println("                                         |>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("                           |>>>>         |");
        System.out.println("                           |             M");
        System.out.println("                           M             M                         |>>>>");
        System.out.println("                      |M   M      MMMM   M                         |");
        System.out.println("                       ||M M      ))))MMMM                         M");
        System.out.println("                        |||M       ))))))MMMM                      M");
        System.out.println("                 |>>>  |||MM       )))))M)))MMMM           MMMMMMMMMMMMM");
        System.out.println("                 |       ||M|M      )))))M)))))))           )))))))M)))))");
        System.out.println(" |>>>           |M      |||M||M    ))))))M))))))))           ))))))M))))))");
        System.out.println(" |               ||M   ||||M|||M  )))))))M))))))))            )))))M)))))))");
        System.out.println("|M                ||M      M          )))M)))))))            ))))))M))))))");
        System.out.println("|||M              ||||M    M  MMMMM      M  ))))            )))))))M)))))");
        System.out.println(" ||||M   M         ||||M   M  )))))MMMMMMM                         M");
        System.out.println(" ||||||M M         |||||M  M   ))))))))))MMMMMMM          MMMMMMMMMMMMMMMMM");
        System.out.println(" ||||||||M          |||||M M    )))))))))M))))))MMMMM     )))))))))M)))))))");
        System.out.println("  |||||||M          |||||||M     ))))))))M)))))))))))      ))))))))M))))))))");
        System.out.println("  |||||||MM          ||||||M     ))))))))M))))))))))))      )))))))M)))))))))");
        System.out.println("  |||||||M|M         ||||||MM    ))))))))M)))))))))))))     )))))))M)))))))))");
        System.out.println("  |||||||M||M        ||||||M|M  )))))))))M)))))))))))))    ))))))))M))))))))");
        System.out.println(" ||||||||M|||M      |||||||M||M))))))))))M))))))))))))    )))))))))M)))))))");
        System.out.println("|||||||||M||||M    ||||||||M|||M)))))))))M)))))))))))    ))))))))))M))))))");
        System.out.println("         M         ||||||||M||||M        M))))))))))               M");
        System.out.println("EEEEEEEEEEEEE              M             M   ))))))             EEEEEEEEEEEEE");
        System.out.println("  EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE     M           >O )      EE PIRATES EE=======");
        System.out.println("    EEEEEEEEE | EE | EE | EE | EEEEEE    M           /|-+     EEEEEEEEEEEE");
        System.out.println("     EEEEEEEE-O-EE-O-EE-O-EE-O-EEEEEEE   M           //      EEEEEEEEEE");
        System.out.println("      EEEEEEE | EE | EE | EE | EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        System.out.println("       EEEEEEEEEEEEEEEEEEEEEEEEEEEEEO O O O O O O O O O O OEEEEEEEEEEE");
        System.out.println("       EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }             
}
