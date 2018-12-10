public class DrzewoIglaste extends Drzewo {
    int iloscIgiel;
    double dlugoscSzyszki;

    DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki){
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public String toString(){
        return wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa + " " + iloscIgiel + " " + dlugoscSzyszki;
    }
}

