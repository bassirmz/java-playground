/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import models.ExecutionContext;
import models.Script;
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
    
    public void execute(Script script){
    
         
        Command createCommand = _provider.getCreateCommand();
        Command initializeCommand = _provider.getInitializeCommand();
        Command textPrintCommand = _provider.getTextPrintCommand();
        Command variablePrintCommand = _provider.getVariablePrintCommand();
        
        for(int x = 0;x < script.getScriptLines().size();x++){
            if(createCommand.isMatch(script.getScriptLines().get(x).command, script.getScriptLines().get(x).args, _executionContext)){
                createCommand.execute(script.getScriptLines().get(x).command, script.getScriptLines().get(x).args, _executionContext);
            }
            else{
                if(initializeCommand.isMatch(script.getScriptLines().get(x).command, script.getScriptLines().get(x).args, _executionContext)){
                    initializeCommand.execute(script.getScriptLines().get(x).command, script.getScriptLines().get(x).args, _executionContext);
                }
                else{
                    if(textPrintCommand.isMatch(script.getScriptLines().get(x).command, script.getScriptLines().get(x).args, _executionContext)){
                        textPrintCommand.execute(script.getScriptLines().get(x).command, script.getScriptLines().get(x).args, _executionContext);
                    }
                    else{
                        if(variablePrintCommand.isMatch(script.getScriptLines().get(x).command, script.getScriptLines().get(x).args, _executionContext)){
                            variablePrintCommand.execute(script.getScriptLines().get(x).command, script.getScriptLines().get(x).args, _executionContext);
                        }
                        else{
                            System.err.println("Error in line : " + script.getScriptLines().get(x).lineNumber);
                        }
                    }
                    
                }
            }
        }
    }
    
}
