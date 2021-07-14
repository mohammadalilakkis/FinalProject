package Game;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label scoreLabel;
    @FXML private Label levelLabel;
    @FXML private Label gameOverLabel;
    @FXML private View gameView;

    public void initialize() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("controller orking");
        Model pacManModel = new Model();
        this.gameView.update(pacManModel);
    }


}
