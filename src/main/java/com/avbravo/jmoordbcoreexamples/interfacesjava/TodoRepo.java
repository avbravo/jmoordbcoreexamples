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
public interface TodoRepo {
    List<Todo> findAll();
	void create(Todo incoming);
	void update(Long id, Todo incoming);
	void remove(Long id);
}
