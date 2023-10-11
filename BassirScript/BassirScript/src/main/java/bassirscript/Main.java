package bassirscript;





import java.io.File;
import java.util.Scanner;
import models.Script;
import service.scriptloader.contracts.ScriptLoader;
import service.CommandFactory;
import service.command.commands.CommandProvider;
import service.scriptloader.fromfilescriptloader.FromFileScriptLoaderProvider;
import service.scriptloader.contracts.ScriptLoaderProvider;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(new File(".").getAbsoluteFile().getAbsolutePath());
        
        
        System.out.println("Enter adress : ");
        
        Scanner scanner = new Scanner(System.in);
        
        String address = scanner.nextLine();
        
        CommandProvider _cprovider = new CommandProvider();
        
        CommandFactory commandFactory = new CommandFactory(_cprovider);
        
        ScriptLoaderProvider _sprovider = new FromFileScriptLoaderProvider();
        
        ScriptLoader scriptLoader = _sprovider.getScriptLoader();
        
        if(scriptLoader.validateFile(address)){
            
            Script script = scriptLoader.script(address);
            
            commandFactory.execute(script);
        }
        else{
            System.err.println("Invalid File.");
        }
    }

    
}
