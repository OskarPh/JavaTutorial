package Cw20;

public class Graniastoslup extends Trojkat {

    private double wysokosc;

    public Graniastoslup(double podstawa, double wysokosc) {
        super(podstawa);
        this.wysokosc = wysokosc;
    }

    public Graniastoslup(Trojkat trojkat, double wysokosc) {
        super(trojkat.getPodstawa());
        this.wysokosc = wysokosc;
    }

    public double Pole() {
        return super.Pole()*2 + 3*super.getPodstawa()*this.wysokosc;
    }

    public double Objetosc() {
        return this.Pole()*this.wysokosc;
    }
}
