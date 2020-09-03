/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbcoreexamples.query;

import com.avbravo.jmoordbcoreexamples.enumerations.Comparison;
import com.avbravo.jmoordbcoreexamples.enumerations.Logic;

/**
 *
 * @author avbravo
 * https://avbravo-2.gitbook.io/jmoordb/capitulo-4/introduccion-cap4/busquedas-con-filter
 */
public class Query {

    private String field;
      Comparison operators;
    private Object value;
  
    Logic binary;
    Query query;
    DateQuery dateQuery;

    public Query() {
    }

    public Query(String field, Comparison operators, Object value, Logic binary, Query query, DateQuery dateQuery) {
        this.field = field;
        this.operators = operators;
        this.value = value;
        this.binary = binary;
        this.query = query;
        this.dateQuery = dateQuery;
    }

   
   
   
    public Logic getBinary() {
        return binary;
    }

    public void setBinary(Logic binary) {
        this.binary = binary;
    }

    
    
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

  

   

    public Comparison getOperators() {
        return operators;
    }

    public void setOperators(Comparison operators) {
        this.operators = operators;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }


    public DateQuery getDateQuery() {
        return dateQuery;
    }

    public void setDateQuery(DateQuery dateQuery) {
        this.dateQuery = dateQuery;
    }


    public static class Builder {
   private String field;
    private Object value;
    Comparison operators;
    Logic binary;
    Query query;
    DateQuery dateQuery;

        public Builder field(String field) {
            this.field = field;
            return this;
        }
        
        public Builder value(Object value) {
            this.value = value;
            return this;
        }
        
        
        public Builder operators (Comparison operators) {
            this.operators = operators;
            return this;
        }
        public Builder binary( Logic binary) {
            this.binary = binary;
            return this;
        }
        public Builder query(Query query) {
            this.query = query;
            return this;
        }

        
        public Builder dateQuery(DateQuery dateQuery) {
            this.dateQuery = dateQuery;
            return this;
        }

        public Query build() {
            return new Query(field, operators, value, binary, query, dateQuery);
        }

    }
}
