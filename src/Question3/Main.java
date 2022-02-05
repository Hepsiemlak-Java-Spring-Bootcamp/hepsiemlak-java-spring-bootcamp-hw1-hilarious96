package Question3;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Kullanici kullanici1 = new Kullanici("ayşe", "sarı", "ayse.sarı@gmail.com",35);
        Kullanici kullanici2 = new Kullanici("mustafa","erduran","abc@gmail.com",25);
        Kullanici kullanici3 = new Kullanici("ziya", "uşaklıgil", "ziya@gmail.com",80);

        Gayrimenkul gayrimenkul1 = new Gayrimenkul("istanbul","kadıköy","bahçeli","3+1",195,3);
        Gayrimenkul gayrimenkul2 = new Gayrimenkul("istanbul","kadıköy","bahçeli","3+1",300,12);
        Gayrimenkul gayrimenkul3 = new Gayrimenkul("istanbul","kadıköy","bahçeli","3+1",120,3);
        Gayrimenkul gayrimenkul4 = new Gayrimenkul("konya","meram","bahçeli","2+1",200,1);
        Gayrimenkul gayrimenkul5 = new Gayrimenkul("izmir","bostancı","bahçeli","2+1",153,2);
        Gayrimenkul gayrimenkul6 = new Gayrimenkul("bursa","orhangazi","bahçeli","4+1",110,9);

        List<Ilan> ilanlar = new ArrayList<Ilan>();
        ilanlar.add(prepareIlan(gayrimenkul1,"sahibinden",2000,new Date(),kullanici1,10));
        ilanlar.add(prepareIlan(gayrimenkul1,"sahibinden",3001,new Date(),kullanici1,15));
        ilanlar.add(prepareIlan(gayrimenkul1,"emlakçı",1000,new Date(),kullanici2,11));
        ilanlar.add(prepareIlan(gayrimenkul1,"emlakçı",2999,new Date(),kullanici2,12));
        ilanlar.add(prepareIlan(gayrimenkul1,"emlakçı",4000,new Date(),kullanici3,13));
        ilanlar.add(prepareIlan(gayrimenkul1,"emlakçı",3500,new Date(),kullanici3,14));

        kullanici1.addFavoriIlan(ilanlar.get(3));
        kullanici1.addFavoriIlan(ilanlar.get(3));
        kullanici1.addFavoriIlan(ilanlar.get(5));
        kullanici1.getFavoriIlanlar();
    }

    private static Ilan prepareIlan(Gayrimenkul gayrimenkul, String baslik, Integer fiyat, Date olusturulmaTarihi,Kullanici kullanici,Integer ilanSuresi) {
        Ilan ilan = new Ilan(gayrimenkul,baslik,fiyat,olusturulmaTarihi,kullanici,ilanSuresi);
        return ilan;
    }



}
