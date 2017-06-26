package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<I_Item> items = new ArrayList<I_Item>();

	public void addItem(I_Item item){
		items.add(item);
	}

	public float getCost(){
		float cost = 0.0f;
		for(I_Item item: items)
			cost+= item.price();
		return cost;
	}

	public void showItems(){
		for(I_Item item : items){
			System.out.print("Item: " + item.name());
			System.out.print(", Packing: " + item.packing().pack());
			System.out.println(", Price " + item.price());
		}
	}
}
