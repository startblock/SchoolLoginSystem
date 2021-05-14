package com.Nigel.View;

import com.Nigel.Controller.BaseController;
import com.Nigel.Controller.DashboardPage;
import com.Nigel.Controller.loginPage;
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

    public void DashboardWindow(){
        BaseController controller = new DashboardPage(this, "DashboardWindow.fxml");
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
