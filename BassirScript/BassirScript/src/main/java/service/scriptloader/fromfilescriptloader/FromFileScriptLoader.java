/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.scriptloader.fromfilescriptloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Script;
import models.ScriptLine;
import service.scriptloader.contracts.ScriptLoader;

/**
 *
 * @author Lenovo
 */
class FromFileScriptLoader implements ScriptLoader{

    

    @Override
    public Script script(String adress){
        
        File file = new File(adress);
        
        ArrayList<ScriptLine> scriptLines = new ArrayList<ScriptLine>();
        
        Scanner fReader = null;
        
        ArrayList<String> comments = new ArrayList<String>();
        
        try {
            fReader = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FromFileScriptLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        for(int number = 1 ;fReader.hasNext();number++){
            String line = fReader.nextLine();
            if(line.startsWith("//")){
                comments.add(line);
                number--;
            }
            else{
                
            String[] fullArgs = new String[line.split(" ").length];
            
            fullArgs = line.split(" ");
            
            String command = fullArgs[0];
            
            command.trim();
            
            String[] args = new String[line.split(" ").length];
            
            for (int x = 1; x < fullArgs.length ; x++) {
                args[x-1] = fullArgs[x];
            }
            
            for (int x = 0 ; args[x] != null ; x++) {
                args[x].trim();
            }
            
            ScriptLine scriptline = new ScriptLine(number, command, args);
            
            scriptLines.add(scriptline);
            }
            
        }
        
        Script script = new Script(file,scriptLines,comments);
        
        return script;
    }

    @Override
    public boolean validateFile(String adress) {
        
        File file = new File(adress);
        
        if(file.exists() & file.getName().endsWith(".bsr")){
            return true;
        }
        else {
           
            return false;
        }
    }
    
    
    
}
