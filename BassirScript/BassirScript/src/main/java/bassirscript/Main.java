package bassirscript;





import dependencyinjection.ContainerRegistererFacade;
import dependencyinjection.ContainerResolverFacade;
import java.io.File;
import java.util.Scanner;
import models.ExecutionContext;
import models.Script;
import service.scriptloader.contracts.ScriptLoader;
import service.ScriptExecuter;
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
        
        ContainerRegistererFacade containerRegistererFacade;
        
        ContainerResolverFacade containerResolverFacade;
        
        containerRegistererFacade.register(ExecutionContext , ExecutionContext);
    }

    
}
