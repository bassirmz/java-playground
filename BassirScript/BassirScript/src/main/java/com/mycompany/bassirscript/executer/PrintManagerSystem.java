/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript.executer;

import com.mycompany.bassirscript.contracts.PrintManager;
import com.mycompany.bassirscript.executioncontext.ExecutionContext;
import com.mycompany.bassirscript.executioncontext.ExecutionContext;


/**
 *
 * @author Bassir
 */
class PrintManagerSystem implements PrintManager {

    @Override
    public boolean isPrintText(String command) {
        
        boolean i = false;
        
        if(command.charAt(6) == '(' & command.endsWith(")")){
        
            i = true;
        }
     
        return i;
    }

    @Override
    public boolean isPrintVariable(String command, ExecutionContext executionContext) {
        
        boolean i =false;
        
        for (String s : executionContext.variableList.keySet()) {
            if (command.substring(6).equals(s)){
                i=true;
            } 
        }
        return i;
    }

    @Override
    public void print(String command,ExecutionContext executionContext){
        
        if(isPrintText(command)){
        
        System.out.println(command.substring(7, command.length()-1));
        }
        else{
        
            if(isPrintVariable(command, executionContext)){
                
                String variableName = null;
                            
                            for (String s : executionContext.variableList.keySet()) {
                                if (command.substring(6).equals(s)){
                                      variableName = s;
                                      break;
                                 }
                            }
                        System.out.println(executionContext.variableList.get(variableName));
                        
            }
        }
        
    }

}
