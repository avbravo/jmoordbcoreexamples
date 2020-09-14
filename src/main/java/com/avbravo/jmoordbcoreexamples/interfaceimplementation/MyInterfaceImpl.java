/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbcoreexamples.interfaceimplementation;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class MyInterfaceImpl implements MyInterface {

    
   public List<Pais> findAll(){
         List<Pais> list = Arrays.asList(new Pais("pa","Panama"),new Pais( "co","Colonbia"));
            try {
                
            } catch (Exception e) {
            }
            return list;
}

    @Override
    public Pais findByIdPais(String idpais) {
        List<Pais> list = findAll();
      for(Pais p:list){
          if(idpais.equals(p.getIdPais())){
              return p;
          }
      }
      return null;
    }
  
    
}
