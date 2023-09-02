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
public interface ValidationManager {
    
    public boolean isCreateCommand(String command);
    
    public boolean isInitializeCommand(String command , ExecutionContext executionContext);
    
    public boolean isPrintCommand(String command);
    
}
