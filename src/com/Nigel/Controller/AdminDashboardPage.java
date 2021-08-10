package com.Nigel.Controller;

/*
    This class is responsible for the control of the admin dashboard
    is the primary page for admin users to undertake their tasks

 */
import com.Nigel.Model.*;
import com.Nigel.View.PageFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashboardPage extends BaseController implements Initializable  {

    AdminAccount account;

    @FXML
    private Label Bulletin;

    @FXML
    private TextField getUserID,getUserName,getUserPass,nameString,bulletinString;

    @FXML
    private Button MakeNewAccount, SetNewBulletin,RemoveAccount,EditAccount,logOut, updateAcc;

    @FXML
    private ChoiceBox<AccountType> accountType;

    @FXML
    private PasswordField newAccPass;

    public AdminDashboardPage(PageFactory pageFactory, String fxmlString, UserAccount user) {
        super(pageFactory, fxmlString, user);
        account=(AdminAccount) user;
    }

    @FXML
    void MakeNewAccount() {
    }

    @FXML
    void SetNewBulletin(){
        setBulletin(bulletinString.getText());
        System.out.println(getBulletin());

    }

    @FXML
    void createOnClick() {

        int newIdNo=0;

//
        try{
        switch (accountType.getValue()){
            case ADMIN:
                UserAccount newAdAcc= new AdminAccount(nameString.getText(),newAccPass.getText());
                newIdNo=newAdAcc.getID();
                break;

            case STUDENT:
                UserAccount newStudentAcc= new StudentAccount(nameString.getText(),newAccPass.getText());
                newIdNo=newStudentAcc.getID();
                break;
            case TEACHER:
                UserAccount newTeacherAcc= new TeacherAccount(nameString.getText(),newAccPass.getText());
                newIdNo=newTeacherAcc.getID();
                break;

        }
        }
        catch (NullPointerException e){
            System.out.println("..............................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>!!!!!!!!!!!!!!!");
            e.printStackTrace();

            setErrorMessage("testing qrlo");
            System.out.println(errorMessage);
            System.out.println(getErrorMessage());
            pageFactory.makeErrorWindow();

        }

        System.out.println(newIdNo);

    }
    @FXML
    void updateAccount(){

        UserAccount user =UserDatabaseMap.getUserFromMap(Integer.parseInt(getUserID.getText()));

        if(!getUserName.getText().isBlank()){
            user.setName(getUserName.getText());

        }
        else if (!getUserPass.getText().isBlank()){
            user.setPassword(getUserPass.getText());

        }
        System.out.println(user.getName());

//        switch (user.getAccountType()){
//            case ADMIN:
//                if(!getUserName.getText().isBlank()){
//                    user.setName(getUserName.getText());
//
//                }
//                else if (!getUserPass.getText().isBlank()){
//                    user.setPassword(getUserPass.getText());
//
//                }
//                break;
//            case STUDENT:
//                if(!getUserName.getText().isBlank()){
//                    user.setName(getUserName.getText());
//
//                }
//                else if (!getUserPass.getText().isBlank()){
//                    user.setPassword(getUserPass.getText());
//
//                }
//                break;
//            case TEACHER:



//        }
        /// to be continued
    }

    @FXML
    void logOut1() {           // log's user out of account and returns to log in page

        logOutFunction(pageFactory.getStage());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //initializes gui
        accountType.getItems().add(AccountType.ADMIN);
        accountType.getItems().add(AccountType.TEACHER);
        accountType.getItems().add(AccountType.STUDENT);

        Bulletin.setText(getBulletin());

    }

}
