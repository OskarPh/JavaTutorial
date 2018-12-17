class Sloik {
    Dzem dzem;
    boolean czyOtwarty;
    Sloik(Dzem dzem) {
        if(!this.czyOtwarty) otworz();
        this.dzem = dzem;
        zamknij();
    }
    void otworz() {
        // mozna by jeszcze sprawdzic czy jest obecnie zamkniety: if(!czyOtwarty) czyOtwarty = true;
        czyOtwarty = true;
    }
    void zamknij() {
        // mozna by jeszcze sprawdzic czy jest obecnie otwarty: if(czyOtwarty) czyOtwarty = false;
        czyOtwarty = false;
    }
}