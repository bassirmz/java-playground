/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript;

import com.mycompany.bassirscript.executioncontext.ExecutionContext;
import com.mycompany.bassirscript.executioncontext.Script;
import com.mycompany.bassirscript.executioncontext.Variable;
import java.io.FileNotFoundException;

/**
 *
 * @author Bassir
 */
public class Executer {
    
    Reader reader = new Reader();
    ExecutionContext executionContext = new ExecutionContext();
    Validator validator = new Validator();
    
    public void execute(String path) throws FileNotFoundException{
        
        if(reader.readFile(path)!=null){
            
            Script script = reader.readFile(path);
            
            for(int x=0;x<script.commandList.size();x++){
                
                if(validator.isPrintCommand(script.commandList.get(x))){
                    
                    if(validator.isPrintText(script.commandList.get(x))){
                        
                        System.out.println(script.commandList.get(x).substring(7, script.commandList.get(x).length()-1));
                    
                    }
                    else{
                        
                        if(validator.isPrintVariable(script.commandList.get(x), executionContext)){
                        
                            String variableName = null;
                            
                            for (String s : executionContext.variableList.keySet()) {
                                if (script.commandList.get(x).substring(6).equals(s)){
                                      variableName = s;
                                      break;
                                 }
                            }
                        System.out.println(executionContext.variableList.get(variableName).variableValue);
                        }
                    
                            
                            
                        else{
                        
                            System.err.println("Syntax error in line " + (x+1));
                        }
                    }
                
                }
                else{
                    
                    if(validator.isCreateCommand(script.commandList.get(x))){
                        
                        Variable variable = new Variable(script.commandList.get(x).substring(2, script.commandList.get(x).length()));
                        executionContext.variableList.put(variable.variableName, null);
                    
                    }
                    else{
                        
                        if(validator.isInitializeCommand(script.commandList.get(x), executionContext)){
                        
                            String[] nameValue = new String[2];
                            nameValue = script.commandList.get(x).split("=");
                            Variable variable = new Variable(nameValue[0], nameValue[1]);
                            executionContext.variableList.put(nameValue[0], variable);
                        }
                        else{
                        
                            System.err.println("Syntax error in line " + (x+1));
                        }
                    }
                }
            }
        }
    }
    
}
