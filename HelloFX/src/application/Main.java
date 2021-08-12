package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {//application is parent class, abstract method must be inherited, needs start method
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Parent src = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root, 300, 300, Color.WHITE);
			Image image = new Image("THN Icon.png");
			ImageView imageView = new ImageView(image); //for showing image inside stage
			imageView.setX(200);
			imageView.setY(100);
			root.getChildren().add(imageView);
			Text text = new Text("Hello World");
			text.setX(50);
			text.setY(50);
			text.setFont(Font.font("Verdana", 30));
			text.setFill(Color.GREEN);
			root.getChildren().add(text);
			
			Circle circle = new Circle();
			circle.setCenterX(100);
			circle.setCenterY(350);
			circle.setRadius(100);
			root.getChildren().add(circle);
			circle.setFill(Color.BLUE);
			
			Line line = new Line();
			line.setStartX(200);
			line.setStartY(200);
			line.setEndX(500);
			line.setEndY(500);
			line.setStrokeWidth(5);
			line.setOpacity(0.5);
			line.setStroke(Color.RED);
			root.getChildren().add(line);
			
			Rectangle rectangle = new Rectangle();
			rectangle.setX(100);
			rectangle.setY(100);
			rectangle.setWidth(100);
			rectangle.setHeight(100);
			root.getChildren().add(rectangle);
			//rectangle.setFill(color)
			//rectangle.setStrokeWidth(x) also setStroke(color) to color border
			
			Polygon triangle = new Polygon();
			triangle.getPoints().setAll(200.0, 200.0, 300.0, 300.0, 200.0, 300.0);
			root.getChildren().add(triangle);
			
			
			
			
			
			primaryStage.setTitle("Stage Demo");//changes title in header
			primaryStage.setScene(scene); //create root node to arrange different components
			primaryStage.getIcons().add(image); //sets img in src folder as icon in header
			//stage.setResizable(bool) --> for locking dimensions
			//stage.setFullScreen(bool)
			primaryStage.show(); //makes it visible to user
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);//static method that belongs to app class, since main is child, it inherits it
	}
}
