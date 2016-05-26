package com.shujaat.mealbuilder;

import com.shujaat.fooditem.ChickenBurger;
import com.shujaat.fooditem.Coke;
import com.shujaat.fooditem.Pepsi;
import com.shujaat.fooditem.VegBurger;

public class MealBuilder {

	   public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
}
