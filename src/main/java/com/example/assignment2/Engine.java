package com.example.assignment2;

public class Engine {
    /**
     * Declaring variables
     */
    private String engineCode;
    private int horsepower;
    private int torque;
    private int numberOfCylinders;
    private double numberOfLitres;

    /**
     * Engine constructor with set methods
     * @param engineCode
     * @param horsepower
     * @param torque
     * @param numberOfCylinders
     * @param numberOfLitres
     */
    public Engine(String engineCode, int horsepower, int torque, int numberOfCylinders, double numberOfLitres) {
        setEngineCode(engineCode);
        setHorsepower(horsepower);
        setTorque(torque);
        setNumberOfCylinders(numberOfCylinders);
        setNumberOfLitres(numberOfLitres);
    }

    /**
     * Set method for engineCode assigned to itself
     * @param carEngineCode
     */
    public void setEngineCode(String carEngineCode) {
        this.engineCode = carEngineCode;
    }

    /**
     * Get method for engineCode with return the engine code
     * @return
     */
    public String getEngineCode() {
        return engineCode;
    }

    /**
     * Set method for horsepower assigned to itself
     * @param carHorsepower
     */
    public void setHorsepower(int carHorsepower) {
        this.horsepower = carHorsepower;
    }

    /**
     * Get method for horsepower with return the horsepower
     * @return
     */
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * Set method for torque assigned to itself
     * @param carTorque
     */
    public void setTorque(int carTorque) {
        this.torque = carTorque;
    }

    /**
     * Get method for torque with return the torque
     * @return
     */
    public int getTorque() {
        return torque;
    }

    /**
     * Set method for numberOfCylinders assigned to itself
     * @param carNumberOfCylinders
     */
    public void setNumberOfCylinders(int carNumberOfCylinders) {
        this.numberOfCylinders = carNumberOfCylinders;
    }

    /**
     * Get method for numberOfCylinders with return the number of cylinders
     * @return
     */
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    /**
     * Set method for numberOfLitres assigned to itself
     * @param carNumberOfLitres
     */
    public void setNumberOfLitres(double carNumberOfLitres) {
        this.numberOfLitres = carNumberOfLitres;
    }

    /**
     * Get method for numberOfLitres with return the number of litres
     * @return
     */
    public double getNumberOfLitres() {
        return numberOfLitres;
    }
}
