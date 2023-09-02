/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basir.sec6.abstractions.inmemory;

import com.mycompany.basir.sec6.abstractions.contracts.Connectable;

/**
 *
 * @author diego
 */
class InMemoryConnectable implements Connectable{

    private boolean _connected = false;
    
    @Override
    public void connect() {
        _connected = true;
    }

    @Override
    public void disconnect() {
        _connected = false;
    }

    @Override
    public boolean getStatus() {
        return _connected;
    }
    
}
