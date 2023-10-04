package bassirscript;





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
        
        System.out.println("Enter adress : ");
        Scanner scanner = new Scanner(System.in);
        String adress = scanner.nextLine();
        ScriptLoaderProvider _sprovider = new FromFileScriptLoaderProvider();
        
        CommandProvider _cprovider = new CommandProvider();
        
        CommandFactory commandFactory = new CommandFactory(_cprovider);
        
        ScriptLoader scriptLoader = _sprovider.getScriptLoader();
        
        if(scriptLoader.validateFile(adress)){
            Script script = scriptLoader.script(adress);
            commandFactory.execute(script);
        }
        else{
            System.err.println("Invalid File.");
        }
    }

    
}
