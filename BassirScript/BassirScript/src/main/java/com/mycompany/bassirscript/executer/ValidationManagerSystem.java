/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript.executer;

import com.mycompany.bassirscript.contracts.ValidationManager;
import com.mycompany.bassirscript.executioncontext.ExecutionContext;

/**
 *
 * @author Bassir
 */
class ValidationManagerSystem implements ValidationManager{

    @Override
    public boolean isCreateCommand(String command) {
        boolean i;
        i = false;

        if(command.startsWith("a ")){
            
        i = true;
        
        for (int x = 2 ; x < command.length() ; x++){
                if (command.charAt(x)==' '){
                    i=false;
                }
            }
        }
        
        return i;
    }

    @Override
    public boolean isInitializeCommand(String command, ExecutionContext executionContext) {
        boolean i =false;
        String variableName = null;
        for (String s : executionContext.variableList.keySet()) {
            if (command.startsWith(s)){
                i=true;
                variableName = s;
            }
        }
        if (i){
            if (command.substring(variableName.length()).startsWith("=")){
            } else {
                i=false;
            }
        }

        return i;
    }

    @Override
    public boolean isPrintCommand(String command) {
        boolean i = false;
        if (command.startsWith("print:")){
            i = true;
        }
        return i;
    }
    
}
