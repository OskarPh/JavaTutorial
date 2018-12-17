package Cw22;

public class Rakieta {
    String nazwa;
    int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj() {
        this.wagaPaliwa += (int) (Math.random()*1000);
        System.out.println("Stan paliwowy: " + this.wagaPaliwa);
    }

    public void start() throws Exception {
        if(wagaPaliwa < 1000)
            throw new Exception("start anulowany - za malo paliwa");
        else
            System.out.println("STARTUJEMY!");
    }
}
