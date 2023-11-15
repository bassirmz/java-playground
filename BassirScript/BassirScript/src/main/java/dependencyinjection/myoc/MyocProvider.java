/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.myoc;

import dependencyinjection.ContainerFacadeProvider;
import dependencyinjection.ContainerRegistererFacade;
import dependencyinjection.ContainerResolverFacade;

/**
 *
 * @author diego
 */
public class MyocProvider implements ContainerFacadeProvider{
    
    
    private static final MyocContainer myocContainer = new MyocContainer();

    @Override
    public ContainerRegistererFacade getRegistry() {
        
        
        return myocContainer;
    }

    @Override
    public ContainerResolverFacade getResolver() {
        
        return myocContainer;
    }
    
    
    
    
}
