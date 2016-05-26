package com.shujaat.factory;

import com.shujaat.shape.Circle;
import com.shujaat.shape.Rectangle;
import com.shujaat.shape.Shape;
import com.shujaat.shape.Square;

public class ShapeFactory {
	//use getShape method to get object of type shape 
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }

}
