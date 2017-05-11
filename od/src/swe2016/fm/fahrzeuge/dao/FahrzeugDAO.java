package swe2016.fm.fahrzeuge.dao;

import at.ac.univie.swe2016.fm.fahrzeuge.Fahrzeug;

import java.util.List;

/**
 * Kuzmenko Oksana a1369160
 */
public interface FahrzeugDAO {

    List getFahrzeugList();
    Fahrzeug getFahrzeugbyId(int i);
    void speichereFahrzeug(Fahrzeug fahrzeug);
    void loescheFahrzeug(int i);
}



