package com.project;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Ciutat implements Serializable {

    long ciutatId;
    String nom;
    String pais;
    int codiPostal;
    private Set<Ciutada> ciutadans;

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

    public Set<Ciutada> getCiutadans() {
        return this.ciutadans;
    }

    public void setCiutadans(Set<Ciutada> ciutadans) {
        this.ciutadans = ciutadans;
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