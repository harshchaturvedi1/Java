```java
interface Meal{
    void cook();
}

class VeganMeal implements Meal{
    @Override
    public void cook(){
        System.out.println("Cooking Vegan Meal");
    }
}
class NonVeganMeal implements Meal{
    @Override
    public void cook(){
        System.out.println("Cooking NonVegan Meal");
    }
}
class GlutenFreeMeal implements Meal{
    @Override
    public void cook(){
        System.out.println("Cooking GlutenFree Meal");
    }
}
class KetoMeal implements Meal{
    @Override
    public void cook(){
        System.out.println("Cooking Keto Meal");
    }
}

class MealFactory{
    public static Meal getMeal(String type){
        switch(type){
            case "Vegan":
                return new VeganMeal();
            case "NonVegan":
                return new NonVeganMeal();
            case "GlutenFree":
                return new GlutenFreeMeal();
            case "Keto":
                return new KetoMeal();
            default:
                throw new IllegalArgumentException("Unknown meal type");
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        Meal vegan = MealFactory.getMeal("Vegan");
        vegan.cook();

        Meal nonVegan = MealFactory.getMeal("NonVegan");
        nonVegan.cook();

        Meal glutenFree = MealFactory.getMeal("GlutenFree");
        glutenFree.cook();

        Meal ketoMeal = MealFactory.getMeal("Keto");
        ketoMeal.cook();
    }
}
```
