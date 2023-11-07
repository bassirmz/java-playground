/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bassirscript;

import java.io.File;
import java.util.Scanner;
import models.ExecutionContext;
import models.Script;
import service.CommandFactory;
import service.ScriptExecuter;
import service.command.commands.CommandProvider;
import service.scriptloader.contracts.ScriptLoader;
import service.scriptloader.contracts.ScriptLoaderProvider;
import service.scriptloader.fromfilescriptloader.FromFileScriptLoaderProvider;

/**
 *
 * @author Lenovo
 */
public class Application {
    
    public void Run(ExecutionContext ec,CommandFactory cf,ScriptExecuter se,ScriptLoaderProvider slp){
    
        System.out.println(new File(".").getAbsoluteFile().getAbsolutePath());
        
        
        System.out.println("Enter adress : ");
        
        Scanner scanner = new Scanner(System.in);
        
        String address = scanner.nextLine();
        
        
        ScriptLoader scriptLoader = slp.getScriptLoader();
        
        if(scriptLoader.validateFile(address)){
            
            Script script = scriptLoader.script(address);
            
            se.execute(script , ec , cf);
        }
        else{
            System.err.println("Invalid File.");
        }
    }
    
    
}
