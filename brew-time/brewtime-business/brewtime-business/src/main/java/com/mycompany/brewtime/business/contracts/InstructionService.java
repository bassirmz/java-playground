/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.brewtime.business.contracts;

import com.mycompany.brewtime.business.models.BrewingInstruction;
import java.util.List;

/**
 *
 * @author diego
 */
public interface InstructionService {
    
    
    List<BrewingInstruction> getAllInstructions();
}
