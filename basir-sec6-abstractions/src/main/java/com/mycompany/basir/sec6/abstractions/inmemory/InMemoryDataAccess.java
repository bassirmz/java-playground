/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basir.sec6.abstractions.inmemory;

import com.mycompany.basir.sec6.abstractions.contracts.DataAccess;

/**
 *
 * @author diego
 */
public class InMemoryDataAccess implements DataAccess{

    @Override
    public String read() {
        return SharedMemoryData._data;
    }

    @Override
    public void write(String data) {
        
        SharedMemoryData._data = data;
    }
    
}
