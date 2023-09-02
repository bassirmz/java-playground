/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bassirscript.contracts;

/**
 *
 * @author Bassir
 */
public interface ManagerProvider {
    
    FileManager getFileManager();
    
    PrintManager getPrintManager();
    
    ValidationManager getValidationManager();
    
    VariableManager getVariableManager();
}
