package com.example.assignment2;

public class Car {

    /**
     * Declaring variables
     */
    public String colour;
    public int year;
    public String make;
    public String model;
    public String transmission;
    public Engine engine;

    /**
     * Default costructor for Car with set methods, references 2nd model class of Engine
     * @param colour
     * @param year
     * @param make
     * @param model
     * @param transmission
     * @param engine
     */
    public Car(String colour, int year, String make, String model, String transmission, Engine engine) {
        setColour(colour);
        setYear(year);
        setMake(make);
        setModel(model);
        setTransmission(transmission);
        this.engine = engine;
    }

    /**
     * Set method for colour assigned to itself
     * @param carColour
     */
    public void setColour(String carColour) {
        this.colour = carColour;
    }

    /**
     * Get method for colour will return the colour
     * @return
     */
    public String getColour() {
        return colour;
    }

    /**
     * Set method for year assigned to itself
     * @param carYear
     */
    public void setYear(int carYear) {
        this.year = carYear;
    }

    /**
     * Get method for year will return the year
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * Set method for make assigned to itself
     * @param carMake
     */
    public void setMake(String carMake) {
        this.make = carMake;
    }

    /**
     * Get method for make will return the make
     * @return
     */
    public String getMake() {
        return make;
    }

    /**
     * Set method for model assigned to itself
     * @param carModel
     */
    public void setModel(String carModel) {
        this.model = carModel;
    }

    /**
     * Get method for model will return the model
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Set method for transmission assigned to itself
     * @param carTransmission
     */
    public void setTransmission(String carTransmission) {
        this.transmission = carTransmission;
    }

    /**
     * Get method for transmission will return the transmission type
     * @return
     */
    public String getTransmission() {
        return transmission;
    }
}