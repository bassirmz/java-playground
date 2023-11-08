/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.petite;

import dependencyinjection.ContainerResolverFacade;
import jodd.petite.PetiteContainer;

/**
 *
 * @author diego
 */
public class PetiteContainerResolver implements ContainerResolverFacade{

    
    
    private final PetiteContainer container;

    public PetiteContainerResolver(PetiteContainer container) {
        this.container = container;
    }
    
    
    @Override
    public <TAbstract> TAbstract resolve(Class type) {
        
        Object resolved = this.container.getBean(type);
        
        return (TAbstract) resolved;
    }
    
}
