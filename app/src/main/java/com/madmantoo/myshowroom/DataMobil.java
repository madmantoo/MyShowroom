package com.madmantoo.myshowroom;

import java.util.ArrayList;

public class DataMobil {
    private static String[] mobilName = {
            "Toyota Altis 2016",
            "Toyota Avanza 2012",
            "Daihatsu Ayla 2018",
            "Honda Brio 2017",
            "Suzuki Ertiga 2017",
            "Honda Freed 2014",
            "Honda Hrv 2016",
            "Suzuki Ignis",
            "Grand Livina 2012",
            "Honda Mobilio 2018",
            "Pajero Dakar 2015",
            "Nissan Serena 2012"
    };

    private static String[] mobilDetail = {
            "Toyota Altis 2016 Type V dengan spesifikasi serta kelengkapan:\n" +
                    "\n" +
                    "2000cc, automatic transmission, CVT 7-speed, paddle-shift, cruise-control, GPS Navi, bluetooth/usb/dvd, power driver-seat, keyless entry, electric mirror and retractable, parking sensor, jok kulit, kacafilm V-kool, karpet pvc",

            "Toyota Avanza 2012 mesin sehat elektrik lancar dengan spesifikasi serta kelengkapan:\n" +
                    "\n" +
                    "Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Daihatsu Ayla 2018 Pajak Panjang dengan spesifikasi serta kelengkapan:\n" +
                    "\n" +
                    "Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Honda Brio 2017 bukan kaleng kaleng dengan spesifikasi serta kelengkapan:\n" +
                    "\n" +
                    "Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Ertiga cocok untuk taxol Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Honda Freed rawatan pribadi Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Honda Hrv cocok untuk anak muda Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Suzuki Ignis desain seperti panda Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Nissan Grand Livina matic Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Mobilio Kaleng Kaleng Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Pajero 2015 cocok untuk kalian yang suka SUV Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit",

            "Nissan Serena kenyaman dalam kabin Tangan 1 sangat istinewa dan terawat, Body mulus originale bebas insiden, Interior bersih dan rapi, Mesin dan kaki2 tanpa ragat tinggal pakai, Ban tebal2 pajak panjang, AC Double blower dingin, jok kulit"
    };

    private static String[] mobilHarga = {
            "Rp. 180.000.000",
            "Rp. 120.000.000",
            "Rp. 86.000.000",
            "Rp. 94.000.000",
            "Rp. 142.000.000",
            "Rp. 170.000.000",
            "Rp. 230.000.000",
            "Rp. 160.000.000",
            "Rp. 82.000.000",
            "Rp. 130.000.000",
            "Rp. 248.000.000",
            "Rp. 153.000.000"
    };

    private static int[] mobilImages = {
            R.drawable.atlis,
            R.drawable.avanza,
            R.drawable.ayla,
            R.drawable.brio,
            R.drawable.ertiga,
            R.drawable.freed,
            R.drawable.hrv,
            R.drawable.ignis,
            R.drawable.livina,
            R.drawable.mobilio,
            R.drawable.pajero,
            R.drawable.serena
    };

    static ArrayList<Mobil> getListData() {
        ArrayList<Mobil> list = new ArrayList<>();
        for (int position = 0; position < mobilName.length; position++) {
            Mobil mobil = new Mobil();
            mobil.setName(mobilName[position]);
            mobil.setDetail(mobilDetail[position]);
            mobil.setHarga(mobilHarga[position]);
            mobil.setPhoto(mobilImages[position]);
            list.add(mobil);
        }
        return list;
    }
}
