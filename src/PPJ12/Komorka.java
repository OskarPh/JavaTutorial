package PPJ12;

public class Komorka extends Telefon {
    String[] history = new String[10];

    public void saveHistory() {
        for(int i = history.length - 1; i > 0 ; i--) {
            history[i] = history[i-1];
        }
        history[0] = this.lastNr;
    }

    @Override
    public void zadzwon(String numer) {
        this.lastNr = numer;
        saveHistory();
        System.out.println(lastNr);
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        System.out.println("=== Komorka History ===");
        for(String n : history)
            System.out.println(n);
    }
}
