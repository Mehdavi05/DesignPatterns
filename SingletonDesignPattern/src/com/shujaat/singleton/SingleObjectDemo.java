package com.shujaat.singleton;

public class SingleObjectDemo {

	public static void main(String[] args) {
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	      
	      
	      SingleObject object2 = SingleObject.getInstance();
	      object2.showMessage("Shujaat");
	}

}
