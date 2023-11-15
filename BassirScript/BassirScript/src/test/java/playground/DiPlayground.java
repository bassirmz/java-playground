/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playground;

import playground.services.A;
import playground.services.AImpl;
import team.unnamed.inject.Binder;
import team.unnamed.inject.Injector;

/**
 *
 * @author diego
 */
public class DiPlayground {
    
    
    
    
    
    private static class TestModule  implements team.unnamed.inject.Module{

        @Override
        public void configure(Binder binder) {
            binder.bind(A.class).to(AImpl.class);
                    
        }
        
    }
    
    public static void main(String[] args){
        
        Injector injector = Injector.create(new TestModule());
        
        
        A a = injector.getInstance(A.class);
        
        
        a.Introduce();
    }
}
