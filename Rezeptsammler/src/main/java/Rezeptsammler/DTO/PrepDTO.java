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



    @JsonIgnore
    private List<IngredientDTO> ingredients;

}
