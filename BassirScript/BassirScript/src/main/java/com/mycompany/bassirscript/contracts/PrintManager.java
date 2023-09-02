/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bassirscript.contracts;

import com.mycompany.bassirscript.executioncontext.ExecutionContext;

/**
 *
 * @author Bassir
 */
public interface PrintManager {
    
    public boolean isPrintText(String command);
    
    public boolean isPrintVariable(String command,ExecutionContext executionContext);
    
    public void print(String command ,ExecutionContext executionContext);
    
    
}
