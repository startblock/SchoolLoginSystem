package com.Nigel.View;

import com.Nigel.Controller.*;
import com.Nigel.Model.UserAccount;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PageFactory {
    Stage stage;

    public Stage getStage() {
        return stage;
    }

    public void mainLogWindow() {
        BaseController controller = new LoginPage(this, "loginPage.fxml");
        fxmlLoaderMethod(controller);
    }

    public void makeAccountWindow(UserAccount account){
        BaseController controller =new AdminDashboardPage(this,"NewAccountWindow.fxml",account);
        fxmlLoaderMethodNewScene(controller,stage);
    }

    public void StudentDashboardWindow(UserAccount account){
        BaseController controller = new StudentDashboardPage(this, "StudentDashboardWindow.fxml",account);
        fxmlLoaderMethod(controller);
        

    }
    public void TeacherDashboardWindow(UserAccount account){
        BaseController controller = new TeacherDashboardPage(this, "TeacherDashboardWindow.fxml",account);
        fxmlLoaderMethod(controller);

    }

    public void AdminDashboardWindow(UserAccount account){
        BaseController controller = new AdminDashboardPage(this, "AdminDashboardWindow.fxml",account);
        fxmlLoaderMethod(controller);


    }

    private void fxmlLoaderMethod(BaseController controller){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlString()));
        fxmlLoader.setController(controller);
        Parent parent;
        try {
            parent = fxmlLoader.load();

        }catch (IOException e){
            e.printStackTrace();
            return;
        }
        Scene scene= new Scene(parent);
        Stage stage = new Stage();

        //   CAREFUL

        this.stage=stage;

        // ===========



        stage.setScene(scene);
        stage.show();
    }

    private void fxmlLoaderMethodNewScene(BaseController controller,Stage stage){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlString()));
        fxmlLoader.setController(controller);
        Parent parent;
        try {
            parent = fxmlLoader.load();

        }catch (IOException e){
            e.printStackTrace();
            return;
        }
        Scene scene= new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void StageCloser(Stage stageToClose){
        stageToClose.close();
    }

}
