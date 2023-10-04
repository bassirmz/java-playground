/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.command.commands;

import models.ExecutionContext;
import service.command.contracts.Command;

/**
 *
 * @author Lenovo
 */
class InitializeCommand implements Command{

    
    @Override
    public boolean isMatch(String command, String[] args ,ExecutionContext executionContext) {
        
        boolean i =false;
        
        for (String s : executionContext.variableList.keySet()) {
            if (command.equals(s)){
                i=true;
            }
        }
        if(args[0].equals("=")){}
        else{
            i = false;
        }
        
        return i;
    }

    @Override
    public void execute(String command, String[] args,ExecutionContext executionContext) {
        
        String Value = null;
        for(int x = 1 ; x < args.length ; x++){
            Value.concat(args[x]);
            Value.concat(" ");
        }
        Value.substring(0, Value.length());
        
        executionContext.variableList.put(command, Value);
    }

    public InitializeCommand() {
    }
    
    
    
}
