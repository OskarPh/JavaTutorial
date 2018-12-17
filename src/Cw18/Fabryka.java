package Cw18;

class Fabryka{
    double stanKg = 0;
    Sloik[] sloikiDzemu;

    void przyjmij(Owoc owoc) {
        this.stanKg += owoc.waga;
//        if(this.stanKg<10)
//            przyjmij(Owoc owoc);
        if(this.stanKg>=10) {
            sloikiDzemu = robDzemy();
            stanKg -= 10;
        }
    }

    Sloik[] robDzemy() {
        Sloik[] sloiki = new Sloik[10];
        if (stanKg >= 10) {
            for (int i = 0; i < sloiki.length; i++) {
                sloiki[i] = new Sloik(new Dzem(1));
            }
        }
        return sloiki;
    }

}