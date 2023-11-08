/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.petite;

import dependencyinjection.ContainerRegistererFacade;
import jodd.petite.PetiteContainer;
import jodd.petite.PetiteRegistry;

/**
 *
 * @author diego
 */
public class PetiteContaienrRegistry implements ContainerRegistererFacade {

    private static PetiteRegistry registry;
    private static final Object locker = new Object();
    
    
    public PetiteContaienrRegistry(PetiteContainer pc) {

        synchronized (locker) {
            
            if (registry == null) {
                    registry = pc.createContainerRegistry();
            }
        }

    }

    @Override
    public void register(Class resolvee, Class resolved) {

        this.register(resolvee, resolved);
    }

}
