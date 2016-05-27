package com.shujaat.facade;

import com.shujaat.shape.Circle;
import com.shujaat.shape.Rectangle;
import com.shujaat.shape.Shape;
import com.shujaat.shape.Square;

public class ShapeMaker 
{
	 private Shape circle;
	 private Shape rectangle;
     private Shape square;
     
     public ShapeMaker() 
     {
    	 circle    = new Circle();
	     rectangle = new Rectangle();
	     square    = new Square();
	}
	 public void drawCircle()
	 {
	      circle.draw();
	   }
	 
	   public void drawRectangle()
	   {
	      rectangle.draw();
	   }
	   
	   public void drawSquare()
	   {
	      square.draw();
	}
}
