package Rezeptsammler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String unit;

    private int amount;

    @ManyToMany(mappedBy = "ingredients",cascade = CascadeType.ALL)
    private List<Prep> prep;

    public Ingredient(String name, String unit, int amount) {
        this.name = name;
        this.unit = unit;
        this.amount = amount;
    }
}
