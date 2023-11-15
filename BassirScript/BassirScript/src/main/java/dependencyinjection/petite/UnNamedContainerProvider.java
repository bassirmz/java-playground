/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.petite;

import dependencyinjection.ContainerFacadeProvider;
import dependencyinjection.ContainerRegistererFacade;
import dependencyinjection.ContainerResolverFacade;
import team.unnamed.inject.Injector;

/**
 *
 * @author diego
 */
public class UnNamedContainerProvider implements ContainerFacadeProvider{

    
    private static final UnnamedModule Module = new UnnamedModule();
    
   
    
    
    @Override
    public ContainerRegistererFacade getRegistry() {
        
        return Module;
    }

    @Override
    public synchronized ContainerResolverFacade getResolver() {

        
        return new UnnamedContainerResolver(Module);
    }
    
}
