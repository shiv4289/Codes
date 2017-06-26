package creational.builder;

public abstract class A_Burger implements I_Item {

	@Override
	public I_Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
