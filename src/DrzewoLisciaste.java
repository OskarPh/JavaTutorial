public class DrzewoLisciaste extends Drzewo {
    int ksztaltLiscia;

    DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia){
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    public String toString(){
        return wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa + " " + ksztaltLiscia;
    }
}

