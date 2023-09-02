/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bassirscript.executioncontext;

/**
 *
 * @author Bassir
 */
public class Variable {
    public String variableName;
    public String variableValue;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    public Variable(String variableName) {
        this.variableName = variableName;
    }

    public Variable(String variableName, String variableValue) {
        this.variableName = variableName;
        this.variableValue = variableValue;
    }
    
    
}
