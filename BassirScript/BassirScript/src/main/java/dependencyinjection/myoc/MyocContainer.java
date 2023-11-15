/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.myoc;

import com.acidmanic.utility.myoccontainer.Resolver;
import dependencyinjection.ContainerRegistererFacade;
import dependencyinjection.ContainerResolverFacade;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class MyocContainer implements ContainerResolverFacade,ContainerRegistererFacade{

    
    private final Resolver resolver = new Resolver();
    
    
    @Override
    public <TAbstract> TAbstract resolve(Class type) {
        
        try {
            return resolver.resolve(type);
        } catch (Exception ex) {
            Logger.getLogger(MyocContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public void register(Class resolvee, Class resolved) {
        
        resolver.getRegistery().register(resolvee, resolved);
    }
    
}
