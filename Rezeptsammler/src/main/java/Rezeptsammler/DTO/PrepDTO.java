package Rezeptsammler.DTO;

import Rezeptsammler.model.Ingredient;
import Rezeptsammler.model.Recipe;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PrepDTO {

    private long id;

    private int portions;

    private String complexity;

    private String execution;

    public PrepDTO(long id, int portions, String complexity, String execution) {
        this.id = id;
        this.portions = portions;
        this.complexity = complexity;
        this.execution = execution;
    }

    @JsonIgnore
    private List<IngredientDTO> ingredients;

}
