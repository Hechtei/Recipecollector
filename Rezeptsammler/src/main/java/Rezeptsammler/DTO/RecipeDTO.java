package Rezeptsammler.DTO;

import Rezeptsammler.model.Cook;
import Rezeptsammler.model.Prep;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class RecipeDTO {

    private long id;

    @NotBlank
    private String title;

    private Cook cook;

    private String description;

    private PrepDTO preparation;

    private double rating;

    private int kcal;

    private boolean vegetarian;

    private boolean vegan;

    public RecipeDTO(long id, String title, String description, PrepDTO preparation, double rating, int kcal, boolean vegetarian, boolean vegan) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.preparation = preparation;
        this.rating = rating;
        this.kcal = kcal;
        this.vegetarian = vegetarian;
        this.vegan = vegan;
    }
}
