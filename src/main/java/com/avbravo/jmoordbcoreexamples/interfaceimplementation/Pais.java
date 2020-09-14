/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbcoreexamples.interfaceimplementation;

/**
 *
 * @author avbravo
 */
public class Pais {
    private String idPais;
    private String pais;

    public Pais() {
    }

    public Pais(String idPais, String pais) {
        this.idPais = idPais;
        this.pais = pais;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
