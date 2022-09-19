package Kitchen;
import java.util.ArrayList;

public abstract class Chef {
    /**
     Returns true if it is possible to make at least one dish with food from the refrigerator, otherwise false.
     */
    public static boolean whatFoodCanMade() {
        System.out.println("Dishes that can be made with food from the refrigerator:\n");
        var atLeastOne = false;
        for (var recipe : Store.getCookBook().values()) {
            var possible = canItMade(recipe);
            if (possible) {
                System.out.println("    " + recipe.getId() + ". " + recipe.getRecipeName());
                atLeastOne = true;
            }
        }
        if (!atLeastOne) {
            System.out.println("    Nije moguce napraviti ni jedno jelo!\n");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Which dishes (half portions) from the cookbook with recipes can be made
     * with food from the refrigerator.
     * Returns true if it's possible to make at least one dish, otherwise false.
     * @return
     */
    public static boolean whatHalfFoodCanMade() {
        System.out.println("Jela (pola porcije) koje je moguce napraviti sa namirnicama iz frizidera:\n");
        var atLeastOne = false;
        var scaledRecipes = new ArrayList<Recipe>();

        // skalira sve recepte za 50% i dodaje u listu skaliranih recepata.
        for (var recipe : Store.getCookBook().values()){
            scaledRecipes.add(recipe.getScaledRecipe(50));
        }

        for (var recipe : scaledRecipes) {
            var possible = canItMade(recipe);
            if (possible) {
                System.out.println("    " + recipe.getId() + ". " + recipe.getRecipeName());
                atLeastOne = true;
            }
        }
        if (!atLeastOne) {
            System.out.println("    It is not possible to prepare any dish!\n");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checks whether it is possible to make a dish for the entered recipe.
     * Returns true if possible or false if not possible
     * @param recipe
     * @return
     */
    public static boolean canItMade(Recipe recipe) {
        for (var ingredient : recipe.getRecipeIngredients().values()) {
            var key = ingredient.getId();
            // proverava da li namirnica iz recepta postoji u frizideru
            if (Fridge.isInFridge(key)) {
                var ingredientInFridge = Fridge.getIngredientsInFridge().get(key);

                // proverava da li je kolicina namirnice u frizideru dovoljna za zadati recept
                if (ingredient.getWeight() > ingredientInFridge.getWeight()) {
                    // vraca false ako nema dovoljna kolicina namirnice u frizideru
                    return false;
                }
            } else {
                // vraca false ako namirnice iz recepta nema u frizideru
                return false;
            }
        }
        // ako prodje kroz sve namirnice iz recepta i ne vrati false,
        // znaci da je moguce napraviti jelo i vraca true
        return true;
    }

    /**
     * Prepares a meal by taking food from the refrigerator and following the recipe.
     * Returns true if the dish was successfully created or false if not.
     * @param recipe
     * @return
     */
    public static boolean makeFood(Recipe recipe) {
        if (canItMade(recipe)) {
            for (var ingredient : recipe.getRecipeIngredients().values()) {
                Fridge.takeFromFridge(ingredient);
            }
            System.out.println("    Uspesno ste napravili " + recipe.getRecipeName() + "! Prijatno, uzivajte!\n");
            return true;
        } else {
            System.out.println("    U frizideru nema dovoljno namirnica da bi se napravilo navedeno jelo!\n");
            return false;
        }
    }
}
