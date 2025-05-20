public class Kolcsonzes {
    private String nev;
    private String azonosito;
    private int elvora;
    private int elvperc;
    private int visszaOra;
    private int visszaPerc;

    public Kolcsonzes(String nev, String azonosito, int elvora, int elvperc, int visszaOra, int visszaPerc) {
        this.nev = nev;
        this.azonosito = azonosito;
        this.elvora = elvora;
        this.elvperc = elvperc;
        this.visszaOra = visszaOra;
        this.visszaPerc = visszaPerc;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public int getElvora() {
        return elvora;
    }

    public void setElvora(int elvora) {
        this.elvora = elvora;
    }

    public int getElvperc() {
        return elvperc;
    }

    public void setElvperc(int elvperc) {
        this.elvperc = elvperc;
    }

    public int getVisszaOra() {
        return visszaOra;
    }

    public void setVisszaOra(int visszaOra) {
        this.visszaOra = visszaOra;
    }

    public int getVisszaPerc() {
        return visszaPerc;
    }

    public void setVisszaPerc(int visszaPerc) {
        this.visszaPerc = visszaPerc;
    }

    @Override
    public String toString() {
        return "nev=" + nev +
                ", azonosito=" + azonosito +
                ", elvora=" + elvora +
                ", elvperc=" + elvperc +
                ", visszaOra=" + visszaOra +
                ", visszaPerc=" + visszaPerc;
    }
}
