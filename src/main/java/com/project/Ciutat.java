package com.project;

import java.io.Serializable;
import java.util.List;

public class Ciutat implements Serializable {

    long ciutatId;
    String nom;
    String pais;
    int codiPostal;

    public Ciutat() {
    }

    public Ciutat(String nom, String pais, int codiPostal) {
        this.nom = nom;
        this.pais = pais;
        this.codiPostal = codiPostal;
    }

    public long getCiutatId() {
        return ciutatId;
    }

    public void setCiutatId(long ciutatId) {
        this.ciutatId = ciutatId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCodiPostal() {
        return this.codiPostal;
    }

    public void setCodiPostal(int codiPostal) {
        this.codiPostal = codiPostal;
    }

    public List<Object[]> queryCiutadanss() {
        long id = this.getCiutatId();
        return Manager.queryTable(
                "SELECT DISTINCT i.ciutatId, i.nom FROM Ciutada i, Ciutat c WHERE c.ciutatId = i.ciutatId AND c.ciutatId = "
                        + id);
    }

    @Override
    public String toString() {
        return nom + ", " + pais + " " + codiPostal;
    }
}