package creational.builder;

class BuilderPatternDemo {
	public static void main(String args[]){
		MealBuilder mBuilder = new MealBuilder();
		Meal vegMeal = mBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost());

		Meal nonVegMeal = mBuilder.prepareNonVegMeal();
		System.out.println("Nob-veg meal");
		nonVegMeal.showItems();
		System.out.println("Total cost: " + nonVegMeal.getCost());
	}
}
