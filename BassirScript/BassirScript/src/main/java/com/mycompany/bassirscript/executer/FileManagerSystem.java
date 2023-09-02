/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript.executer;

import com.mycompany.bassirscript.contracts.FileManager;
import com.mycompany.bassirscript.executioncontext.Script;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Bassir
 */
class FileManagerSystem implements FileManager{
    
    
    

    @Override
    public boolean validateFile(File file) {
        
        if(file.exists() & file.getName().endsWith(".bsr")){
            return true;
        }
        else {
           
            return false;
        }
        
    }

    @Override
    public Script readFile(File file) {
        
        List<String> fullText = new ArrayList();
        List<String> commentList = new ArrayList();
        List<String> commandList = new ArrayList();
        Scanner fReader = null;
        try {
            fReader = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManagerSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (fReader.hasNext())
            fullText.add(fReader.nextLine());
        
        for (int n=0 ; n<fullText.size() ; n++) {
            if (fullText.get(n).startsWith("//"))
                commentList.add(fullText.get(n));
            else
                commandList.add(fullText.get(n));
        }
        
        Script script = new Script(commentList,commandList);
        return script;
    
    }
    
    
    
}
