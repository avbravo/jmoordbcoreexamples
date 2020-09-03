/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbcoreexamples.main;

import com.avbravo.jmoordbcoreexamples.enumerations.Comparison;
import com.avbravo.jmoordbcoreexamples.enumerations.Logic;
import com.avbravo.jmoordbcoreexamples.query.DateQuery;
import com.avbravo.jmoordbcoreexamples.query.Query;
import com.avbravo.jmoordbcoreexamples.repository.Repository;
import java.util.Date;

/**
 *
 * @author avbravo
 */
public class TestQuery {

    private static String ordenacion = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Repository repository = new Repository();

            
            /*
            Restricion
            */
            Query query = new Query.Builder().
                    field("iddepartament")
                    .operators(Comparison.EQ)
                    .value(2)
                    .build();
            repository.analizeQuery(query);
System.out.println("====================================");
            Query queryString = new Query.Builder().
                    field("username")
                    .operators(Comparison.EQ)
                    .value("avbravo")
                    .build();
            
            repository.analizeQuery(queryString);
            System.out.println("====================================");
            // username="avbravo and active = true
            Query queryCombined = new Query.Builder().
                    field("username10")
                    .operators(Comparison.EQ)
                    .value("avbravo")
                    .query(new Query.Builder().
                                    field("active10")
                                    .operators(Comparison.EQ)
                                    .value(false)
                                    .build()
                    )
                    .build();
            
              repository.analizeQuery(queryCombined);
              System.out.println("====================================");
            // username="avbravo and active = true or photo != ""
            Query queryCombined3 = new Query.Builder().
                    field("username20")
                    .operators(Comparison.EQ)
                    .value("avbravo")
                    .query(new Query.Builder().
                                    field("active20")
                                    .operators(Comparison.EQ)
                                    .value(false)
                                    .query(new Query.Builder().
                                                    field("photo20")
                                                    .operators(Comparison.NE)
                                                    .value("")
                                                    .build()
                                    ).build()
                    ).build();
     repository.analizeQuery(queryCombined3);
            System.out.println("====================================");
            /*
            FECHAS
            
             */
            ///1--------------QUERY SOLO CON FECHAS
            Query queryCombinedDate = new Query.Builder().
                    dateQuery(new DateQuery.Builder().
                            field("fecha30")
                            .start(new Date())
                            .operators(Comparison.BETWEEN)
                            .end(new Date())
                            .excludedHours(true)
                            .build()
                    ).build();
     repository.analizeQuery(queryCombinedDate);
     System.out.println("====================================");
     
            //2 username = "avbravo and datequery () en el mismo query
            Query queryCombinedDate2 = new Query.Builder().
                    field("username40")
                    .operators(Comparison.EQ)
                    .value("avbravo")
                    .binary(Logic.AND)
                    .dateQuery(new DateQuery.Builder().
                            field("fecha40")
                            .start(new Date())
                            .operators(Comparison.BETWEEN)
                            .end(new Date())
                            .excludedHours(true)
                            .build()
                    ).build();
            
                repository.analizeQuery(queryCombinedDate2);
                System.out.println("====================================");
            //3 username = "avbravo and datequery () en el mismo query
            Query queryCombinedDate3 = new Query.Builder().
                    field("username50")
                    .operators(Comparison.EQ)
                    .value("avbravo")
                    .binary(Logic.AND)
                    .query(new Query.Builder().
                                    dateQuery(new DateQuery.Builder().
                                            field("fecha51")
                                            .start(new Date())
                                            .operators(Comparison.BETWEEN)
                                            .end(new Date())
                                            .excludedHours(true)
                                            .build()
                                    ).build()
                    ).build();
 repository.analizeQuery(queryCombinedDate3);
 System.out.println("====================================");
 
            // username = "avbravo and datequery () y activo = true
            Query queryCombinedDate4 = new Query.Builder().
                    field("username60")
                    .operators(Comparison.EQ)
                    .value("avbravo")
                    .binary(Logic.AND)
                    .query(new Query.Builder().
                                    field("active60")
                                    .operators(Comparison.EQ)
                                    .value(true)
                                    .binary(Logic.AND)
                                    .dateQuery(new DateQuery.Builder().
                                            field("fecha60")
                                            .start(new Date())
                                            .operators(Comparison.BETWEEN)
                                            .end(new Date())
                                            .excludedHours(true)
                                            .build()
                                    ).build()
                    ).build();
 repository.analizeQuery(queryCombinedDate4);
            System.out.println("====================================");
            /*
            Restricion
            */
            //2 username = "avbravo and datequery () en el mismo query
            Query queryRestringuido = new Query.Builder().
                    field("username70")
                    .operators(Comparison.EQ)
                    .value("avbravo")
                    .binary(Logic.AND)
                    .dateQuery(new DateQuery.Builder().
                            field("fecha70")
                            .start(new Date())
                            .operators(Comparison.BETWEEN)
                            .end(new Date())
                            .excludedHours(true)
                            .build()
                     
                    )
                    .query(new Query.Builder().
                                    field("active70")
                                    .operators(Comparison.EQ)
                                    .value(false)
                                    .build()                          
                    ).build();
            
            repository.analizeQuery(queryRestringuido);
            System.out.println("====================================");
            /**
             * 
             */
           //Query vacio
           Query empty = new Query.Builder().build();
           
            
        } catch (Exception e) {
            System.out.println("---error " + e.getLocalizedMessage());
        }

//        if(jw.getJmoordbWhere().getJmoordbWhere().getJmoordbWhere().getJmoordbWhere().get !=null){
//           
//        }
    }

   
}
