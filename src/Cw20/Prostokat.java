package Cw20;

public class Prostokat {

    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double getBokA() {
        return this.bokA;
    }

    public double getBokB() {
        return this.bokB;
    }

    public double Pole() {
        return bokA * bokB;
    }
}