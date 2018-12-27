package PPJ12;

import java.awt.*;

public class Telefon {
    String interfejsKomunikacyjny;
    Color color;
    String lastNr;

    public void zadzwon(String numer) {
        this.lastNr = numer;
        System.out.println(lastNr);
    }

    public void wyswietlHistoriePolaczen() {
        System.out.println("=== Telefon History ===");
        System.out.println("brak historii");
    }
}
