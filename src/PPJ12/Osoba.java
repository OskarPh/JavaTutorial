package PPJ12;

public class Osoba {
    private String imie, nazwisko, numer;

    public Osoba(String imie, String nazwisko, String numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }

    public String getImie() {
        return this.imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public String getNumer() {
        return this.numer;
    }
}
