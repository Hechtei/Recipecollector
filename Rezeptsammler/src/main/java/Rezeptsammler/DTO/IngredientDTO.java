package Rezeptsammler.DTO;

import Rezeptsammler.model.Prep;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class IngredientDTO {

    private long id;

    private String name;

    private String unit;

    private int amount;

    public IngredientDTO(long id, String name, String unit, int amount) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.amount = amount;
    }
}
