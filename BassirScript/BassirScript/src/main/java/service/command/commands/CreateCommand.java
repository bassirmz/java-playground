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
class CreateCommand implements Command{

    @Override
    public boolean isMatch(String command, String[] args , ExecutionContext executionContext) {
            
        boolean i = false;
        if("a".equals(command) & args.length == 1){
            i = true;
        }
        
        return i;
    }

    @Override
    public void execute(String command, String[] args,ExecutionContext executionContext) {

        executionContext.variableList.put(args[0], null);
    }

    public CreateCommand() {
    }
    
    
    
}
