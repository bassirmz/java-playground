/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.command.createcommand;

import service.command.contracts.Command;
import service.command.contracts.CommandProvider;

/**
 *
 * @author Lenovo
 */
public class CreateCommandProvider implements CommandProvider{

    @Override
    public Command getCommand() {
        
        return new CreateCommand();
    }
    
}
