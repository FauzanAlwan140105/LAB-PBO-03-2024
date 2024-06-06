package praktikum;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private String name;
    private String age;
    private String job;
    private String gender;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form Data Diri");
        showHomeScreen(primaryStage);
        primaryStage.show(); 
    }

    public void showHomeScreen(Stage primaryStage) {
        HomeScene homeScreen = new HomeScene(this);
        Scene scene = homeScreen.createHomeScreen(primaryStage);
        primaryStage.setScene(scene);
    }

    public void showProfileScreen(Stage primaryStage) {
        ProfileScene profileScene = new ProfileScene(this);
        Scene scene = profileScene.createProfileScene(primaryStage);
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}
