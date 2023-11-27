/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brewtime.business.models;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class BrewingInstruction {
    
    
    private String title;
    private String description;
    private ArrayList<BrewingStep> steps;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<BrewingStep> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<BrewingStep> steps) {
        this.steps = steps;
    }
    
    
    
    
    
}
