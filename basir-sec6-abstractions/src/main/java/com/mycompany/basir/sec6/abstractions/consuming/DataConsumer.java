package com.mycompany.basir.sec6.abstractions.consuming;


import com.mycompany.basir.sec6.abstractions.contracts.Connectable;
import com.mycompany.basir.sec6.abstractions.contracts.DataAccess;
import com.mycompany.basir.sec6.abstractions.contracts.DataSystemProvider;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class DataConsumer {
    
    
    private final DataSystemProvider _provider;
    
    public DataConsumer(DataSystemProvider provider){
        
        _provider = provider;
    }
    
    
    public void doYourShit(){
        
        
        Connectable c = _provider.GetConnectable();
        
        c.connect();
        
        if(!c.getStatus()){
        
            System.out.println("Problem connecting to data system.");
            
            return;
        }
        
        DataAccess d = _provider.GetDataAccess();
        
        String message = "This is a test, or is it? @ " + new Date().toString();
        
        d.write(message);
        
        
        String readMessage = d.read();
        
        if(readMessage.equals(message)){
            System.out.println("Data system workd fine.");
        }else{
            System.out.println("Data system did not read the same message.");
        }
        System.out.println("Read: " + readMessage);
        
        c.disconnect();
        
        if(!c.getStatus()){
            System.out.println("Disconnected successfully.");
        }
    }
}
