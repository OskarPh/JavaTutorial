class Owoc {
    String nazwa;
    double waga = Math.random() * 0.3 + 0.5;

    Owoc(String nazwa) {
        this.nazwa = nazwa;
    }

    void wypisz() {
        System.out.println(this.nazwa + " waży " + this.waga);
    }
}