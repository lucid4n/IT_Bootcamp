package Kitchen;

public class Application {
    public static void main(String[] args) {

        // Starter pack of ingredients and recipes
        Store.openStore();

        int userInput;
        boolean flag = true;

        while (flag) {
            Menu.menu();
            userInput = User.mainMenuChose(0, 11);
            switch (userInput) {
                case 1:
                    // Add to the Fridge
                    flag = Menu.addInFridge();
                    break;
                case 2:
                    // Remove from the Fridge
                    flag = Menu.removeFromFridge();
                    break;
                case 3:
                    // What foods may be made using items from the Fridge?
                    flag = Menu.whatFoodCanMade();
                    break;
                case 4:
                    // What Food (half) can make with item from fridge?
                    flag = Menu.whatHalfFoodCanMade();
                    break;
                case 5:
                    // Made chosen food
                    flag = Menu.madeFood();
                    break;
                case 6:
                    // What food can make with entered money
                    flag = Menu.availableFood();
                    break;
                case 7:
                    // View of recipe by difficulty
                    flag = Menu.viewRecipeByDifficulty();
                    break;
                case 8:
                    // What dishes from a particular category may be made using the given funds
                    flag = Menu.availableFoodFromCategory();
                    break;
                case 9:
                    // Sort recipe by level
                    flag = Menu.sortRecipeByLevel();
                    break;
                case 10:
                    // Sort recipe by price
                    flag = Menu.sortRecipeByPrice();
                    break;
                case 11:
                    // Favorite recipes by users
                    flag = Menu.favoriteRecipe();
                    break;
                case 0:
                    // Leave app
                    flag = false;
                    break;
                default:
                    System.out.println("\nWrong entry! Try again!");
            }
            System.out.println("\nThank you for using our services! Have a nice day!");
        }

    }
}
