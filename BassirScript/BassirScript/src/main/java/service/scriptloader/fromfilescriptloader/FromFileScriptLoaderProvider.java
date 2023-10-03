/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.scriptloader.fromfilescriptloader;

import service.scriptloader.contracts.ScriptLoader;
import service.scriptloader.contracts.ScriptLoaderProvider;

/**
 *
 * @author Lenovo
 */
public class FromFileScriptLoaderProvider implements ScriptLoaderProvider{

    @Override
    public ScriptLoader getScriptLoader() {
        
        return new FromFileScriptLoader();
    }
    
}
