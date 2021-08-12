package application;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	@FXML //injects stuff from fxml file
	private Circle myCircle;
	private double x, y;
	
	public void up()
	{
		//System.out.println("UP");
		myCircle.setCenterY(y-=10);
	}
	
	public void down()
	{
		//System.out.println("DOWN");
		myCircle.setCenterY(y+=10);
	}
	
	public void left()
	{
		//System.out.println("LEFT");
		myCircle.setCenterX(x-=10);
	}
	
	public void right()
	{
		//System.out.println("RIGHT");
		myCircle.setCenterX(x+=10);
	}
}
