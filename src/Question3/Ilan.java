package Question3;

import java.util.Date;

public class Ilan {

    private Gayrimenkul gayrimenkul;
    private String baslik;
    private Integer fiyat;
    private Date olusturulmaTarihi;
    private Kullanici kullanici;
    private Integer ilanSuresi;


    public Ilan(Gayrimenkul gayrimenkul, String baslik, Integer fiyat, Date olusturulmaTarihi, Kullanici kullanici, Integer ilanSuresi) {
        this.gayrimenkul = gayrimenkul;
        this.baslik = baslik;
        this.fiyat = fiyat;
        this.olusturulmaTarihi = olusturulmaTarihi;
        this.kullanici = kullanici;
        this.ilanSuresi = ilanSuresi;
    }

    public Integer getIlanSuresi() {
        return ilanSuresi;
    }

    public void setIlanSuresi(Integer ilanSuresi) {
        this.ilanSuresi = ilanSuresi;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public Integer getFiyat() {
        return fiyat;
    }

    public void setFiyat(Integer fiyat) {
        this.fiyat = fiyat;
    }
}
