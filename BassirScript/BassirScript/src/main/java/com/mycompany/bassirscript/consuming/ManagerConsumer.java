/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript.consuming;

import com.mycompany.bassirscript.contracts.FileManager;
import com.mycompany.bassirscript.contracts.ManagerProvider;
import com.mycompany.bassirscript.contracts.PrintManager;
import com.mycompany.bassirscript.contracts.ValidationManager;
import com.mycompany.bassirscript.contracts.VariableManager;
import com.mycompany.bassirscript.executioncontext.ExecutionContext;
import com.mycompany.bassirscript.executioncontext.Script;
import java.io.File;

/**
 *
 * @author Bassir
 */
public class ManagerConsumer {
    
    private final ManagerProvider _provider;
    
    public ManagerConsumer(ManagerProvider provider){
        
        _provider = provider;
    }
    
    
    public void execute(String path){
        
        File file = new File(path);
        
        ValidationManager v = new _provider.getValidationManagerSystem();
        FileManager f = new _provider.getFileManagerSystem();
        PrintManager p = new _provider.getPrintManagerSystem();
        VariableManager var = new _provider.getVariableManagerSystem();
        
        ExecutionContext ex = new ExecutionContext();
        Script script = f.readFile(file);
        if(f.validateFile(file)){
            
        }
    
        else{
    
            System.out.println("Invalid File");
            return;
        }
        
        
        String command;
        for(int x=0; x<script.commandList.size(); x++){
        
            command=script.commandList.get(x);
            
            if(v.isCreateCommand(command)){
                
                var.create(command);
            
            }
            else{
                
                if(v.isInitializeCommand(command, ex)){
                    
                    var.initialize(command);
            }
                else{
                        if(v.isPrintCommand(command)){
                        
                            if(p.isPrintText(command)|| p.isPrintVariable(command, ex)){
                            
                               p.print(command, ex);
                            }
                            else{
                                System.out.println("Syntax error in Line "+x);
                            }
                
                        }
                        else{
                            
                            System.out.println("Syntax error in Line "+x);
                        }}
                        
                        
                }
            
        }
    
    }
}
