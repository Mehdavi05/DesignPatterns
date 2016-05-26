package com.shujaat.fooditem;

import com.shujaat.packing.Bottle;
import com.shujaat.packing.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}