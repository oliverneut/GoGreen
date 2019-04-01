package client.controllers;

import client.Application;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import objects.Activity;
import objects.ActivityListResponse;
import objects.Friend;
import objects.FriendListResponse;

import java.io.IOException;
import java.util.LinkedList;

public class MainController {

    @FXML
    private JFXListView<Label> mylistview;

    @FXML
    private TableView<Friend> friendTable;

    @FXML
    private JFXTextField tffriendmail;

    @FXML
    private TableView<Activity> tableview;

    @FXML
    private TableColumn activityColumn1;

    @FXML
    private TableColumn activityColumn2;

    @FXML
    private TableColumn activityColumn3;

    @FXML
    private TableColumn activityColumn4;

    @FXML
    private TableColumn friendColumn;

    @FXML
    private TableColumn friendco2Column;

    @FXML
    private ProgressBar food_bar;

    @FXML
    private ProgressBar public_transport_bar;

    @FXML
    private ProgressBar energy_bar;

    @FXML
    private Label treeNumber;



    @FXML
    void clickedList(MouseEvent event) {

        //---------------------------------------------------------------

        //mylistview.getItems().add(new Label("Item"));
       //Application.addActivity(1, "VEGMEAL");

        //--------------------------------------------------------------




    }

    @FXML
    void pressPlusButton(MouseEvent event) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Activity.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();

        stage.setScene(new Scene(root));

    }

    @FXML
    void friendButton(MouseEvent event) {
        String email = tffriendmail.getText();
        boolean response = Application.addFriend(email);
        displayFriends();
        if (response == true) {
            System.out.println(response);
        } else {
            System.out.println(response);
        }
    }

    @FXML
    void displayFriends() {
        FriendListResponse response = Application.showFriends();
        if (response.isFriendsListSuccess() == false) {
            return;
        }
        friendColumn.setCellValueFactory(new PropertyValueFactory<Friend, String>("email"));
        friendco2Column.setCellValueFactory(new PropertyValueFactory<Friend, Float>("totalCO2"));
        LinkedList<Friend> friendlist = response.getFriends();
        ObservableList<Friend> list = FXCollections.observableList(friendlist);
        friendTable.setItems(list);
    }

    @FXML
    void displayActivity() {
        activityColumn1.setCellValueFactory(new PropertyValueFactory<Activity, String>("activity"));
        activityColumn2.setCellValueFactory(new PropertyValueFactory<Activity, Integer>("amount"));
        activityColumn3.setCellValueFactory(new PropertyValueFactory<Activity, String>("time"));
        activityColumn4.setCellValueFactory(new PropertyValueFactory<Activity, Float>("co2Amount"));
        ActivityListResponse data = Application.getActivities();
        LinkedList<Activity> list = data.getActivities();
        ObservableList<Activity> observableList = FXCollections.observableList(list);
        tableview.setItems(observableList);
    }

    private

    @FXML
    void displayAchievements(){
        float sumFood = Application.calculateFood();
        float foodRatio = sumFood/21770; // 21770 is the amount of CO2 a 10 trees consume over a century
        food_bar.setProgress(foodRatio);

        float sumPubTransport = Application.calculatePubTransport();
        float pubTransportRatio = sumPubTransport/21770; // 21770 is the amount of CO2 a 10 trees consume over a century
        public_transport_bar.setProgress(pubTransportRatio);

        float sumEnergy = Application.calculateEnergy();
        float energyRatio = sumEnergy/21770; // 21770 is the amount of CO2 a 10 trees consume over a century
        energy_bar.setProgress(energyRatio);

        Integer savedTrees = Application.calculateSavedTrees();
        String res = savedTrees.toString();
        treeNumber.setText(res);
    }



}