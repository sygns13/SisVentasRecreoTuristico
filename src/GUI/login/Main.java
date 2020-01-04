package GUI.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {

    private double xOffset = 0, yOffset= 0;
    public static String ICON_PATH = "/GUI/images/icon.png";

    @Override
    public void start(Stage miEscenario) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        /*primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

        Scene miEscena = new Scene(root);
        miEscenario.setTitle("Bienvenidos al Sistema");
        miEscenario.setScene(miEscena);
        root.requestFocus();



       /* miEscenario.initStyle(StageStyle.TRANSPARENT);

        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        //move around here
        root.setOnMouseDragged(event -> {
            miEscenario.setX(event.getScreenX()-xOffset);
            miEscenario.setY(event.getScreenY()-yOffset);
        });*/


         miEscenario.getIcons().add(new Image(getClass().getResourceAsStream(ICON_PATH)));

        //miEscenario.resizableProperty().setValue(Boolean.FALSE);
       // miEscenario.initStyle(StageStyle.UNDECORATED);
        miEscenario.setResizable(false);
        miEscenario.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
