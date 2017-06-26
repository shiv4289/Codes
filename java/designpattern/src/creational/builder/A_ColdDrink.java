package creational.builder;

public abstract class A_ColdDrink implements I_Item {
	@Override
	public I_Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
