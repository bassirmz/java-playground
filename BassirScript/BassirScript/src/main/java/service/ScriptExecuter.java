/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import models.ExecutionContext;
import models.Script;
import models.ScriptLine;
import service.command.contracts.Command;

/**
 *
 * @author diego
 */
public class ScriptExecuter {
    
    public void execute(Script script,ExecutionContext executionContext,CommandFactory commandFactory){
    
        for(ScriptLine scriptLine : script.getScriptLines()){
            
            
            Command command = commandFactory.make(scriptLine,executionContext);
            
            if(command != null){
             
                command.execute(scriptLine.command, scriptLine.args, executionContext);
            }
            else{
            
                System.out.println(scriptLine.command + " not found in Line!");
            }
            
        }
    }
    
}
