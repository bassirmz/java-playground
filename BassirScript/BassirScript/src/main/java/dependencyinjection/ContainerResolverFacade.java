/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dependencyinjection;

/**
 *
 * @author diego
 */
public interface ContainerResolverFacade {
    
    
    public <TAbstract> TAbstract resolve(Class type);
}
