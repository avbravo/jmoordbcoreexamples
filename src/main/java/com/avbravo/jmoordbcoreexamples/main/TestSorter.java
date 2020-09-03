/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbcoreexamples.main;

import com.avbravo.jmoordbcoreexamples.repository.Repository;
import com.avbravo.jmoordbcoreexamples.sorter.Sort;
import com.avbravo.jmoordbcoreexamples.sorter.Sorter;
import org.bson.Document;

/**
 *
 * @author avbravo
 */
public class TestSorter {

    private static String ordenacion = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            Repository repository = new Repository();
            //---------ORDENACION SIMPLE----------
            Sorter sorter = new Sorter.Builder().
                    field("iduser")
                    .sort(Sort.ASC)
                    .build();

            //---------ORDENACION MULTIPLE----------
            Sorter sorter2 = new Sorter.Builder().
                    field("username")
                    .sort(Sort.ASC)
                    .sorter(
                            new Sorter.Builder().
                                    field("date")
                                    .sort(Sort.ASC)                                    
                                    .build()
                    ).build();

           
         Document  querySorter =repository.queryCreateSort(sorter);
            System.out.println("-----------DOCUMENTO GENERADO SIMPLE-------");
            System.out.println(querySorter);
      
            
            querySorter =repository.queryCreateSort(sorter2);
            System.out.println("-----------DOCUMENTO GENERADO COMPUESTO-------");
            System.out.println(querySorter);

        } catch (Exception e) {
            System.out.println("---error " + e.getLocalizedMessage());
        }

//        if(jw.getJmoordbWhere().getJmoordbWhere().getJmoordbWhere().getJmoordbWhere().get !=null){
//           
//        }
    }

   
}
