/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript;

import com.mycompany.bassirscript.consuming.ManagerConsumer;
import com.mycompany.bassirscript.contracts.ManagerProvider;
import com.mycompany.bassirscript.contracts.ManagerProvider;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Bassir
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        
        
        ManagerProvider provider = new ManagerProviderSystem();
        ManagerConsumer consumer = new ManagerConsumer(provider);
    }
    
}
