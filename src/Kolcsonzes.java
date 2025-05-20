public class Kolcsonzes {
    private String nev;
    private String azonosito;
    private String ora;
    private String perc;

    public Kolcsonzes(String nev, String azonosito, String ora, String perc) {
        this.nev = nev;
        this.azonosito = azonosito;
        this.ora = ora;
        this.perc = perc;
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

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getPerc() {
        return perc;
    }

    public void setPerc(String perc) {
        this.perc = perc;
    }

    @Override
    public String toString() {
        return "nev=" + nev +
                ", azonosito=" + azonosito +
                ", ora=" + ora +
                ", perc=" + perc;
    }
}
