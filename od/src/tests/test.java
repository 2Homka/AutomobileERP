package tests;

import at.ac.univie.swe2016.fm.FahrzeugManagement;
import at.ac.univie.swe2016.fm.fahrzeuge.Fahrzeug;
import at.ac.univie.swe2016.fm.fahrzeuge.LKW;
import at.ac.univie.swe2016.fm.fahrzeuge.PKW;
import java.util.List;
/**
 * Kuzmenko Oksana a1369160
 */

public class test {
    public static void main(String[] args) {

//        FahrzeugManagement fm = new FahrzeugManagement("test");
//
//
//        Fahrzeug p1 = new PKW(2, "Tesla Motors", "Model S", 2012, 1003, "2011-08-23");
////        Fahrzeug p2 = new PKW(2, "Tesla Motors", "Model S", 2012, 1003, "2015-08-23");
////        Fahrzeug p3 = new PKW(3, "Tesla Motors", "Model S", 1999, 1003, "2015-08-23");
////        Fahrzeug p4 = new LKW(4, "Tesla Motors", "Model S", 2013, 999);
////        Fahrzeug p5 = new LKW(5, "audi", " audi", 1999, 123);
//
//
//        fm.getSavedIdList().clear();
//
//        fm.neueFahrzeugeHinzufuegen(p1);
////        fm.neueFahrzeugeHinzufuegen(p2);
////        fm.neueFahrzeugeHinzufuegen(p5);
////        fm.neueFahrzeugeHinzufuegen(p3);
////        fm.neueFahrzeugeHinzufuegen(p4);
//
////        System.out.println(fm.aeltesteFahrzeugSuchen());
//
////        List<Fahrzeug> l = fm.getSavedIdList();
////
////        for (Fahrzeug f : l)
////            System.out.println(f);

        SerializedFahrzeugDAO sf = new SerializedFahrzeugDAO("a");
        LKW lkw = new LKW(1, "audi", "a6", 1997, 1000);
        sf.speichereFahrzeug(lkw);

        SerializedFahrzeugDAO sf2 = new SerializedFahrzeugDAO("a");
        System.out.println(sf2.getFahrzeugbyId(1));


    }

    }
}
