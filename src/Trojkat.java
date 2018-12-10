public class Trojkat {

    private double podstawa;
    //private double wysokosc;

    public Trojkat(double podstawa) { //, double wysokosc) {
        this.podstawa = podstawa;
        //this.wysokosc = wysokosc;
    }

    public double getPodstawa() {
        return this.podstawa;
    }

    public double Pole() {
        return this.podstawa*this.podstawa*Math.sqrt(3) / 4;
        //return podstawa * wysokosc / 2;
    }
}