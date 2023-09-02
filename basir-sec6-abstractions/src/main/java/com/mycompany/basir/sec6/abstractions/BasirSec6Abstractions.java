/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basir.sec6.abstractions;

import com.mycompany.basir.sec6.abstractions.consuming.DataConsumer;
import com.mycompany.basir.sec6.abstractions.contracts.DataSystemProvider;
import com.mycompany.basir.sec6.abstractions.inmemory.InMemoryDataSystemProvider;
import com.mycompany.basir.sec6.abstractions.thefile.TheFileDataSystemProvider;

/**
 *
 * @author diego
 */
public class BasirSec6Abstractions {

    public static void main(String[] args) {
        
        
        
        DataSystemProvider provider = new InMemoryDataSystemProvider();
        
        DataConsumer consumer = new DataConsumer(provider);
        
        consumer.doYourShit();
        
    }
}
