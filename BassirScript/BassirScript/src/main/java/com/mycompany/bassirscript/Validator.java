/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript;

import com.mycompany.bassirscript.executioncontext.ExecutionContext;
import java.io.File;

/**
 *
 * @author Bassir
 */
public class Validator {
    public boolean validateFile(String path){

        File file = new File(path);

        if(file.exists() & file.getName().endsWith(".bsr")){
            return true;
        }
        else {
            System.err.println("Invalid File!");
            return false;
        }

    }
    public boolean isCreateCommand(String command){
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

    public boolean isInitializeCommand(String command , ExecutionContext executionContext){
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

    public boolean isPrintCommand(String command){
        boolean i = false;
        if (command.startsWith("print:")){
            i = true;
        }
        return i;
    }
    
    public boolean isPrintText(String command){
    
        boolean i = false;
        
        if(command.charAt(6) == '(' & command.endsWith(")")){
        
            i = true;
        }
     
        return i;
    }
    
    public boolean isPrintVariable(String command,ExecutionContext executionContext){
    
        boolean i =false;
        
        for (String s : executionContext.variableList.keySet()) {
            if (command.substring(6).equals(s)){
                i=true;
            } 
        }
        return i;
    }
    
}
