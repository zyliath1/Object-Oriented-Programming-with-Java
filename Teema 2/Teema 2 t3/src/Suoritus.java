class Suoritus {
    private int viikkotehtavapisteet;
    private int koepisteet;
    private static final int MAX_VIIKKOTEHTAVAPISTEET = 16;
    private static final int MAX_KOEPISTEET = 20;

    public Suoritus(int viikkotehtavapisteet, int koepisteet) {
        this.viikkotehtavapisteet = Math.min(viikkotehtavapisteet, MAX_VIIKKOTEHTAVAPISTEET);
        this.koepisteet = Math.min(koepisteet, MAX_KOEPISTEET);
    }

    public int laskeArvosana() {
        int arvosana;
        if (koepisteet < 10)
            arvosana = 0;
        else if (koepisteet < 12)
            arvosana = 1;
        else if (koepisteet < 14)
            arvosana = 2;
        else if (koepisteet < 16)
            arvosana = 3;
        else if (koepisteet < 18)
            arvosana = 4;
        else
            arvosana = 5;

        if (arvosana > 0 && ((double) viikkotehtavapisteet / MAX_VIIKKOTEHTAVAPISTEET) >= 0.75)
            arvosana++;
        if (arvosana > 5)
            arvosana = 5;

        return arvosana;
    }

    public int getViikkotehtavapisteet() {
        return viikkotehtavapisteet;
    }

    public int getKoepisteet() {
        return koepisteet;
    }
}
