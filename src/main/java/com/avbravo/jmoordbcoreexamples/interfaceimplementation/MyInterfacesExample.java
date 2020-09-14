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
public class MyInterfacesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyInterface myInterface = new MyInterface() {
            @Override
            public Pais findByIdPais(String idpais) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        myInterface.findByIdPais("pa");
        
    }
    
}
