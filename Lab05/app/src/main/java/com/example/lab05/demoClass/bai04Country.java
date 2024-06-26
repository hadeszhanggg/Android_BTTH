package com.example.lab05.demoClass;

public class bai04Country {
    private String countryName;
    // Image name (Without extension)
    private String flagName;
    private int population;
    public bai04Country(String countryName, String flagName, int population) {
        this.countryName= countryName;
        this.flagName= flagName;
        this.population= population;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getFlagName() {
        return flagName;
    }
    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }
    @Override
    public String toString() {
        return this.countryName+" (Population: "+ this.population+")";
    }
}
