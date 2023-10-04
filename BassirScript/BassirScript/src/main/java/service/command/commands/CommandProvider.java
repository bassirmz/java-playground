/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.command.commands;

import service.command.contracts.Command;

/**
 *
 * @author Lenovo
 */
public class CommandProvider{
        
    public Command getVariablePrintCommand(){
        
        return new VariablePrintCommand();
    }
    
    public Command getTextPrintCommand(){
    
        return new TextPrintCommand();
    }
    
    public Command getCreateCommand(){
    
        return new CreateCommand();
    }
    
    public Command getInitializeCommand(){
    
        return new InitializeCommand();
    }
    
}
