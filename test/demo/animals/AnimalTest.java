package demo.animals;

import org.junit.Before;
import org.junit.Test;

import demo.food.Food;
import demo.food.Meat;
import demo.food.Vegetables;

public class AnimalTest {

	final Carnivore lion = new Carnivore();
	final Animal tiger = new Carnivore();

	final Food vegetables = new Vegetables();
	final Meat meat = new Meat();

	@Before
	public void setUp() {

	}

	@Test
	public void lionEatsMeat() {
		lion.eat(meat);
	}

	@Test(expected=ClassCastException.class)
	public void tigerDoesNotEatVegetables() {
		tiger.eat(vegetables);
	}
}
