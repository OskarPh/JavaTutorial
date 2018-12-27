package PPJ12;

public class Smartfon extends Komorka {
    Osoba[] znajomi;

    public Smartfon(Osoba[] o) {
        znajomi = o;
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        boolean isZnajomy = false;
        System.out.println("=== Smartfon History ===");
        for(String n : this.history) {
            for(Osoba o : this.znajomi) {
                if(n == o.getNumer()) {
                    System.out.println(o.getImie() + " " + o.getNazwisko() + " " + n);
                    isZnajomy = true;
                }
            }
            if(!isZnajomy) System.out.println(n);
            isZnajomy = false;
        }
    }

    public boolean isZnajomy(String numer) {
        for(Osoba n : this.znajomi) {
            if(numer == n.getNumer())
                return true;
        }
        return false;
    }
}
