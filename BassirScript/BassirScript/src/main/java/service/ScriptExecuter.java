/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import models.ExecutionContext;
import models.Script;
import models.ScriptLine;
import service.command.commands.CommandProvider;
import service.command.contracts.Command;

/**
 *
 * @author diego
 */
public class ScriptExecuter {
    
    public void execute(Script script){
        
        ExecutionContext executionContext = new ExecutionContext();
        
        CommandProvider _cprovider = new CommandProvider();
        
        CommandFactory commandFactory = new CommandFactory(_cprovider);
        
        for(ScriptLine scriptLine : script.getScriptLines()){
            
            System.out.println(scriptLine.command);
            
            Command command = commandFactory.make(scriptLine);
            
            if(command != null){
             
                command.execute(scriptLine.command, scriptLine.args, executionContext);
            }
            else{
            
                System.out.println(scriptLine.command + " not found in Line!");
            }
            
        }
    }
    
}
