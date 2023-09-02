/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bassirscript.contracts;

import com.mycompany.bassirscript.executioncontext.Script;
import java.io.File;

/**
 *
 * @author Bassir
 */
public interface FileManager {
   
    public boolean validateFile(File file);
    
    public Script readFile(File file);
    
}
