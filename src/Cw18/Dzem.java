package Cw18;

class Dzem {
    private String smak = "No name";
    private double waga = 100;

    Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    Dzem(String smak) {
        this(smak, 100);
    }

    Dzem(double waga) {
        this("No name", waga);
    }
}