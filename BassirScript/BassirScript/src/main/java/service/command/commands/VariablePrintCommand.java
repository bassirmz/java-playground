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
class VariablePrintCommand implements Command{

    @Override
    public boolean isMatch(String command, String[] args, ExecutionContext executionContext) {
       
        boolean i = false;
        
        if (command.equals("print") & args[0].equals(":") & args.length == 2){
            for (String s : executionContext.variableList.keySet()) {
                if (args[1].equals(s)){
                    i=true;
                }
            }
        }
        
        return i;
    }

    @Override
    public void execute(String command, String[] args,ExecutionContext executionContext) {
         
        System.out.println(args[1]);
    
    }

    public VariablePrintCommand() {
    }
    
    
}
