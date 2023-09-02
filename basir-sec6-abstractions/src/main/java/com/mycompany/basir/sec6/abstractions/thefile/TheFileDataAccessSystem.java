/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basir.sec6.abstractions.thefile;

import com.mycompany.basir.sec6.abstractions.contracts.Connectable;
import com.mycompany.basir.sec6.abstractions.contracts.DataAccess;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
class TheFileDataAccessSystem implements Connectable,DataAccess{

    
    private boolean _connected = false;
    private final File _theFile;
    
    
   public TheFileDataAccessSystem(){
       this._theFile = new File("the.file");
   }
    
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

    @Override
    public String read() {
        
        if(!_theFile.exists()){
            return null;
        }
        
        String content = null;
        try {
            content = Files.readString(_theFile.toPath());
        } catch (Exception ex) {
            Logger.getLogger(TheFileDataAccessSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return content;
    }

    @Override
    public void write(String data) {
        try {

            if(_theFile.exists()){
                _theFile.delete();
            }
            Files.writeString(_theFile.toPath(), data, StandardOpenOption.CREATE);
        } catch (Exception e) {
        }
    }
    
    
    
    
}
