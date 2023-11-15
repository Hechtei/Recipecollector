package Rezeptsammler.DTO;

import Rezeptsammler.model.Prep;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RecipeDTO {

    private long id;

    private String title;

    private String description;

    private PrepDTO preparation;

    private double rating;

    private int kcal;

    private boolean vegetarian;

    private boolean vegan;

    public RecipeDTO(String title, String description, double rating, int kcal, boolean vegetarian, boolean vegan) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.kcal = kcal;
        this.vegetarian = vegetarian;
        this.vegan = vegan;
    }
}
