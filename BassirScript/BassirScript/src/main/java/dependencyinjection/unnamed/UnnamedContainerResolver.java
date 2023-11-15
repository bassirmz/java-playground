/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.unnamed;

import dependencyinjection.ContainerResolverFacade;
import team.unnamed.inject.Injector;

/**
 *
 * @author diego
 */
public class UnnamedContainerResolver implements ContainerResolverFacade {

   private static Injector injector = null;

   private final  team.unnamed.inject.Module module;
   
   
    public UnnamedContainerResolver(team.unnamed.inject.Module module) {
        this.module = module;
    }

    @Override
    public synchronized <TAbstract> TAbstract resolve(Class type) {

        if(injector==null){
            
            injector = Injector.create(module);
        }
        
        
        Object instance = injector.getInstance(type);

        return (TAbstract) instance;
    }

}
