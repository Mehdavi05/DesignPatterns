package com.shujaat.fooditem;

import com.shujaat.packing.Packing;
import com.shujaat.packing.Wrapper;

public abstract class Burger implements Item {

	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
}