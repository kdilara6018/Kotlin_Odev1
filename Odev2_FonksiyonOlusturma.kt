package com.example.kotlin1.Odevler

class Odev2_FonksiyonOlusturma
{
        // fonksiyon 1
        // parametre olarak girilen kenar sayısına göre iç açılar toplamını
        // hesplayıp sonuccu geri döndüren bir metod yazınız
        // iç açılar toplamı = (kenar sayısı - 2 ) x 180

    fun fonksiyon1 (kenar : Int)
    {
        val toplam = (kenar - 2)*180
        if (kenar <3)
        {
            println("ic acilar toplami = 0")
        }
        else
        println("ic acilar toplami = $toplam")
    }

    // fonksiyon 2
    // parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde
    // edilen değeri döndüren bir metod yazınız
    // 1 günde 8 saat çalışabilir , çalışma saat ücreti : 10 tl
    // mesai saat ücreti : 20 tl , 160 saat üzeri mesai sayılır

    fun fonksiyon2 (gun : Int)
    {
        val saat = gun * 8
        var maas = 0
        if (saat>160)
        {
            val ekstra = saat - 160
            val ekstra_ucret = ekstra * 20
            maas = ekstra_ucret + (160*10)
        }
        else
            maas = saat * 10
        println("maasınız : $maas tl")
    }

    // fonksiyon 3
    // parametre olarak girilen kota miktarına göre ücreti hesaplayan
    // ve geri döndüren metodu girin
    // 50 gb = 100 tl , kota aşımından sonraki her 1 gb = 4 tl

    fun fonksiyon3(gb : Int)
    {
        var ucret = 1
        if(gb>50)
        {
            ucret =((gb-50)*4)+100
        }
        else
            ucret = 100
        println( "ucretiniz : $ucret ")
    }

    // fonksiyon 4
    // parametre olarak girilen dereceyi fahrenhiet'a dönüştürdükten
    // sınra geri döndüren bir metod yazın
    // f = c x 1.8 + 32

    fun fonksiyon4(derece : Int)
    {
        val fahrenhiet = (derece*1.8)+32
        println(" fahrenhiet : $fahrenhiet")
    }

    // fonksiyon 5
    // kenarları parametre olarak girilen bir dikdörtgenin çevresini
    // hesaplayan bir metod yazınız

    fun fonksiyon5(k1 : Int , k2 : Int ,k3 : Int ,k4 : Int )
    {
        if (k1>0 && k2>0 && k3>0 && k4>0)
        {
            val cevre = k1 + k2 + k3 + k4
            println("cevre : $cevre")
        }
        else
            println("hesaplanamadi")
    }

    // fonksiyon 6
    // parametre olarak girilen bir sayının faktoriel değerini hesaplayıp
    // geri döndüren bir metod yazınız

    fun fonksiyon6(sayi : Int)
    {
        var faktoriel = 1
        if (sayi == 0 || sayi == 1)
        {
            println("faktoriel : 1")
        }
        else if (sayi<0)
        {
            println("faktoriel hesaplanamadi")
        }
        else
        {
            for (x in 1 .. sayi)
            {
                faktoriel = faktoriel * x
            }
            println("faktoriel : $faktoriel")
        }
    }

    // fonksiyon 7
    // parametre olarak girilen kelime için kaç adet a harfi olduğunu
    // gösteren bir metod yazınız

    fun fonksiyon7(kelime : String) : Int
    {
        var sayac = 0
        for (harf in kelime)
        {
            if (harf== 'a' || harf == 'A')
            {
                sayac ++
            }
        }
        return sayac
    }
}
