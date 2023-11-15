package bassirscript;


import dependencyinjection.ContainerFacadeProvider;
import dependencyinjection.ContainerRegistererFacade;
import dependencyinjection.ContainerResolverFacade;
import dependencyinjection.myoc.MyocProvider;
import dependencyinjection.unnamed.UnNamedContainerProvider;
import service.A;
import service.AImpl;
import service.CommandFactory;
import service.ScriptExecuter;
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
        
        
        ContainerFacadeProvider container = new MyocProvider();
        
        ContainerRegistererFacade registry = container.getRegistry();
        
        registry.register(CommandFactory.class,CommandFactory.class);
        
        registry.register(ScriptLoaderProvider.class,FromFileScriptLoaderProvider.class);
        
        registry.register(CommandProvider.class,CommandProvider.class);
        
        registry.register(ScriptExecuter.class,ScriptExecuter.class);
        
        registry.register(Application.class,Application.class);        
        
        ContainerResolverFacade resolver = container.getResolver();
        
        Application app = resolver.resolve(Application.class);
                     
        app.Run();

          
    }

    
}
