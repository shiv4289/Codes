package creational.builder;

public class ChickenBurger extends A_Burger{

	@Override
	public String name() {
		return " Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
