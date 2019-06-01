import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class GraphicsDisplay extends Application
{
	HBox root;
	Scene scene;
	
	@Override
	public void start(Stage primaryStage)
	{
		createScene(primaryStage, 400, 400);
		
		Line line = drawLine(primaryStage, 0, 0, 50, 50, 2, new Color(0.1, 0.6, 0.1, 1));
		Rectangle rect = drawRect(primaryStage, 50, 50, 20, 30, 2, new Color(0.5, 0.4, 0.6, 1));
		Circle circle = drawCircle(primaryStage, 50, 50, 20, 2, new Color(0.8, 0.6, 0.2, 1));
		Ellipse ellipse = drawEllipse(primaryStage, 50, 50, 30, 15, 2, new Color(0.1, 0.2, 0.44, 1));
		
		addShape(line);
		addShape(rect);
		addShape(circle);
		addShape(ellipse);
	}
	
	public Line drawLine(Stage stage, double startX, double startY, double endX, double endY, double width, Color colour)
	{
		Line line = new Line(startX, startY, endX, endY);
		line.setStrokeWidth(width);
		line.setStroke(colour);
		
		return line;
	}
	
	public Rectangle drawRect(Stage stage, double x, double y, double width, double height, double thiccness, Color colour)
	{
		Rectangle rect = new Rectangle(x, y, width, height);
		rect.setStrokeWidth(thiccness);
		rect.setFill(colour);
		
		return rect;
	}
	
	public Circle drawCircle(Stage stage, double centreX, double centreY, double radius, double thiccness, Color colour)
	{
		Circle circle = new Circle(centreX, centreY, radius, colour);
		circle.setStrokeWidth(thiccness);
		
		return circle;
	}
	
	public Ellipse drawEllipse(Stage stage, double centreX, double centreY, double radiusX, double radiusY, double thiccness, Color colour)
	{
		Ellipse ellipse = new Ellipse(centreX, centreY, radiusX, radiusY);
		ellipse.setStrokeWidth(thiccness);
		ellipse.setFill(colour);
		
		return ellipse;
	}
	
	public void createScene(Stage stage, int x, int y)
	{
		root = new HBox();
		root.setAlignment(Pos.CENTER);
        
        scene = new Scene(root, x, y);
        stage.setScene(scene);
        stage.show();
	}
	
	public void addShape(Shape shape)
	{
        root.getChildren().add(shape);
	}
	
	public static void main(String[] args)
	{  
        // Should never be reached
		launch(args);  
    }
}
