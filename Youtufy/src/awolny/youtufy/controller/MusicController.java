package awolny.youtufy.controller;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class MusicController implements Initializable {

    @FXML
    private Button nextButton;

    @FXML
    private Button playButton;

    @FXML
    private Slider volumeSlider;

    public Button getNextButton() {
		return nextButton;
	}

	public void setNextButton(Button nextButton) {
		this.nextButton = nextButton;
	}

	public Button getPlayButton() {
		return playButton;
	}

	public void setPlayButton(Button playButton) {
		this.playButton = playButton;
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

	public void setResultTableView(TableView<String> resultTableView) {
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

	public void setHistoryListView(ListView<String> historyListView) {
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
    private TableView<String> resultTableView;

    @FXML
    private WebView videoWebView;

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<String> historyListView;

    @FXML
    private Button prevButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		configureButtons();
		configureSearch();
	}
	 private void configureButtons() {
	        // dodanie akcji przycisku dla playButton
	        playButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {

	                if (playButton.isFocused()) {
	                    System.out.println("Play");
	                } else {
	                    System.out.println("Stop");
	                }
	            }
	        });

	        // dodanie akcji dla previous i next
	        prevButton.setOnAction(x -> System.out.println("Previous"));

	        nextButton.setOnAction(x -> System.out.println("Next"));
	    }
	 private void configureSearch() {
	     // dodajemy zdarzenie do pola tekstowego
	     // klasa anonimowa, poniewa¿ jest nieco rozbudowane
		 searchTextField.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {

	            @Override
	            public void handle(KeyEvent event) {

	                String searchQuery = searchTextField.getText();
	                ObservableList<String> historyList = historyListView.getItems();

	                if (event.getCode().equals(KeyCode.ENTER)) {

	                    if (historyList.isEmpty() || !historyList.get(0).equals(searchQuery)) {
	                        historyList.add(0, searchQuery);
	                    }
	                }
	            }
	    });
	}
}