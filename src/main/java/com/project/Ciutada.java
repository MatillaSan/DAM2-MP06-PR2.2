package com.project;

import java.io.Serializable;

public class Ciutada implements Serializable {

    long id;
    long ciutatId;
    String nom;
    String cognom;
    int edat;

    public Ciutada() {
    }

    public Ciutada(long ciutatId, String nom, String cognom, int edat) {
        this.ciutatId = ciutatId;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return this.cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setCiutatId(long ciutatId) {
        this.ciutatId = ciutatId;
    }

    public long getCiutatId() {
        return this.ciutatId;
    }

    @Override
    public String toString() {
        return nom + " " + cognom + ", " + edat + " - " + id;
    }
}