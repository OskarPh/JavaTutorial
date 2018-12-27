package PPJ12;

public class PPJ12 {
    public static void main(String[] args) {
        Osoba[] o = {
                new Osoba("Jan", "Kowalski", "353-975-5852"),
                new Osoba("Mati", "Zet", "939-200-6548"),
                new Osoba("Jakub", "Te", "687-709-7976"),
                new Osoba("Piotr", "Ce", "263-535-1632"),
                new Osoba("Marek", "Wu", "562-373-7800")
        };

        Telefon t = new Telefon();
        Komorka k = new Komorka();
        Smartfon s = new Smartfon(o);
        Telefon[] tab = {t, k, s};
        String[] numery = {
                "353-975-5852",
                "666-767-6426",
                "939-200-6548",
                "250-210-5438",
                "687-709-7976",
                "997-592-1747",
                "263-535-1632",
                "382-730-7209",
                "562-373-7800",
                "590-610-0273"
        };
        for (Telefon tel : tab) {
            for (String n : numery) {
                tel.zadzwon(n);
            }
        }

        for (Telefon tel : tab) {
            tel.wyswietlHistoriePolaczen();
        }

        // Zadanie 6
        System.out.println("=== ZADANIE 6 ===");
        int[][] tablica = {
                {0,0,1},
                {0,1,0},
                {0,1,0}
        };
        try {
            checkTab(tablica);
        } catch (TabException e) {
            System.out.println(e);
        }

    }

    public static void checkTab(int[][] tab) throws TabException {
        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                if(i != j && tab[i][j] != 0)
                    throw new TabException(tab);
            }
        }
    }
}
