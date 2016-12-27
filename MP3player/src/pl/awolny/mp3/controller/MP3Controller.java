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

    public Button getNextButton() {
		return nextButton;
	}

	public void setNextButton(Button nextButton) {
		this.nextButton = nextButton;
	}

	public Slider getVolumeSlider() {
		return volumeSlider;
	}

	public void setVolumeSlider(Slider volumeSlider) {
		this.volumeSlider = volumeSlider;
	}

	public Slider getSongSlider() {
		return songSlider;
	}

	public void setSongSlider(Slider songSlider) {
		this.songSlider = songSlider;
	}

	public MenuItem getFileMenuItem() {
		return fileMenuItem;
	}

	public void setFileMenuItem(MenuItem fileMenuItem) {
		this.fileMenuItem = fileMenuItem;
	}

	public MenuItem getDirMenuItem() {
		return dirMenuItem;
	}

	public void setDirMenuItem(MenuItem dirMenuItem) {
		this.dirMenuItem = dirMenuItem;
	}

	public MenuItem getCloseMenuItem() {
		return closeMenuItem;
	}

	public void setCloseMenuItem(MenuItem closeMenuItem) {
		this.closeMenuItem = closeMenuItem;
	}

	public MenuItem getAboutMenuItem() {
		return aboutMenuItem;
	}

	public void setAboutMenuItem(MenuItem aboutMenuItem) {
		this.aboutMenuItem = aboutMenuItem;
	}

	public TableView<?> getContentTable() {
		return contentTable;
	}

	public void setContentTable(TableView<?> contentTable) {
		this.contentTable = contentTable;
	}

	public MenuBar getMenu() {
		return menu;
	}

	public void setMenu(MenuBar menu) {
		this.menu = menu;
	}

	public Button getPrevButton() {
		return prevButton;
	}

	public void setPrevButton(Button prevButton) {
		this.prevButton = prevButton;
	}

	public ToggleButton getPlayButton() {
		return playButton;
	}

	public void setPlayButton(ToggleButton playButton) {
		this.playButton = playButton;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
}