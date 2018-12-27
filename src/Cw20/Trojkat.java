package Cw20;

public class Trojkat {

    private double podstawa;

    public Trojkat(double podstawa) {
        this.podstawa = podstawa;
    }

    public double getPodstawa() {
        return this.podstawa;
    }

    public double Pole() {
        return Math.pow(this.podstawa, 2)*Math.sqrt(3) / 4;
    }
}