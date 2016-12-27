package pl.awolny.mp3.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;

public class MP3Controller implements Initializable{

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;
    @FXML
    private MenuItem fileMenuItem;
    @FXML
    private MenuItem dirMenuItem;
    @FXML
    private MenuItem closeMenuItem;
    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private MenuBar menu;

    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {


	}

}
