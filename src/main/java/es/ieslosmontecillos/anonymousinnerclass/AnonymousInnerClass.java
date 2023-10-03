package es.ieslosmontecillos.anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AnonymousInnerClass extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Botones
        HBox hbox = new HBox();
        hbox.setSpacing(5);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));
        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");

        //Añadimos los botones al hbox
        hbox.getChildren().addAll(btnNew,btnOpen,btnSave,btnPrint);

        //AnonymousInnerClass

        //Boton NEW
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Nuevo proceso");
            }
        });

        //Boton OPEN
        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Abrir proceso");
            }
        });

        //Boton Save
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Guardar Proceso");
            }
        });

        //Boton Print
        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Imrpimir Proceso");
            }
        });

        //Escena
        Scene scene = new Scene(hbox, 250, 100);
        stage.setScene(scene);
        stage.setTitle("AnonymousInnerClass");

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}