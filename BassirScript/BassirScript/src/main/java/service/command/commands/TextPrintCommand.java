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
class TextPrintCommand implements Command{

    @Override
    public boolean isMatch(String command, String[] args, ExecutionContext executionContext) {
        boolean i = false;
        if(command.equals("print") & args[0].equals(":")){
            i = true;
        }
        for (String s : executionContext.variableList.keySet()) {
            if (args[1].equals(s)){
                i=false;
            } 
        }
        
        return i;
    }

    @Override
    public void execute(String command, String[] args,ExecutionContext executionContext) {
        for (int x = 1 ; args[x] != null ; x++) {
            System.out.print(args[x] + " ");
        }
        
        System.out.println("");
    }
    
}
