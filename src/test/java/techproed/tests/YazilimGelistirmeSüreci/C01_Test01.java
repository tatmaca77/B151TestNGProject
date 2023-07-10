package techproed.tests.YazilimGelistirmeSüreci;

public class C01_Test01 {

    /**
    Yazilim Gelistirme Sureci
        1-Dev Environment   --Gelistirme Sureci
        2-QA Environment    --Test Etme Sureci
        3-Pre Prod Environment --Dev yazdi Qa test etti kullaniciyla bulusmadan once uygulamayi bilen veya kullanicilarin yaptigi test(User Acceptance Testing)
        4-Deployment->Prod --Kullanici feedbackleri alinarak, uygulamada bakim ve updateler yapilabilir

        Surec 2 ana nedenle olusur
        ==> Proje fikri     veya   ===>Ihtiyaca binaen

        ==> Bu proje icin kaynak (sponsor) bulmak gerekir. Steakholder

        ==>Sayfa dizaynlarinin yapilmasi

        ==>Product Backlog'un hazirlanmasi

        Or: Bir ihtiyac dogrultusunda proje olusturmak icin butce planlamasi yapildiktan sonra projenin bizden bekledigi seye gore yontem belirleriz.
        Yonteme gore proje yapilmaz.
        Musteriden gelen gereksinimleri backlog larda tutariz. Agile veya kanbanda calisiyorsak product backlog item'lari hazirlanabilir.
        Waterfall da tumu hazir olmali

        Product Owner steakholder lar ile dev team arasinda kopru vazifesi gorur.
        Product backlog'u BA hazirlar
        */

        /**
        Planlama(Ortaklar) - Analiz(BA) - Tasarim (System artitech - UI UX Designer)
        shift left testing-Solo Kaydirma Testi ==>Tester'i daha onceki asamalarda devreye sokmak
        business reguirement document(brd) --business taraf ile sirket arasindaki uzlasma
        frd(functional requirement document)dev ve tester'larin yapmasi gereken kurallari iceren teknik dokuman
        Bazi projelerde user story de denir. Ama daha teknik sirketlerde frd denir (PBI=Product Backlog Item.)
        NOT : Cikintilik yapma sirkette ne deniyorsa onu de :D
         */

        //Pre = ön Prod=Produce=Üretim
        /**
        Dev Environment --> Fiziksel degil sanal bir ortam -Ayni ortam icinde ayrilmis bir bolum - Developer isini tamamlayip tester'a gonderir ordan da pre prod ve canliya cikma sureci
        Pre Prod her zaman her projede olmayabilir.
        Ama dev environment-qa environment , deployment olmak zorundadir.
         */
        /**
        Scrum master: hizmetkar lider
        Sprint toplantilarini hazirlar, grooming toplantisi gerektiginde ayarlar, veri tabani ile ilgili problem oldugunda yol gosterir,
        takımın taahhüt edilen görevleri yerine getirme konusunda engel yasayanlara yardimci olur
         */
        /**
        Product Owner business ile gelistirme takimi arasinda koprudur. Cok onemli durumlar haricinde pek karismaz.
        Projede illa BA olacak diye birsey yok user story'leri yazma isini yapacak biri de olabilir
         */

        /**
        Bi proje canliya ciktiktan sonra hata olabilir veya ihtiyaclara gore degisiklik olabilir - Deployment - Maintenance
        Kabul kriterleri ile birlikte yazilmis user story lere frd de denebilir
         */

        /*
        Dev kodunu yazarken tester bos durmaz. Test case tasarimini yapar. User Story'e gore test case yazar.
        Expected Result ile Actual Result birbirine esit mi bunu kontrol eder.

         */
        /*
        Requirement durumuna gore 5 farkli test case de yazilabilir veya durumlari birlestirip bir test case de yazilabilir
         */
        /*
        Bir gelistirmenin otomasyona dokulebilmesi icin orda yapilan tum hatalarin temizlenmis ve stabil olmasi gerekir.
        Testleri neden otomasyona dokeriz? Zamandan ve dolayisiyla paradan tasarruf saglamak icin.
        Otomasyonun duzgun calismasi icin manuel test sarttir.Manuel test olmadan otomasyon yapma sansimiz yoktur
         */

        /*
        Otomasyonda da hata alabiliriz. O zaman bu otomasyonu neden yapariz? Otomasyon onemlidir, ancak gelistirme
        asamasinda herhangi bir hata olup olmadigina otomasyon ile bakilmaz. Oncelikle manual test yapariz ve
        bu hatayi raporlariz. Artik o fonksiyonun hatalardan tamamen arindirilmis oldugu durumda otomasyon testini yapariz.
         */
        /*
        Cok farkli datalarla test yapmamiz gerekiyorsa manuel testte bu konuda zorlaniriz. Bu da otomasyonun avantajidir
        Her canli oncesi veya sprint sonrasi uygulama yazilmis tum case'ler icin test kosulmasi gerekir. Bu durumda regression
        test gerekir.Burda otomasyon buyuk avantajdir.Zaman ve maliyet kaybinin onune gecilir
        Yeni yapilan gelistimelerle eski yapilanlar birlikte beraber duzgun calisiyor mu regsresyon testi bunun icin yapilir.
        Bu mutlaka kullanilir. Iyi bilmek gerekir. Bu surece musteri dahil olmaz.
        Iki gelistirme birbirini etkileyebilir. Canliya cikmadan once yapilan tum testler tekrar yapilir
         */
        //otomasyon daha cok tekrarli islerde one cikiyor olmasi lazim belli bir testi defalarca yapmak gerekiyorsa yada ayni isi farkli girdilerle yapilamsi gerekiyorsa
        /*
        Manual testi yaptik ve hatalardan arindirildi. O zaman neden otomasyona hala neden ihtiyac duyariz?
        Smoke test ile her gun kritik fonksiyonlara bakmamiz gerekir. Bunun icin otomasyon kolaylik saglar.
        Manual test ile yapmamizi zorlastiracak kadar data olabilir. Bu datalari test etmemiz gerekebilir.
        Regression test ile yeni yapilan gelismelerin diger gelismelere olumsuz bir etkisi olmus mu diye bakariz.
         */

        /*
        Test Case yazarken test tekniklerine uygun test case yazmaliyiz
        Teknik aynidir ama test datasi degisir.
        Sinir deger analizi, denklik paylarina ayirma, karar tablosu, durum gecis senaryosu test teknigi (belli bir sarta gore durumlarin degistigi)
        Bu test tekniklerini iyice sindirip testleri yazmaliyiz
        Test Tekniklerini minumum test senaryosu ile maksimum alani test etmek icin kullaniriz. Onemli olan hata sayisini en aza indirmektir.
         */

        /*
        Manuel de yapilan her islemi once excel de yaziyoruz daha sonra testi kosarken bir video kaydi veya ekran goruntusu almaliyiz.
         */

        //Test Case’lerimizi Nasil Yazariz?
        //Balck Box Test Teknikleri ile calisiriz.
        //Hangi test teknigini uygulayacagimiza karar veririz.
        //Boundary value analysis yas girilecek durumlarda kullanilabilir ya da kilo ile ilgili gruplandirma yapabiliriz. Ornegin 30-50 kilo arasi, 50-70 kilo arasi ve sonrasi
        //Bazen belirli sartlara riayet etmek gerekebilir. Ona uygun test teknigini uygulariz. Her zaman tek bir Teknik kullanmayabiliriz. Birden fazla test teknigini kullanabiliriz. Minimum test ile maksimum sonuc almaya calisma amaci ile hareket ederiz. Ilgili fonksiyon calisiyor mu, buna bakarken hata almayi minimum seviyeye indirmeye calisiriz.

        /*
           Smoke testler ==>  Uygulamanin en cok kullanilan en kritik bolumleri ile ilgili yapilan testlerdir.
           E2E Test ==> Sistem Testi - Bir uygulamanin fonksiyonlarinin farkli sekillerde test edilmesi
           Integration Testi = Uygulama arka planda farkli veri yapilariyla calisiyor. Bunlar birbirleriyle uyumlu calisiyor mu bunun testidir
           */

        /*
        Test Cesitleri:
        Smoke Test: Bir uygulamanin calisip calismadigi, herhangi bir yerine ulasma problem olup olmadigini test ederiz. Uygulamanin en  cok kullanilan, hata olursa sorun olacak nitelikteki fonksiyonlarini test eder.
        Integration Test: Bir puzzle parcalarini dusunelim. Her bir parcanin farkli sistemlerle etkilesimi soz konusu olur. Birbirinden farkli iki uygulamadan birindeki degisiklik digerini de etkiliyorsa ikisi arasinda bir etkilesim olabilir. Parcalarin birbirleri ile etkilesimleri ve etkileri ile ilgilidir.
        Regression Test: Bir yerde degisiklik yapildiktan sonra bu degisikligin uygulamanin bir bolumu ya da birden fazla bolumunu etkileyip etkilemedigi, diger bolumlerin calismasini olumsuz etkileyip etkilemedigini kontrol eder.
         E2E Test: UI’da bir fonksiyon calistiysa onun API’da ve baskaca ortamlarda da calisip calismadigini test etmemizdir. Siteye giristen itibaren tum adimlari test etmemizdir. Bir uctan diger uca kadar testler yapmamizdir.
         */

        /*
        Bir uygulamada birbirinden etkilenen bolumlerin test edilmesi -minor regresyon
        Uygulamanin tamaminin test edilmesi -major regresyon
         */

}



