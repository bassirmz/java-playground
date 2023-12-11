/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.brewtime.dataaccess.contracts;

import com.mycompany.brewtime.dataaccess.models.BrewingStepStg;
import java.util.List;

/**
 *
 * @author diego
 */
public interface BrewingStepsRepository extends Repository<BrewingStepStg,Long>{
    
    
    List<BrewingStepStg> readBrewingStepByBrewingInstructionId(long id);
}
