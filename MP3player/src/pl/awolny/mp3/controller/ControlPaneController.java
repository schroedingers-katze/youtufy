package pl.awolny.mp3.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;


public class ControlPaneController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button nextButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button prevButton;

    @FXML
    private Slider songSlider;

    @FXML
    private Slider volumeSlider;



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		configureSliders();
		configureButtons();
	}
    private void configureSliders() {
        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("Zmiana g�o�no�ci " + newValue.doubleValue());
            }
        });

        songSlider.valueProperty().addListener(x -> System.out.println("Przesuni�cie piosenki"));
    }

    private void configureButtons() {
        prevButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Poprzednia piosenka");
            }
        });
        nextButton.setOnAction(x -> System.out.println("Nast�pna piosenka"));
        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(playButton.isSelected()) {
                    System.out.println("Play");
                } else {
                    System.out.println("Stop");
                }
            }
        });
    }
}