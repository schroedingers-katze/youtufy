package awolny.youtufy.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class MainController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    @FXML
    private MenuPaneController menuPaneController;

    @FXML
    private SearchPaneController searchPaneController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(searchPaneController);
		System.out.println(menuPaneController);
		System.out.println(controlPaneController);
		System.out.println(contentPaneController);

	}
}