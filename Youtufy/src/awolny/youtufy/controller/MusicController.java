package awolny.youtufy.controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

public class MusicController implements Initializable {

    @FXML
    private Button nextButton;

    @FXML
    private Button playtButton;

    @FXML
    private Slider volumeSlider;

    public Button getNextButton() {
		return nextButton;
	}

	public void setNextButton(Button nextButton) {
		this.nextButton = nextButton;
	}

	public Button getPlaytButton() {
		return playtButton;
	}

	public void setPlaytButton(Button playtButton) {
		this.playtButton = playtButton;
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

	public TableView<?> getResultTableView() {
		return resultTableView;
	}

	public void setResultTableView(TableView<?> resultTableView) {
		this.resultTableView = resultTableView;
	}

	public WebView getVideoWebView() {
		return videoWebView;
	}

	public void setVideoWebView(WebView videoWebView) {
		this.videoWebView = videoWebView;
	}

	public TextField getSearchTextField() {
		return searchTextField;
	}

	public void setSearchTextField(TextField searchTextField) {
		this.searchTextField = searchTextField;
	}

	public ListView<?> getHistoryListView() {
		return historyListView;
	}

	public void setHistoryListView(ListView<?> historyListView) {
		this.historyListView = historyListView;
	}

	public Button getPrevButton() {
		return prevButton;
	}

	public void setPrevButton(Button prevButton) {
		this.prevButton = prevButton;
	}

	@FXML
    private Slider songSlider;

    @FXML
    private TableView<?> resultTableView;

    @FXML
    private WebView videoWebView;

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<?> historyListView;

    @FXML
    private Button prevButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}