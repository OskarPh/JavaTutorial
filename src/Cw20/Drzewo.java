package Cw20;

public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;
	
	public Drzewo(){
        this.wiecznieZielone = false;
        this.wysokosc = 0;
        this.przekrojDrzewa = "BRAK";
    }
	
    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString(){
        return wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa;
    }
}
