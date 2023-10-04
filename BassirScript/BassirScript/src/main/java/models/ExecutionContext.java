/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class ExecutionContext {
    
    public Map<String,String> variableList = new HashMap();

    public Map<String, String> getVariableList() {
        return variableList;
    }

    public void setVariableList(Map<String, String> variableList) {
        this.variableList = variableList;
    }
    
    
}
