package com.example.friendbookver1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.List;

public class HelloController {
    @FXML
    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetStatus;
    public ListView friendList = new ListView<Friend>();
    public Label namef;
    public Label agef;
    public Label statusf;

    public void makeFriend(ActionEvent actionEvent) {

        Friend friend = new Friend(textGetName.getText(), Integer.parseInt(textGetAge.getText()), textGetStatus.getText());

        friendList.getItems().add(friend);
        textGetAge.clear();
        textGetName.clear();
        textGetStatus.clear();

    }


    public void displayFriend(MouseEvent mouseEvent) {
        Friend friend;
        friend = (Friend) friendList.getSelectionModel().getSelectedItem();
        namef.setText(friend.getName());
        agef.setText(String.valueOf(friend.getAge()));
        statusf.setText(friend.getStatus());
    }

    public void killFriend(ActionEvent actionEvent) {
        Friend friend;
        friend = (Friend) friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(friend);


    }
}