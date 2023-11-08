/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.petite;

import dependencyinjection.ContainerRegistererFacade;
import java.util.HashMap;
import java.util.Map;
import team.unnamed.inject.Binder;

/**
 *
 * @author diego
 */
public class UnnamedModule implements team.unnamed.inject.Module,
        ContainerRegistererFacade{

    
    private static final HashMap<Class,Class> typesDictionary = new HashMap<>();
    
    
    @Override
    public void configure(Binder binder) {
        
        typesDictionary.forEach((e,r) -> binder.bind(e).to(r));
    }

    @Override
    public void register(Class resolvee, Class resolved) {
        
        this.typesDictionary.put(resolvee, resolved);
    }
    
}
