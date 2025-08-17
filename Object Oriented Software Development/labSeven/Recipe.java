//Student ID: C00305107
//Date: 28/01/2025
package labSeven;

public class Recipe {
    private String name;
    private boolean dairy;
    private boolean meat;
    private boolean gluten;

    // This is the constructor
    public Recipe(String name, boolean dairy, boolean meat, boolean gluten) {
        this.name = name;
        this.dairy = dairy;
        this.meat = meat;
        this.gluten = gluten;
    }

    // This is the getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasDairy() {
        return dairy;
    }

    public boolean hasMeat() {
        return meat;
    }

    public boolean hasGluten() {
        return gluten;
    }
}
