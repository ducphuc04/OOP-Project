package App;

import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class HelloController {
    @FXML
    private Hyperlink forgotPassword;

    @FXML
    private Button si_loginBtn;

    @FXML
    private AnchorPane si_loginForm;

    @FXML
    private PasswordField si_password;

    @FXML
    private TextField si_username;

    @FXML
    private Button site_aldreadyHave;

    @FXML
    private Button site_createBtn;

    @FXML
    private AnchorPane site_form;

    @FXML
    private PasswordField su_answer;

    @FXML
    private PasswordField su_password;

    @FXML
    private ComboBox<?> su_question;

    @FXML
    private Button su_signupBtn;

    @FXML
    private AnchorPane su_signupForm;

    @FXML
    private TextField su_username;

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;

    private String[] questionList = {"What is your favorite color?", "What is your favourite food?", "What is your last 4 numbers of your number?"};
    public void regLquestionList(){
        List<String> listQ = new ArrayList<>();
        for(String data: questionList){
            listQ.add(data);
        }
        ObservableList listData = FXCollections.observableArrayList(listQ);
        su_question.setItems(listData);
    }
    public void switchform(ActionEvent event)
    {
        TranslateTransition slider = new TranslateTransition();
        if(event.getSource() == site_createBtn)
        {
            slider.setNode(site_form);
//            slider.setToX(300);
            slider.setDuration(Duration.seconds(0.5));
            slider.setOnFinished((ActionEvent e) ->{
                site_aldreadyHave.setVisible(true);
                site_createBtn.setVisible(false);
                su_signupForm.setVisible(true);
                si_loginForm.setVisible(false);

                regLquestionList();
            });

            slider.play();
        }else if(event.getSource() == site_aldreadyHave)
        {
            slider.setNode(site_form);
//            slider.setToX(0);
            slider.setDuration(Duration.seconds(0.5));
            slider.setOnFinished((ActionEvent e) ->{
                site_aldreadyHave.setVisible(false);
                site_createBtn.setVisible(true);
                su_signupForm.setVisible(false);
                si_loginForm.setVisible(true);
            });

            slider.play();
        }
    }

//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//
//    }
}