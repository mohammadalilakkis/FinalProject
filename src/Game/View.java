package Game;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileNotFoundException;
public class View extends Group {
    final static double CELL_WIDTH = 105;
    private int rowCount ;
    private int columnCount ;
    private Image ground;
    private Image limit ;
    private Image archer ;
    private Image images;
    private Image ArenaTower;
    private Model model = new Model();
    private ImageView [][] cells;
    public View() throws FileNotFoundException {
        this.ground = new Image("Game/ground.jpg");
        this.limit = new Image("Game/limit.png");
        this.archer = new Image("Game/new archer.gif");
        this.images =new Image("Game/images.jpg");
        this.ArenaTower=new Image("Game/arena tower.jpg");

        //this.king = new Image("Game/king.jpg");
        initialize();
        // cells[0][0].setImage(image);
    }

    public void initialize (){
        System.out.println("initializing");
        rowCount = 7;
        columnCount = 20 ;
        cells = new ImageView[rowCount][columnCount];

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                ImageView imageView = new ImageView();
                imageView.setX(column * CELL_WIDTH);
                imageView.setY(row * CELL_WIDTH);
                imageView.setFitWidth(CELL_WIDTH);
                imageView.setFitHeight(CELL_WIDTH);
                cells[row][column] = imageView;
                this.getChildren().add(imageView);
            }
        }
    }

    public void update(Model model) {
        System.out.println("updating");
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Model.CellValue value = model.getCellValue(row,column);
                System.out.println(value);
                if (value == Model.CellValue.GROUND) {
                    cells[row][column].setImage(ground);
                } else if (value == Model.CellValue.LIMIT) {
                    cells[row][column].setImage(limit);
                }
                else if (value == Model.CellValue.ARCHER) {
                    cells[row][column].setImage(archer);
                }
                else if (value == Model.CellValue.KING) {
                    cells[row][column].setImage(images);
                }
                else if (value == Model.CellValue.ARENATOWER) {
                    cells[row][column].setImage(ArenaTower);
                    //ImageView imageView = new ImageView();
                    //imageView.setImage(new Image("/Game/fireBall.png"));
                    //StackPane container = new StackPane();
                    //container.getChildren().addAll(cells[row][column],imageView);
                }
            }
        }
    }
}
