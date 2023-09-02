/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript.executer;

import com.mycompany.bassirscript.contracts.FileManager;
import com.mycompany.bassirscript.contracts.ManagerProvider;
import com.mycompany.bassirscript.contracts.PrintManager;
import com.mycompany.bassirscript.contracts.ValidationManager;
import com.mycompany.bassirscript.contracts.VariableManager;

/**
 *
 * @author Bassir
 */
class ManagerProviderSystem  implements ManagerProvider{

    @Override
    public FileManager getFileManager() {
        
        return new FileManagerSystem();
    }

    @Override
    public PrintManager getPrintManager() {
        
        return new PrintManagerSystem();
    }

    @Override
    public ValidationManager getValidationManager() {
        
        return new ValidationManagerSystem();
    }

    @Override
    public VariableManager getVariableManager() {
        
        return new VariableManagerSystem();
    }
    
}
