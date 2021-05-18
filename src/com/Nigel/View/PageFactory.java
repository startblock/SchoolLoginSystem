package com.Nigel.View;

import com.Nigel.Controller.BaseController;
import com.Nigel.Controller.StudentDashboardPage;
import com.Nigel.Controller.loginPage;
import com.Nigel.Model.UserAccount;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PageFactory {

    public void mainLogWindow() {
        BaseController controller = new loginPage(this, "loginPage.fxml");
        fxmlLoaderMethod(controller);
    }

    public void StudentDashboardWindow(UserAccount account){
        BaseController controller = new StudentDashboardPage(this, "StudentDashboardWindow.fxml",account);
        fxmlLoaderMethod(controller);
        

    }
    public void TeacherDashboardWindow(UserAccount account){
        BaseController controller = new StudentDashboardPage(this, "TeacherDashboardWindow.fxml",account);
        fxmlLoaderMethod(controller);

    }

    public void AdminDashboardWindow(UserAccount account){
        BaseController controller = new StudentDashboardPage(this, "AdminDashboardWindow.fxml",account);
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
        stage.setScene(scene);
        stage.show();
    }
    public void StageCloser(Stage stageToClose){
        stageToClose.close();
    }

}
