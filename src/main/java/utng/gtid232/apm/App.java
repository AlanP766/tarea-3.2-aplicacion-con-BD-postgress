package utng.gtid232.apm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utng.gtid232.apm.conexion.ConexionBD;

import java.io.IOException;

public class App extends Application {

    private static Scene escena;

    @Override
    public void start(Stage stage) throws Exception {
        // Carga la vista inicial
        Parent raiz = loadFXML("menu_principal");
        escena = new Scene(raiz, 1150, 720);
        
        // Hoja de estilos CSS
        escena.getStylesheets().add(getClass().getResource("/utng/gtid232/apm/css/estilos.css").toExternalForm());

        stage.setTitle("Sistema de Auditoría de Igualdad Laboral y No Discriminación - UTNG");
        stage.setScene(escena);
        stage.setMinWidth(1000);
        stage.setMinHeight(650);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        escena.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/utng/gtid232/apm/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    @Override
    public void stop() {
        ConexionBD.cerrar();
    }

    public static void main(String[] args) {
        launch(args);
    }
}