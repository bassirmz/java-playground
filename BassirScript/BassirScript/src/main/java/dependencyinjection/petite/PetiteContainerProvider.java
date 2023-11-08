/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.petite;

import dependencyinjection.ContainerFacadeProvider;
import dependencyinjection.ContainerRegistererFacade;
import dependencyinjection.ContainerResolverFacade;
import jodd.petite.PetiteContainer;

/**
 *
 * @author diego
 */
public class PetiteContainerProvider implements ContainerFacadeProvider{

    
    private static final PetiteContainer PetiteContainer = new PetiteContainer();
    
    private static final PetiteContaienrRegistry Registry = new PetiteContaienrRegistry(PetiteContainer);
    
    private static final PetiteContainerResolver Resolver = new PetiteContainerResolver(PetiteContainer);
    
    
    @Override
    public ContainerRegistererFacade getRegistry() {
        
        return Registry;
    }

    @Override
    public ContainerResolverFacade getResolver() {
        
        return Resolver;
    }
    
}
