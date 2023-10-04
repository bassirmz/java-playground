/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.command.contracts;

import models.ExecutionContext;

/**
 *
 * @author Lenovo
 */
public interface Command {
    
    public boolean isMatch(String command,String[] args,ExecutionContext executionContext);
    
    public void execute(String command, String[] args,ExecutionContext executionContext);
}
