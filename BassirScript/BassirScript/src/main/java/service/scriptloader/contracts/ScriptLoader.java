/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.scriptloader.contracts;

import models.Script;



/**
 *
 * @author Lenovo
 */
public interface ScriptLoader {
    
    Script script(String adress);
    
    boolean validateFile(String adress);
    
}
