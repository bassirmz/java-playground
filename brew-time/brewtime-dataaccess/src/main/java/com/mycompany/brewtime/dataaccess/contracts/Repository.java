/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.brewtime.dataaccess.contracts;

import java.util.List;

/**
 *
 * @author diego
 */
public interface Repository<TModel,TId> {
    
    
    TModel create(TModel model);
    
    TModel update(TModel model);
    
    boolean deleteById(TId id);
    
    TModel readById(TId id);
    
    List<TModel> readAll();
    
}
