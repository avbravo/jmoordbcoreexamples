/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.jmoordbcoreexamples.interfacesjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class TodoImpl implements TodoRepo {

    List<Todo> list = new ArrayList<>();

    @Override
    public List<Todo> findAll() {
        return list;
    }

    @Override
    public void create(Todo incoming) {
        list.add(incoming);
    }

    @Override
    public void update(Long id, Todo incoming) {
        Integer c = 0;
        for (Todo t : list) {
            c++;
            if (t.getId().equals(t)) {
                list.get(c).setDescription(incoming.getDescription());
            }
        }
    }

    @Override
    public void remove(Long id) {
      Integer c = 0;
        for (Todo t : list) {
            c++;
            if (t.getId().equals(t)) {
                list.remove(c);
            }
        }
    }

}
