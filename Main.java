package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //değişken isimlendirmeleri java'da camelCase yazılır.
        String ortaMetin = "ilginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        //integer
        int vade = 12;

        double dolarDun = 18.10;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else{
            okYonu = "equal.svg";
            System.out.println(okYonu);

        }
        //array

        String[] krediler = {"Hızlı Kredi","Maaş Halkbankran","Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}