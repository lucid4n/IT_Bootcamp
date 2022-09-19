package Kitchen;

public abstract class Ingredient implements Priceable {

    private static int classId = 0;

    private String ingredientName;
    protected final int id;

    public Ingredient(String ingredientName) {
        this.ingredientName = ingredientName;
        this.id = classId++;
    }

    public Ingredient(Ingredient ingredient) {
        this.id = ingredient.id;
        this.ingredientName = ingredient.ingredientName;
    }

    public int getId() {
        return id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
