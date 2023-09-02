/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript;

import com.mycompany.bassirscript.executioncontext.Script;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bassir
 */
public class Reader {
    public Script readFile(String path) throws FileNotFoundException{
        
    Validator validator = new Validator();
    
    if(validator.validateFile(path)){
        List<String> fullText = new ArrayList();
        List<String> commentList = new ArrayList();
        List<String> commandList = new ArrayList();
        File file = new File(path);
        Scanner fReader = new Scanner(file);
        
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
    else{
        return null;
    }
    }
    
}
