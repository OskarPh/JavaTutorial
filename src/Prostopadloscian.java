public class Prostopadloscian extends Prostokat {

    private double wysokosc;
//    private double bokA;
//    private double bokB;

    public Prostopadloscian(double bokA, double bokB, double wysokosc) {
        super(bokA, bokB);
        this.wysokosc = wysokosc;
    }

    public Prostopadloscian(Prostokat podstawa, double wysokosc) {
        super(podstawa.getBokA(), podstawa.getBokB());
        this.wysokosc = wysokosc;
    }

    public double getWysokosc() {
        return this.wysokosc;
    }

    public double Pole() {
        return 2*(this.getBokA()*this.getBokB() + this.getBokA()*this.wysokosc + this.getBokB()*this.wysokosc);
    }

    public double Objetosc() {
        return this.getBokA()*this.getBokB()*this.getWysokosc();
    }
}