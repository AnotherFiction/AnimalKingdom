package demo.animals;

import demo.food.Food;

public interface Animal <T extends Food>{

	void eat(T food);
}
