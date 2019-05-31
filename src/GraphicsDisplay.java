import javafx.application.Application;
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
	@Override
	public void start(Stage primaryStage)
	{
		//drawLine(primaryStage, 0, 0, 50, 50, 2, new Color(0.5, 0.6, 0.4, 1));
		//drawRect(primaryStage, 50, 50, 20, 30, 2, new Color(0.5, 0.6, 0.4, 1));
		//drawCircle(primaryStage, 50, 50, 20, 2, new Color(0.5, 0.6, 0.4, 1));
		drawEllipse(primaryStage, 50, 50, 20, 10, 2, new Color(0.5, 0.6, 0.4, 1));
	}
	
	public void drawLine(Stage stage, double startX, double startY, double endX, double endY, double width, Color colour)
	{
		Line line = new Line(startX, startY, endX, endY);
		line.setStrokeWidth(width);
		line.setStroke(colour);
		
		createScene(stage, line);
	}
	
	public void drawRect(Stage stage, double X, double Y, double width, double height, double thiccness, Color colour)
	{
		Rectangle rect = new Rectangle(X, Y, width, height);
		rect.setStrokeWidth(thiccness);
		rect.setFill(colour);
		
		createScene(stage, rect);
	}
	
	public void drawCircle(Stage stage, double centreX, double centreY, double radius, double thiccness, Color colour)
	{
		Circle circle = new Circle(centreX, centreY, radius, colour);
		circle.setStrokeWidth(thiccness);
		
		createScene(stage, circle);
	}
	
	public void drawEllipse(Stage stage, double centreX, double centreY, double radiusX, double radiusY, double thiccness, Color colour)
	{
		Ellipse ellipse = new Ellipse(centreX, centreY, radiusX, radiusY);
		ellipse.setStrokeWidth(thiccness);
		ellipse.setFill(colour);
		
		createScene(stage, ellipse);
	}
	
	public void createScene(Stage stage, Shape shape)
	{
		HBox root = new HBox();
        root.getChildren().add(shape);
        
        Scene scene = new Scene(root, 200, 100);
        stage.setScene(scene);
        stage.show();
	}
	
	public static void main(String[] args)
	{  
        // Should never be reached
		launch(args);  
    }
}
