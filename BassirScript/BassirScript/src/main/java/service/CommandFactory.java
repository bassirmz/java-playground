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
    private final ExecutionContext _executionContext;
    
    public CommandFactory(CommandProvider commandProvider) {
        
        _provider = commandProvider;
        _executionContext = new ExecutionContext();
    }
    
    public Command make(ScriptLine scriptLine){
    
         
        Command createCommand = _provider.getCreateCommand();
        Command initializeCommand = _provider.getInitializeCommand();
        Command textPrintCommand = _provider.getTextPrintCommand();
        Command variablePrintCommand = _provider.getVariablePrintCommand();
        
        
            if(createCommand.isMatch(scriptLine.command, scriptLine.args, _executionContext)){
                
                return createCommand;
            }
            else{
                if(initializeCommand.isMatch(scriptLine.command, scriptLine.args, _executionContext)){
                    
                    return initializeCommand;
                }
                else{
                    if(variablePrintCommand.isMatch(scriptLine.command, scriptLine.args, _executionContext)){
                        
                        return variablePrintCommand;
                    }
                    else{
                        if(textPrintCommand.isMatch(scriptLine.command, scriptLine.args, _executionContext)){
                            
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
