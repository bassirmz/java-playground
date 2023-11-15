/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playground;

import dependencyinjection.ContainerRegistererFacade;
import dependencyinjection.ContainerResolverFacade;
import dependencyinjection.petite.UnNamedContainerProvider;
import playground.services.A;
import playground.services.AImpl;

/**
 *
 * @author diego
 */
public class DiFacadePlayground {
    
    
    
    public static void main(String[] args) {
        
        UnNamedContainerProvider diProvider = new UnNamedContainerProvider();
        
        ContainerRegistererFacade registrer = diProvider.getRegistry();
        
        ContainerResolverFacade resolver = diProvider.getResolver();
        
        registrer.register(A.class, AImpl.class);
        
        A a = resolver.resolve(A.class);
        
        a.Introduce();
        
    }
}
