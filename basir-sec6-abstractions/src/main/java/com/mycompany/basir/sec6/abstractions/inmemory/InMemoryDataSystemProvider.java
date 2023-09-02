/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basir.sec6.abstractions.inmemory;

import com.mycompany.basir.sec6.abstractions.contracts.Connectable;
import com.mycompany.basir.sec6.abstractions.contracts.DataAccess;
import com.mycompany.basir.sec6.abstractions.contracts.DataSystemProvider;

/**
 *
 * @author diego
 */
public class InMemoryDataSystemProvider implements DataSystemProvider{

    @Override
    public Connectable GetConnectable() {
        return new InMemoryConnectable();
    }

    @Override
    public DataAccess GetDataAccess() {
        return new InMemoryDataAccess();
    }
    
}
