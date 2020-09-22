/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbcoreexamples.interfacesjava;

import java.util.List;

/**
 *
 * @author avbravo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TodoServices todoServices = new TodoServices();
        Todo todo = new Todo(Long.MIN_VALUE,"hola");
        todoServices.create(todo);
        List<Todo> list =todoServices.getAll();
        for(Todo l:list){
            System.out.println("id "+l.getId() + " descripcion  "+l.getDescription());
        }
        
    }
    
}
