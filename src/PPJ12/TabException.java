package PPJ12;

public class TabException extends Exception {
    int[][] tab;
    String poz = "";

    TabException(int[][] tab) {
        this.tab = tab;
        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                if(i != j && tab[i][j] != 0)
                    poz += "["+i+","+j+"], ";

            }
        }
    }

    public String toString() {
//        System.out.println(poz.charAt(poz.length()-1));
        poz = poz.substring(0, poz.length()-2);
        return ("Tablica nie spelnia wymagan, bledy na pozycjach "+poz);

    }
}

