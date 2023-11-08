/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.petite;

import dependencyinjection.ContainerResolverFacade;
import team.unnamed.inject.Injector;

/**
 *
 * @author diego
 */
public class UnnamedContainerResolver implements ContainerResolverFacade {

    private final Injector injector;

    public UnnamedContainerResolver(Injector injector) {
        this.injector = injector;
    }

    @Override
    public <TAbstract> TAbstract resolve(Class type) {

        Object instance = injector.getInstance(type);

        return (TAbstract) instance;
    }

}
