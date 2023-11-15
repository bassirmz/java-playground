/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjection.unnamed;

import dependencyinjection.ContainerRegistererFacade;
import java.util.HashMap;
import java.util.Map;
import team.unnamed.inject.Binder;
import team.unnamed.inject.Injector;

/**
 *
 * @author diego
 */
public class UnnamedModule implements team.unnamed.inject.Module,
        ContainerRegistererFacade {

    private static final HashMap<Class, Class> typesDictionary = new HashMap<>();

    @Override
    public void configure(Binder binder) {

        for (Class e : typesDictionary.keySet()) {

            Class r = typesDictionary.get(e);

            if (e.getName() == r.getName()) {
                binder.bind(e);
            } else {
                binder.bind(e).to(r);
            }

        }
    }

    @Override
    public void register(Class resolvee, Class resolved) {

        this.typesDictionary.put(resolvee, resolved);
    }

}
