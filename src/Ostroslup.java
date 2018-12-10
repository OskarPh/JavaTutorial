public class Ostroslup extends Trojkat {

    private double wysokosc;

    public Ostroslup(double podstawa, double wysokosc) {
        super(podstawa);
        this.wysokosc = wysokosc;
    }

    public Ostroslup(Trojkat trojkat, double wysokosc) {
        super(trojkat.getPodstawa());
        this.wysokosc = wysokosc;
    }

    public double Pole() {
        return super.Pole()*4;
    }

    public double Objetosc() {
        return this.Pole()*this.wysokosc/3;
    }
}