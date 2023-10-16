package com.example.assignment2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class CarController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    private int index;
    @FXML
    private Button nextButton;

    @FXML
    private ImageView carImage;

    @FXML
    private Label colourLabel;

    @FXML
    private Label yearLabel;

    @FXML
    private Label makeLabel;

    @FXML
    private Label modelLabel;

    @FXML
    private Label transmissionLabel;

    @FXML
    private Label engineLabel;

    @FXML
    private ListView<Car> carListView;

    @FXML
    private TextField addCarColour;

    @FXML
    private TextField addCarYear;

    @FXML
    private TextField addCarMake;

    @FXML
    private TextField addCarModel;

    @FXML
    private TextField addCarTransmission;

    @FXML
    private TextField addEngineCode;

    @FXML
    private TextField addHorsepower;

    @FXML
    private TextField addTorque;

    @FXML
    private TextField addCylinders;

    @FXML
    private TextField addLitres;

    @FXML
    private Label addCarColourLabel;

    @FXML
    private Label addCarYearLabel;

    @FXML
    private Label addCarMakeLabel;

    @FXML
    private Label addCarModelLabel;

    @FXML
    private Label addCarTransmissionLabel;

    @FXML
    private Label addEngineCodeLabel;

    @FXML
    private Label addHorsepowerLabel;

    @FXML
    private Label addTorqueLabel;

    @FXML
    private Label addCylindersLabel;

    @FXML
    private Label addLitresLabel;

    private String colour;

    private int year;

    private String make;

    private String model;

    private String transmission;

    public String selectedCar;

    public String newEngineCode;

    public int newHorsepower;

    public int newTorque;

    public int newNumberOfCylinders;

    public double newNumberOfLitres;

    Engine engine;

    /**
     * Create list of Cars
     */
    List<Car> carsList = new ArrayList<Car>();
    List<String> carModelList = new ArrayList<String>();

    /**
     * Assign values to the labels
     * @param carColour
     * @param carYear
     * @param carMake
     * @param carModel
     * @param carTransmission
     * @param engine
     */
    private void assignLabels(String carColour, int carYear, String carMake, String carModel, String carTransmission, Engine engine) {
        colourLabel.setText("Colour: " + carColour);
        yearLabel.setText("Year: " + carYear);
        makeLabel.setText("Make: " + carMake);
        modelLabel.setText("Model: " + carModel);
        transmissionLabel.setText("Transmission: " + carTransmission);
        engineLabel.setText("Engine: " + engine.getEngineCode() + "\n" + "Horsepower: " + engine.getHorsepower() + "hp\n" + "Torque: " + engine.getTorque() + "lbs\n" + "Cylinders: " + engine.getNumberOfCylinders() + " cylinders\n" + "Capacity: " + engine.getNumberOfLitres() + "L");
        carImage.getClass().getResourceAsStream("images/crx.jpg");

    }

    /**
     * Declaring engine and car objects
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ArrayList<Car> cars = new ArrayList<>();
        Engine honda = new Engine("B18C1", 200, 111, 4, 1.8);
        Engine nissan = new Engine("KA24DE", 150, 153, 4, 2.4);
        Engine n54 = new Engine("N54", 335, 300, 6, 3.0);
        Car crx = new Car("Black", 1987, "Honda", "CRX", "Manual", honda);
        Car twofourty = new Car("White", 1992, "Nissan", "240sx", "Manual", nissan);
        Car bmw = new Car("Red", 2009, "BMW", "135i", "Manual", n54);
        cars.add(crx);
        cars.add(twofourty);
        cars.add(bmw);

        /**
         * Declaring what values the list should display in the ListView
         */
        for(Car car : carsList)
        {
            carModelList.add(car.getModel());
        }
        carListView.getItems().addAll(cars);

        /**
         * Make list interactive
         */
        carListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, carSelected) -> {
            assignLabels(carSelected.getColour(),carSelected.getYear(),carSelected.getMake(),carSelected.getModel(),carSelected.getTransmission(),carSelected.engine);
        });

    }

    @FXML
    Image changeImage(ActionEvent event) {
        Image carImage = new Image(getClass().getResourceAsStream("images/crx.jpg"));
        return new Image(Car.class.getResourceAsStream("images/crx.jpg"));
    }

    /**
     * Method for user's car to be added to ListView when addCarButton is clicked and parameters are filled out
     * @param event
     */
    @FXML
    void addCarButton(ActionEvent event) {
        String carColour = addCarColour.getText();
        int carYear = Integer.parseInt(addCarYear.getText());
        String carMake = addCarMake.getText();
        String carModel = addCarModel.getText();
        String carTransmission = addCarTransmission.getText();
        String newEngineCode = addEngineCode.getText();
        int newHorsepower = Integer.parseInt(addHorsepower.getText());
        int newTorque = Integer.parseInt(addTorque.getText());
        int newCylinders = Integer.parseInt(addCylinders.getText());
        double newLitres = Double.parseDouble(addLitres.getText());

        /**
         * Declaring newEngine for user to input their own Car with Engine parameters
         */
        Engine newEngine = new Engine(newEngineCode, newHorsepower, newTorque, newCylinders, newLitres);

        /**
         * Add user's car to the ListView
         */
        try {
            Car newCar = new Car(carColour, carYear, carMake, carModel, carTransmission, newEngine);
            carListView.getItems().add(newCar);
        } catch (IllegalArgumentException e) {
        }
    }
}

