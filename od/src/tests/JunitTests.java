package tests;


import at.ac.univie.swe2016.fm.fahrzeuge.LKW;
import at.ac.univie.swe2016.fm.fahrzeuge.PKW;
import swe2016.fm.fahrzeuge.dao.SerializedFahrzeugDAO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kuzmenko Oksana a1369160
 */
public class JunitTests {
    @Test
    public void testPkwPrise() {
        PKW pkw = new PKW(1,"Audi", "A6", 2015, 1000,  "2014-01-20");
        System.out.println("Rabatt: " + pkw.getRabatt());
        System.out.println("Prise: " + pkw.getPreis());
        assertEquals(910, pkw.getPreis(), 0);
    }

    @Test
    public void testLkwPrise() {
        LKW lkw = new LKW(1, "Mercedes", "Fyra", 2015, 10000);
        System.out.println("Rabatt: " + lkw.getRabatt());
        System.out.println("Prise: " + lkw.getPreis());
        assertEquals(9500, lkw.getPreis(), 0);
    }

    @Test
    public void testPkwSerialisation(){
        PKW pkw = new PKW(1,"Audi", "A6", 2015, 1000,  "2014-01-20");
        SerializedFahrzeugDAO serializedFahrzeugDAO = new SerializedFahrzeugDAO(" ");
        serializedFahrzeugDAO.speichereFahrzeug(pkw);
        PKW retpkw = (PKW) serializedFahrzeugDAO.getFahrzeugbyId(1);
        System.out.println(pkw);
        System.out.println(retpkw);
        assertEquals(pkw.getId(), retpkw.getId());
    }

    @Test
    public void testPkwDatum(){
        PKW pkw = new PKW(1,"Audi", "A6", 2014, 1000,  "2014-01-20");

        assertEquals(2014,pkw.getDatum().getYear() );
    }




}
