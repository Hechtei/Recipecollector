package Rezeptsammler.DTO;

import Rezeptsammler.model.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CookDTO {
    private long id;

    private String forname;
    private String prename;
    private int stars;

    private List<Recipe> recipes;

    public CookDTO(long id, String forname, String prename, int stars, List<Recipe> recipes) {
        this.id = id;
        this.forname = forname;
        this.prename = prename;
        this.stars = stars;
        this.recipes = recipes;
    }
}
