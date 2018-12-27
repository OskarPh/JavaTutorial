package Cw20;

public class DrzewoLisciaste extends Drzewo {
    int ksztaltLiscia;

    DrzewoLisciaste(){
        this.ksztaltLiscia = 0;
    }

    DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia){
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    public String toString(){
        return super.toString() + " " + ksztaltLiscia;
    }
}

