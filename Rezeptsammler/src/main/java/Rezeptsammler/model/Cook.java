package Rezeptsammler.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cook {
    @Id
    @GeneratedValue
    private long id;

    private String forname;
    private String prename;
    private int stars;

    @OneToMany(mappedBy = "cook",cascade = CascadeType.ALL)
    private List<Recipe> recipes;

    public Cook(long id, String forname, String prename, int stars, List<Recipe> recipes) {
        this.id = id;
        this.forname = forname;
        this.prename = prename;
        this.stars = stars;
        this.recipes = recipes;
    }
}
