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
public class TodoServices {
    TodoRepo todoRepo;
    
    public List<Todo> getAll() {
		return todoRepo.findAll();
	}
    public void create(Todo todo) {
		 todoRepo.create(todo);
	}
}
