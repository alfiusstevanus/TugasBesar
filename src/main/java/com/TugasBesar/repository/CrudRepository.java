/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TugasBesar.repository;

import java.util.List;

/**
 *
 * @author Kurnia R. Putra
 * @param <T> Type
 * @param <ID> Identifier
 */
public interface CrudRepository<T, ID> {
    List<T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(int id);
    ID delete(int id);
}
