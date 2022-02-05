package Question3;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Kullanici {

    private final UUID kullaniciId;
    private String isim;
    private String soyisim;
    private String email;
    private Integer yas;
    private Set<Ilan> favoriIlanlar = new HashSet<Ilan>();

    public Kullanici(String isim, String soyisim, String email, Integer yas) {
        this.kullaniciId = UUID.randomUUID();
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.yas = yas;
    }

    public void getFavoriIlanlar(){
        for(Ilan ilan : favoriIlanlar){
            System.out.println("ilan başlığı: " + ilan.getBaslik());
            System.out.println("ilan fiyatı: " + ilan.getFiyat());
        }
    }

    public void addFavoriIlan(Ilan ilan){
        favoriIlanlar.add(ilan);
        System.out.println("Ilan eklenmiştir.");
    }

    public UUID getKullaniciId() {
        return  this.kullaniciId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }
}
