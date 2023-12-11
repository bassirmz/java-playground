/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brewtime.dataaccess.models;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class BrewingInstructionStg {

    private String title;
    private String description;
    private ArrayList<BrewingStepStg> steps;
    private BrewingGadgetStg brewingMethod;
    private int coffeeAmount;

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(int coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public BrewingGadgetStg getBrewingMethod() {
        return brewingMethod;
    }

    public void setBrewingMethod(BrewingGadgetStg brewingMethod) {
        this.brewingMethod = brewingMethod;
    }

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

    public ArrayList<BrewingStepStg> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<BrewingStepStg> steps) {
        this.steps = steps;
    }

}
