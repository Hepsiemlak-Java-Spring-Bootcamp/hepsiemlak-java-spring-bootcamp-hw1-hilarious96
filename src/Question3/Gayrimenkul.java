package Question3;

public class Gayrimenkul {

    private String il;
    private String ilce;
    private String evTipi;
    private String odaSayisi;
    private Integer alan;
    private Integer kat;

    public Gayrimenkul(String il, String ilce, String evTipi, String odaSayisi, Integer alan, Integer kat) {
        this.il = il;
        this.ilce = ilce;
        this.evTipi = evTipi;
        this.odaSayisi = odaSayisi;
        this.alan = alan;
        this.kat = kat;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getEvTipi() {
        return evTipi;
    }

    public void setEvTipi(String evTipi) {
        this.evTipi = evTipi;
    }

    public String getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(String odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public Integer getAlan() {
        return alan;
    }

    public void setAlan(Integer alan) {
        this.alan = alan;
    }

    public Integer getKat() {
        return kat;
    }

    public void setKat(Integer kat) {
        this.kat = kat;
    }
}
