//Student ID: C00305107
//Date: 28/01/2025
package labSeven;

public class RecipeTest {
    public static void main(String[] args) {
        Recipe[] recipes = new Recipe[4];
        recipes[0] = new Recipe("Cake", true, false, true);
        recipes[1] = new Recipe("Salad", false, false, false);
        recipes[2] = new Recipe("Burger", false, true, false);
        recipes[3] = new Recipe("Pasta", true, false, true);
        
        // This prints the Vegan recipes
        System.out.println("Vegetarian Recipes:");
        isVegetarian(recipes);
        
        // This prints the Vegan recipes
        System.out.println("Vegan Recipes:");
        isVegan(recipes);
    }
    
    // This is the isVegetarian method
    public static void isVegetarian(Recipe[] recipes) {
        for (Recipe recipe : recipes) {
            if (!recipe.hasMeat()) {
                System.out.println(recipe.getName());
            }
        }
    }
    
    // This is the isVegan method
    public static void isVegan(Recipe[] recipes) {
        for (Recipe recipe : recipes) {
            if (!recipe.hasMeat() && !recipe.hasDairy()) {
                System.out.println(recipe.getName());
            }
        }
    }
}