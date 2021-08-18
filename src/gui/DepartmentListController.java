package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable {
	 
	// Bot�es do Department
	@FXML
	private TableView<Department> tableViewDepartmnet;
	
	@FXML
	private TableColumn<Department, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Department, String> tableColumnName;
	
	@FXML
	private Button btNew;
	
	// Fu��es para dar a��o ao clicar nos bot�es
	@FXML
	public void onBtNewAction() {
		System.out.println("onBtNewAction");
	}
 
	@Override
	public void initialize(URL url, ResourceBundle rb) {	
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		// Fazer o Department acompanhar a altura da janela principal
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewDepartmnet.prefHeightProperty().bind(stage.heightProperty());	
	}
}
