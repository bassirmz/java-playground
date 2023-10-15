/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import models.ExecutionContext;
import models.ScriptLine;
import service.command.commands.CommandProvider;
import service.command.contracts.Command;

/**
 *
 * @author Lenovo
 */
public class CommandFactory {

    
    private final CommandProvider _provider;
    
    public CommandFactory(CommandProvider commandProvider) {
        
        _provider = commandProvider;
    }
    
    public Command make(ScriptLine scriptLine , ExecutionContext executionContext){
    
         
        Command createCommand = _provider.getCreateCommand();
        Command initializeCommand = _provider.getInitializeCommand();
        Command textPrintCommand = _provider.getTextPrintCommand();
        Command variablePrintCommand = _provider.getVariablePrintCommand();
        
        
            if(createCommand.isMatch(scriptLine.command, scriptLine.args, executionContext)){
                
                return createCommand;
            }
            else{
                if(initializeCommand.isMatch(scriptLine.command, scriptLine.args, executionContext)){
                    
                    return initializeCommand;
                }
                else{
                    if(variablePrintCommand.isMatch(scriptLine.command, scriptLine.args, executionContext)){
                        
                        return variablePrintCommand;
                    }
                    else{
                        if(textPrintCommand.isMatch(scriptLine.command, scriptLine.args, executionContext)){
                            
                            return textPrintCommand;
                        }
                        else{
                            System.err.println("Error in line : " + scriptLine.lineNumber);
                            
                            
                        }
                    }
                    
                }
            }
        
        
        return null;
    }
    
}
