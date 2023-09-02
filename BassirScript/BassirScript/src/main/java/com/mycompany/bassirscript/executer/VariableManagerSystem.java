/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript.executer;

import com.mycompany.bassirscript.contracts.VariableManager;
import com.mycompany.bassirscript.executioncontext.ExecutionContext;
import com.mycompany.bassirscript.executioncontext.Variable;

/**
 *
 * @author Bassir
 */
class VariableManagerSystem implements VariableManager{

    @Override
    public void initialize(String command) {
        
    }

    @Override
    public void create(String command) {
        Variable variable = new Variable(command.substring(2,command.length()));
                        ExecutionContext.variableList.put(variable.variableName, null);
    }
    
}
